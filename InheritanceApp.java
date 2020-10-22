class Product {

    //Attribute (State)
    int produdct_id;

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

    }
    
    //To read data from Product Object
    void showProductDetails() {
        
        System.out.println("Product ID: " + produdct_id);

        System.out.println("Name: " + name);

        System.out.println("Price: " + price);

    }
}