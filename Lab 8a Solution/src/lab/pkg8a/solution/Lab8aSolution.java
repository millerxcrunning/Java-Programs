package lab.pkg8a.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab8aSolution {
    
    public static ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();

    public static void main(String[] args) {
        
        final int size = 1000000;
        
        ArrayList<Double> list1 = new ArrayList<>(size);
        for (int i=0; i<size; i++) {
            list1.add(Math.random());
        }
        
        ArrayList<Double> list2 = new ArrayList<>(size);
        for (int i=0; i<size; i++) {
            list2.add(Math.random());
        }
        
        ArrayList<Double> list3 = new ArrayList<>(size);
        for (int i=0; i<size; i++) {
            list3.add(Math.random());
        }
        
        ArrayList<Double> list1copy1 = new ArrayList<>(list1);
        ArrayList<Double> list2copy1 = new ArrayList<>(list2);
        ArrayList<Double> list3copy1 = new ArrayList<>(list3);
        
        ArrayList<Double> list1copy2 = new ArrayList<>(list1);
        ArrayList<Double> list2copy2 = new ArrayList<>(list2);
        ArrayList<Double> list3copy2 = new ArrayList<>(list3);
        
        ArrayList<Double> list1copy3 = new ArrayList<>(list1);
        ArrayList<Double> list2copy3 = new ArrayList<>(list2);
        ArrayList<Double> list3copy3 = new ArrayList<>(list3);
        
        long time = 0;
        
        try {
            time = new Lab8aSolution().sort(list1, list2, list3);
        } catch (InterruptedException ex) {
            Logger.getLogger(Lab8aSolution.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(Lab8aSolution.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Sorting took " + time + " ms");
        
        try {
            time = new Lab8aSolution().sortWithExecutors(list1copy1, list2copy1, list3copy1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Lab8aSolution.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(Lab8aSolution.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Sorting with Executors took " + time + " ms");
        
        try {
            time = new Lab8aSolution().sortWithThreads(list1copy2, list2copy2, list3copy2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Lab8aSolution.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(Lab8aSolution.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Sorting with threads took " + time + " ms");
        
        long time2 = System.currentTimeMillis();
        SortList1 run = new SortList1(list1copy3);
        Thread sortList1 = new Thread(run);
        sortList1.start();
        SortList1 run2 = new SortList1(list2copy3);
        Thread sortList2 = new Thread(run2);
        sortList2.start();
        SortList1 run3 = new SortList1(list3copy3);
        Thread sortList3 = new Thread(run3);
        sortList3.start();
        try {
            sortList1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Lab8aSolution.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            sortList2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Lab8aSolution.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            sortList3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Lab8aSolution.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Sorting with threads in seperate class took " + (System.currentTimeMillis() - time2) + " ms");
    }
    
    public long sortWithExecutors(ArrayList<Double> list1copy1, ArrayList<Double> list2copy1, 
            ArrayList<Double> list3copy1) throws InterruptedException, ExecutionException {
        
        /*I think creating the Futures makes the threads happen sequentially
        If I were not to call future1.get() future2.get(), and future3.get(),
        they will all three get started and then immediately end the method sort,
        not having finished yet. If after calling all three newCachedThreadPools
        I called newCachedThreadPool.shutdown, and then measured the time difference
        between there and before calling the newCachedThreadPools, I believe it 
        would measure the time it took to start all three, not finish all three.
        This does not fulfill the requirements of measuring how long it would 
        take to sort three different lists on three different threads. 
        */

        System.out.println("Sorting with Executors: ");
        
        long startTime = System.currentTimeMillis();
        
        Future future1 = newCachedThreadPool.submit(new Callable()
        {
            public Object call() throws Exception 
            {
                long beginning = System.currentTimeMillis();
                Collections.sort(list1copy1);
                System.out.println("\t Sorting list1");
                return System.currentTimeMillis() - beginning;
            }
        });
        
        System.out.println("\t Sorting first list took " + future1.get());
        
        Future future2 = newCachedThreadPool.submit(new Callable()
        {
            public Object call() throws Exception 
            {
                long beginning = System.currentTimeMillis();
                Collections.sort(list2copy1);
                System.out.println("\t Sorting list2");
                return System.currentTimeMillis() - beginning;
            }
        });
        
        System.out.println("\t Sorting second list took " + future2.get());
        
        Future future3 = newCachedThreadPool.submit(new Callable()
        {
            public Object call() throws Exception 
            {
                long beginning = System.currentTimeMillis();
                Collections.sort(list3copy1);
                System.out.println("\t Sorting list3");
                return System.currentTimeMillis() - beginning;
            }
        });
        
        System.out.println("\t Sorting third list took " + future3.get());
        
        //Collections.sort(list1);
        //Collections.sort(list2);
        //Collections.sort(list3);

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
    
    public long sort(ArrayList<Double> list1, ArrayList<Double> list2, 
            ArrayList<Double> list3) throws InterruptedException, ExecutionException {
        
        long startTime = System.currentTimeMillis();
        
        Collections.sort(list1);
        Collections.sort(list2);
        Collections.sort(list3);

        long endTime = System.currentTimeMillis();
        
        return endTime - startTime;
        
    }
    
    public long sortWithThreads(ArrayList<Double> list1copy2, ArrayList<Double> list2copy2, 
            ArrayList<Double> list3copy2) throws InterruptedException, ExecutionException {
        
        long startTime = System.currentTimeMillis();
        
        Runnable sortList1 = new Runnable(){

            public void run(){
                Collections.sort(list1copy2);
            }
        };
        
        Runnable sortList2 = new Runnable(){

            public void run(){
                Collections.sort(list2copy2);            
            }
        };
        
        Runnable sortList3 = new Runnable(){

            public void run(){
                Collections.sort(list3copy2);
            }
        };

        Thread thread1 = new Thread(sortList1);
        Thread thread2 = new Thread(sortList2);
        Thread thread3 = new Thread(sortList3);
        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();
        long endTime = System.currentTimeMillis();
        
        return endTime - startTime;
        
    }
    
}

