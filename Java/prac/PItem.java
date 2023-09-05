package prac;

public class PItem {
    String id;
    private String name , category;
    private double price;
    private int quantity;
    
    public PItem(String name ,String id ,String category , double price, int cnt)
    {
        this.id  =  id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = cnt;
    }
    public void setName(String newName){
        name = newName;
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
        return String.format("name : %d ",name);
    }


}
