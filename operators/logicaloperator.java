public class logicaloperator {
    
    public static void main(String args[]){

        // && (AND) operator.
        System.out.println((5>3) && (8>5)); // true
        System.out.println((5>3) && (8<5)); // false

        // || (OR) operator.
        System.out.println((9<7) || (10>8)); // true
        System.out.println((9>7) || (10<8)); //true.
        System.out.println((9<7) || (10<8)); //flase

        // ! operator.
        System.out.println(!(9==7)); //true
        System.out.println(!(5>3)); //false
        
    }
}
