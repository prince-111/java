//create first class 
public class Animal {
    
    // method 1.
    public void eat(){
        System.out.println("i am eating");
    }

    public static void main(String[] args){  // main method.
        System.out.println("1");

        Animal buzo= new Animal(); //create object.
        buzo.eat(); // eat method call.
        buzo.run(); // run method call.
         
        Birds sp = new Birds();//create object of birds.
        sp.fly();  // method call.

        // Animal aa=new Animal();  // create a 2nd object.
        // aa.run();
        // aa.eat();
    }

    // method 2.
    public void run(){
        System.out.println("i am runnig");
    }
}

// create 2nd class
class Birds{
    void fly(){  // method 3.
        System.out.println("i am flying");
    }
}

