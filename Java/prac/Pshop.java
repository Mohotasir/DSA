package prac;

import java.util.ArrayList;

import store.Item;

public class Pshop {
    ArrayList<PItem> pitm = new ArrayList<PItem>();
    String name;
    public Pshop(String name){
        this.name = name;
    }
    private PItem srcItem(String id){
         for(PItem x :pitm){
                if(x.id.equals(id)){
                    return x;
                }
         }
         return null;
    }
    public void addItem(String name, String id, String category, double price,int cnt){
           PItem I = srcItem(id);
           if(I != null){
              I.setQuantity(I.getQuantity()+ cnt);
           }else{
             pitm.add(new PItem(name,id,category,price,cnt));
           }

    }

}
