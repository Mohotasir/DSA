package store;
public class Item{
   String id;
   private  String name,category;
   private int quantity;
   private double price;

    public Item(String name, String id ,String category,double price ,int quantity ){
        this.name = name;
        this.id = id;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }
      
    public void setName(String newNm){
        name = newNm;
    }
    public String getName(){
        return name;
    }
    public void setId(String newid){
        id = newid;
    }
    public String getId(){
        return id;
    }
     public void setCategory(String newCategory){
        category= newCategory;
    }
    public String getCategory(){
        return category;
    }
     public void setQuantity(int newQuantity){
        quantity = newQuantity; 
    }
    public int getQuantity(){
        return quantity;
    }

    public double getSalePrice(double saleAmount){
        return (1-saleAmount)*price;
    }
    public String toString(){
       return String.format("Name:%s Id:%s category: %s quantity:%d Price:%f",name,id,category,quantity,price);
    }


}