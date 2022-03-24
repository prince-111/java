abstract class Demos{  //abstract class  
 
 //abstract method declaration  
 abstract void display();  
}  
public class Demo extends Demos {    

  //method impelmentation  
 void display() {  

   System.out.println("Abstract method?");  
 }  
 public static void main(String args[]) {  
 
  //creating object of abstract class  
   Demos obj = new Demo();  
   //invoking abstract method  
   obj.display();  
  }  
}  