public class InstanceMethod{
    public static void main(String[] args){
        //creating an object of the class
        InstanceMethod obj = new InstanceMethod();
        //invoking instance method
        System.out.println("the sum is: " + obj.add(9,6));
    }
    int s;
    // user-defined method because we have not used static keyword
    public int add (int a, int b){
        s = a+b;
        //returning the sum

        return s;
    }
}