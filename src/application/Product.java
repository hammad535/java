package application;


public class Product{

    
    String productid; 
    String type; 
    String quantity;
    String name;
    
    // Constructor
    public Product(String productid,String type,String name,  String quantity, boolean delivery){
        this.productid = productid;
        this.type = type;
        this.quantity = quantity;
        this.name = name;
    }

    // Getters and Setters
    public String getProductId(){
        return this.productid;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public void setQuantity(String quantity){
        this.quantity = quantity;
    }

    public String getQuantity(){
        return this.quantity;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return (this.getName() + this.getQuantity());
    }

} // end of class