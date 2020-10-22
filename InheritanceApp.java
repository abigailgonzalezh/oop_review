//Textual representation of how an object will look like in the memory
//Whatever we write in class is actually the property of an object as we are describing the object
//If you want anything which should belong to class make it static
class Product {

    //Attribute (State)
    private int produdct_id;

    String name;

    int price;

    //Constructor
    Product() {

        System.out.println("Product Object Constructed!");

    }
    
    //Methods (Behavior)
    //To write data in Product Object we have this Method
    void setProductDetails(int product_id, String name, int price) {

        this.produdct_id = product_id;

        this.name = name;

        this.price = price;

        System.out.println("Data written in Product Object!");
    }
    
    //To read data from Product Object
    void showProductDetails() {

        System.out.println("Product ID: " + produdct_id);

        System.out.println("Name: " + name);

        System.out.println("Price: " + price);

    }
    
    //Setter
    void setProductID(int product_id) {

        this.produdct_id = product_id; //reference to current object
    }

    //Getter
    int getProductId() {

        return produdct_id;

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
        
        product2.setProductID(8);
        
        product2.name = "Pokemon Shield";
        
        product2.price = 1100;

        product2.showProductDetails();

    }
}