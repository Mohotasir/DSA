import java.util.Scanner;
public class UapBazar{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Product[] prdt = new Product[10];

        while(true)
        {
            System.out.println("select one option from menu:");
            System.out.println("1.Add new product to the system\n 2.Update the price of a specific product\n 3.View the discounted price of a specific product\n 4.View the details of a specific product\n 5.View the list of products with their details\n 6.exit");
            System.out.println("enter option");
            int option = scn.nextInt();
            if(option==1){
                System.out.println("enter product name:");
                String name = scn.next();
                System.out.println("enter product id:");
                String id = scn.next();
                System.out.println("enter product category:");
                String category = scn.next();
                System.out.println("enter product price:");
                double price = scn.nextDouble();

                for(int i=0;i<prdt.length;i++){
                    if(prdt[i]==null){
                        prdt[i]= new Product(name,id,category,price);
                        break;
                     }
                }
            }
            else if(option==2){
                System.out.print("enter id:");
                String id = scn.next();
                System.out.println("enter update price:");
                double nwPrice = scn.nextDouble();
              for(int i=0;i<prdt.length;i++){

                if(prdt[i]==null) break;

                if(id.equals(prdt[i].id)){
                   prdt[i].updatePrice(nwPrice);
                }
              }

            }else if(option==3){
                System.out.print("enter id:");
                String id = scn.next();
                System.out.println("enter discount percentage:");
                double discount = (scn.nextDouble())/100;
                
              for(int i=0;i<prdt.length;i++){

                if(prdt[i]==null) break;

                if(id.equals(prdt[i].id)){
                  System.out.println( "discount price:" +prdt[i].getDiscountedPrice(discount));
                }
              } 
            }else if(option==4){
                System.out.print("enter id:");
                String id = scn.next();
              for(int i=0;i<prdt.length;i++){

                if(prdt[i]==null) break;

                if(id.equals(prdt[i].id)){
                   prdt[i].display();
                }
             } 
            }else if(option==5){
                for(int i=0;i< prdt.length;i++){

                 if(prdt[i]==null) break;

                   prdt[i].display();
                
             }  
            }else if(option==6){
                break;
            }

        }
        scn.close();
        
    }
}