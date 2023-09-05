package store;
import java.util.ArrayList;

public class Shop {
   
    ArrayList<Item> itm  = new ArrayList<Item>();
    String name;
    public Shop(String name){
        this.name = name;
        
    }
    private Item findItem(String id){
        for(Item I :itm){
            if(I.id.equals(id)){
                return I;
            }
        }
        return null;
    }
    public void addItem(String name, String id, String category, double price,int count){
         Item I = findItem(id);
         if(I != null){
            I.setQuantity(I.getQuantity()+count);

         }else{
            itm.add(new Item(name,id,category,price,count));
         }

    }
    public void viewItem(String id){
        Item I = findItem(id);
        if(I !=null){
            System.out.println(I);
        }else{
            System.out.println("Item not found");
        }
    }
    public void viewItems(){
        for(Item i : itm){
            System.out.println(i);
        }
    }
    public void sellAnItem(String id, int quantity){
        Item I = findItem(id);
        if(I !=null){
            I.setQuantity(I.getQuantity() - quantity); 
        }else{
            System.out.println("Item is not found");
        }
    }
    public double getSalePriceOfAnItem(String id, double saleAmount){
        Item I = findItem(id);
        if(I !=null){
           return I.getSalePrice(saleAmount); 
        }else{
            System.out.println("Item not found");
            return -1;
        }
    }

}