public class Unaryoperator {
    public static void main(String[] args){
        
        // int x=10;

    // x++ (post-increment) ++x(pre-increment)
       // Example 1:
        // System.out.println(x++); //10
        // System.out.println(++x); //12
        // System.out.println(x--); //12
        // System.out.println(--x); //10 

       //Example 2:
    //    int a=10;
    //    int b=12;
    //    System.out.println(a++ + ++a); //10 +12=22
    //    System.out.println(b++ + ++b); //12 +14=26

       // Example ~ and !
           int a=13;
           int b= -17;
           boolean c=true;
           boolean d=false;
           System.out.println(~a); // -14 (minus of total positive value which start from 0)
           System.out.println(~b); // 16 (positive of total minus, positive starts from 0)
           System.out.println(!c); //false (opposite of boolean value)
           System.out.println(!d); //true
    }
}
