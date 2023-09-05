import java.util.Scanner;
public class UAPHr{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Employee[] emplye = new Employee[10];

        while(true)
        {
            System.out.println("select one option from menu:");
            System.out.println("1.Add new employee to the system\n 2.Update the salary of an Employee\n 3.View the salary of an Employee\n 4.View the details of an Employee\n 5. View the list of employees with their details.\n 6.exit");
            System.out.println("enter option");
            int option = scn.nextInt();
            if(option==1){
                System.out.println("enter employee name:");
                String name = scn.next();
                System.out.println("enter employee id:");
                String id = scn.next();
                System.out.println("enter designation:");
                String des = scn.next();
                System.out.println("enter salary :");
                double salray = scn.nextDouble();

                for(int i=0;i<emplye.length;i++){
                    if(emplye[i]==null){
                        emplye[i]= new Employee(name,id,des,salray);
                        break;
                     }
                }
            }
            else if(option==2){
                System.out.print("enter id:");
                String id = scn.next();
                System.out.println("enter update salary:");
                double newsalary = scn.nextDouble();
              for(int i=0;i<emplye.length;i++){

                if(emplye[i]==null) break;

                if(id.equals(emplye[i].id)){
                   emplye[i].updatesalary(newsalary);
                }
              }

            }else if(option==3){
                System.out.print("enter id:");
                String id = scn.next();
                
              for(int i=0;i<emplye.length;i++){

                if(emplye[i]==null) break;

                if(id.equals(emplye[i].id)){
                  System.out.println("salary:" + emplye[i].getsalary());
                }
              } 
            }else if(option==4){
                System.out.print("enter id:");
                String id = scn.next();
              for(int i=0;i<emplye.length;i++){

                if(emplye[i]==null) break;

                if(id.equals(emplye[i].id)){
                   emplye[i].display();

                }
             } 
            }else if(option==5){
                for(int i=0;i<emplye.length;i++){

                 if(emplye[i]==null) break;
                   System.out.print("Employee no"+ i);
                   emplye[i].display();
                
             }  
            }else if(option==6){
                break;
            }

        }
        scn.close();
        
    }
} 
    

