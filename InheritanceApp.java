//Textual representation of how an object will look like in the memory
//Whatever we write in class is actually the property of an object as we are describing the object
//If you want anything which should belong to class make it static
class Product {

    //Attribute (State)
    int product_id;

    String name;

    int price;

    //Constructor
    Product() {

        System.out.println("Product Object Constructed!");

    }

    //Methods (Behavior)
    //To write data in Product Object we have this Method
    void setProductDetails(int product_id, String name, int price) {

        this.product_id = product_id;

        this.name = name;

        this.price = price;

        System.out.println("Data written in Product Object!");
    }

    //To read data from Product Object
    void showProductDetails() {

        System.out.println("Product ID: " + product_id);

        System.out.println("Name: " + name);

        System.out.println("Price: " + price);

    }

    //Setter
    void setProductID(int product_id) {

        this.product_id = product_id; //reference to current object
    }

    //Getter
    int getProductId() {

        return product_id;

    }
}

class Mobile extends Product { //child-parent relationship, mobile is a product, mobile is a child, product is a parent
    
    //Additional attributes
    String os;

    int ram;

    int sdCardSize;

    Mobile() {

        System.out.println("Mobile Object Cronstructed!");

    }
    
    //We have redifined the same method from the Parent into the Child with different inputs
    //We have now 2 methods in the child, 1 from Parent and 1 from Child
    //Overloading: same method name with different inputs
    void setProductDetails(int product_id, String name, int price, String os, int ram, int sdCardSize) {

        this.product_id = product_id;

        this.name = name;

        this.price = price;

        this.os = os;

        this.ram = ram;

        this.sdCardSize = sdCardSize;

        System.out.println("Data written in Product Object!");
    }
    
    //We have to redifen showProductDetails
    //2 methods, 1 from Parent and 1 from Child
    //This method will be executed and not the parent's one
    //Overriding: same method name with same inputs in parent child relationship
    void showProductDetails() {

        System.out.println("Product ID: " + product_id);

        System.out.println("Name: " + name);

        System.out.println("Price: " + price);

        System.out.println("OS: " + os);

        System.out.println("RAM: " + ram);

        System.out.println("SD Card Size: " + sdCardSize);

    }

}

public class InheritanceApp {

    public static void main(String[] args) {
        
        //Create an Object
        Product product = new Product();
        //product isn't an object it's a reference variable which holds the hash code of the object in hexadecimal notation

        //Writing data in the Object
        product.setProductDetails(4, "Nintendo Switch", 8000);

        //Reading data from object
        product.showProductDetails();

        System.out.println();

        //Write the data directly
        Product product2 = new Product();
        
        product2.product_id = 8;
        
        product2.name = "Pokemon Shield";
        
        product2.price = 1100;

        product2.showProductDetails();

        System.out.println();

        //Creating a Mobile
        //Requesting to get Mobile Object constructed
        Mobile mobile = new Mobile();
        //Product Object gets constructed before the Mobiel Object - Rule to Inheritance (Object to Object)

        mobile.setProductDetails(444, "Iphone 11", 8500, "iOs", 16, 32);
        mobile.showProductDetails();
    }
}