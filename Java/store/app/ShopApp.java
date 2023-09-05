package store.app;
import java.util.Scanner;
import store.Shop;
public class ShopApp {
     public static void main(String[] args) {
         Shop str  = new Shop("Book shop");
         Scanner scn = new Scanner(System.in);
      while(true){
         System.out.println("enter one option from menu:");
         System.out.println("1.view all\n 2. view a specific item\n 3. add item\n 4. sell item\n 5.see sale price of an item\n 0.exit\n");
         int option = scn.nextInt();
         if(option ==1){
            str.viewItems();
            
         }else if(option == 2){
            System.out.print("enter id:");
            String id = scn.next();
            str.viewItem(id);
         }else if (option==3){
             System.out.println("enter name");
             String name = scn.next();
             System.out.println("enter id");
             String id = scn.next();
             System.out.println("enter category");
             String category= scn.next();
             System.out.println("enter price");
             double price = scn.nextDouble();
             System.out.println("enter count");
             int count = scn.nextInt();
             str.addItem(name,id,category,price,count);

         }else if(option == 4){
            System.out.print("enter id:");
            String id = scn.next();
            System.out.print("enter sell quantity:");
            int quantity= scn.nextInt();
            str.sellAnItem(id,quantity);
         }else if(option == 5){
            System.out.print("enter id:");
            String id = scn.next();
            System.out.print("enter sale amount:");
            double saleamount = scn.nextDouble();
            System.out.println("view sale amount : " + str.getSalePriceOfAnItem(id, saleamount));
         }else if(option==0){
             break;
         }
       }
       scn.close();
      }
}