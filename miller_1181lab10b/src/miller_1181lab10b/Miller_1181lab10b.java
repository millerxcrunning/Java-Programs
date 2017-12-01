/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miller_1181lab10b;

/**
 *
 * @author Michael Miller
 */
public class Miller_1181lab10b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] test1 = {1, 0, -4, -6, 2, 10};
        Integer[] expected1 = {-6, -4, 0, 1, 2, 10};
        insertionSort(test1);
        // test is now {-6, -4, 0, 1, 2, 10}

        Assert.assertArrayEquals(test1, expected1);

        Student bob = new Student("Bob", 4.0);
        Student alice = new Student("Alice", 3.5);
        Student carol = new Student("Carol", 3.9);
        Student dave = new Student("Dave", 3.7);
        Student[] test2 = {bob, alice, carol, dave};
        Student[] expected2 = {alice, dave, carol, bob};

        insertionSort(test2);

        Assert.assertArrayEquals(test2, expected2);

        // assume Students are compared first on GPA and then on name
        // test is now {bob, dave, alice, carol}
    }
    public static <T extends Comparable<T>> void insertionSort(T[] array) 
	{
		int length = array.length;
		 
		for (int i = 1; i < length;i++) 
		{
			for( int j=i; j>=1; j--)
			{
				if( array[j-1].compareTo(array[j]) > 0 )
				{
					T temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}	
	 }

    class Student implements Comparable<Student> {

        String name;
        double GPA;

        public Student(String name, double GPA) {
            this.name = name;
            this.GPA = GPA;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getGPA() {
            return GPA;
        }

        public void setGPA(double gPA) {
            GPA = gPA;
        }

        public int compareTo(Student other) {
            if (GPA < other.getGPA()) {
                return -1;
            } else if (GPA > other.getGPA()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
//    public static void insertionSort(Comparable[] array) {
//
//        for (int i = 0; i != array.length; i = i++) {
//            Comparable insert = array[i];
//            int j = i;
//            
//            while (j != 0 && (array[j - 1].compareTo(insert) == 1))
//            {
//                array[j] = array[j - 1];
//                j = j - 1;
//            }
//            array[j] = insert;
//        }
//    }
}
