public class Employee {
    
        String name,id,des;
        double salary;
    
        public Employee(String name ,String id ,String des, double salary){
            this.name = name;
            this.id = id;
            this.des = des;
            this.salary = salary;
        }
    
        void updatesalary(double newsalary){
              salary = newsalary;
        }
        double getsalary(){
            return salary;
        }
       
        void display(){
            System.out.println(this);
        }
        public String toString(){
            return String.format(": Name:%s Id:%s Designation:%s Salary:%f ",name,id,des,salary);
        }
    
    
}