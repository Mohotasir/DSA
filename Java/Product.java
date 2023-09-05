public class Product{
    String name,id,category;
    double price;

    public Product(String name,String id,String category,double price){
        this.name = name;
        this.id = id;
        this.category = category;
        this.price = price;
    }
    void updatePrice(double newPrice){
        price = newPrice;
    }
    double getPrice(){
        return price;
    }
    double getDiscountedPrice(double discountPercentage){
        return price *(1-discountPercentage);
    }
    void display(){
        System.out.println(this);
    }
    
    public String toString(){
        return String.format(": Name:%s Id:%s Category:%s Price:%f ",name,id,category,price);
    }
    

}