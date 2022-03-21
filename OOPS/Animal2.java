// 1.by using reference variable initialize object:
// public class Animal2 { // create class 
    
//     String color; // variable 1.
//     int age; // variable 2.
//     public static void main(String[] args ){ // main method create.
//         Animal2 buzo=new Animal2(); // create object.
//         buzo.color="black"; //by using referance varible 
//         buzo.age=10; //by using refferance variable.

//         System.out.println(buzo.color + " " + buzo.age);
//     }
// }

// 2.by using method initialize object:
class Animal2{ 
    String color;
    int age;
    // create method and pass two prameter string or int
    void initObj(String c, int a){  
        color=c;
        age=a;
    }
    void display(){ // method create
        System.out.println(color + " " + age);
    }

    public static void main(String[] args){
        Animal2 buzo = new Animal2(); // create object.
        buzo.initObj("black", 20); // call method 
        buzo.display(); // call method.
    }
}

// 3. by using constructor initialize object.
