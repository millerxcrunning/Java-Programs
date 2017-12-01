package lab.pkg.lab8b;

import java.util.ArrayDeque;
import java.util.Queue;

class OrderQueue {
    
    private Queue<Task> orders;
    private boolean moreOrdersComing;
    private int size;
    
    public OrderQueue() {
        orders = new ArrayDeque<>();
        moreOrdersComing = true;
        this.size = 0;
    }
    
    public synchronized void createTask(String label, int timeToComplete) {
        while(!(this.size < 5)) {
        try {
            wait();
        } catch (InterruptedException e) {}
        }
        notifyAll();
        orders.offer(new Task(label, timeToComplete));
        
    }
    
    public synchronized Task acceptTask() {
        while (orders.isEmpty()) 
        {
            try 
            {
            wait();
            } catch (InterruptedException e) {}
        }
        
        this.size--;
        notifyAll();
        
        return orders.poll();
    }
    
    public void setNoMoreOrders() {
        moreOrdersComing = false;
    }
    
    public boolean weAreDone() {
        return orders.isEmpty() && !moreOrdersComing;
    }
}
