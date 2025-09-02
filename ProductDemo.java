 //write a java program to create a product class and declare the states as productName,price,gst%,discount,quantity create 5 objects and initialize the variables using object reference and print the values for each object
        
package day2;

class Product
{
    
    String productName;
    double price;
    double gstPercent;
    double discount;
    int quantity;
}
public class ProductDemo
{
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
       

      
        p1.productName = "Laptop";
        p1.price = 50000;
        p1.gstPercent = 18;
        p1.discount = 10;
        p1.quantity = 2;

        p2.productName = "Mobile";
        p2.price = 20000;
        p2.gstPercent = 12;
        p2.discount = 5;
        p2.quantity = 5;

        p3.productName = "Headphones";
        p3.price = 1500;
        p3.gstPercent = 18;
        p3.discount = 15;
        p3.quantity = 10;

        System.out.println(p1.productName="hello");
        System.out.println(p1.price);
        System.out.println(p1.gstPercent);
        System.out.println(p1.discount);
        System.out.println(p1.quantity);
        System.out.println("................................................................");

        System.out.println(p2.productName);
        System.out.println(p2.price);
        System.out.println(p2.gstPercent);
        System.out.println(p2.discount);
        System.out.println(p2.quantity);
         System.out.println("................................................................");

        System.out.println(p3.productName);
        System.out.println(p3.price);
        System.out.println(p3.gstPercent);
        System.out.println(p3.discount);
        System.out.println(p3.quantity);

    }
}
