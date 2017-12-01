package lab1b.starting.code;

public class Lab1bStartingCode {

    public static void main(String[] args) {
        //Created an array of 4 products
        Product[] products = new Product[4];

        //Created 2 necessary products and 2 luxury products and identified 
        //them as products
        Product p1 = new NecessaryProduct("steak", 8.50);
        Product p2 = new NecessaryProduct("milk", 3.00);
        Product p3 = new LuxuryProduct("movie", 10.50);
        Product p4 = new LuxuryProduct("dice", 2.50);
        
        //Added the products to the array
        products [0] = p1;
        products [1] = p2;
        products [2] = p3;
        products [3] = p4;
        
        //A double for running total
        double total = 0;
        
        //Lists out the products and keeps track of the overall total
        for (Product p : products) {
            System.out.println(p.toString());
            total += p.getTotalPrice();
        }
        
        //Prints out the overall total
        System.out.printf("\nThe total cost is $%.2f", total);
    }

}
