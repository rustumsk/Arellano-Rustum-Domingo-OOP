import java.util.Scanner;
class display{
   public static void main(String[] args){
      Student student = new Student();
   
      Scanner scan = new Scanner(System.in);
   
      System.out.print("Please enter first name: ");
      String fName = scan.next();
      student.setFirstName(fName);
   
      System.out.print("Please enter middle name: ");
      String mName = scan.next();
      student.setMiddleName(mName);
   
      System.out.print("Please enter last name: ");
      String lName = scan.next();
      student.setLastName(lName);
   
      System.out.print("Please enter suffix: ");
      String suffix = scan.next();
      student.setSuffix(suffix);
   
      System.out.println("First Name: " + student.getFirstName());
      System.out.println("Middle Name: "+student.getMiddleName());
      System.out.println("Last Name: "+student.getLastName());
      System.out.println("Suffix: "+student.getSuffix());
      System.out.println("Full Name: "+ student.getFullname());
     }
}
public class Student{
   String first_name;
   String middle_name;
   String last_name;
   String suffix;
   
   public Student(){
      
   }
   
   String getFirstName(){
      return this.first_name;
   }
   String getMiddleName(){
      return this.middle_name;
   }
   String getLastName(){
      return this.last_name;
   }
   String getSuffix(){
      return this.suffix;
   }
   String getFullname(){
      return getFirstName()+ " " + getMiddleName() + " " + getLastName() + " " + getSuffix();
   }
   void setFirstName(String first_name){
      this.first_name = first_name;
   }
   void setMiddleName(String middle_name){
      this.middle_name = middle_name;
   }
   void setLastName(String last_name){
      this.last_name = last_name;
   }
   void setSuffix(String suffix){
      this.suffix = suffix;
   }

}