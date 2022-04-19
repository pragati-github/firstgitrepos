public class CalculationOfTwoNumbers {
    public static String addition(int a ,int b){
        return "The addition of two numbers is : "+(a+b);
    }
    public static String multiplication(int a,int b){
        return "The multiplication of two numbers is : "+(a*b);
    }
    public static String division(int a,int b){
        try {
            System.out.println("Two given numbers are : "+a+" and "+b);
            return "The division of two numbers is : "+(a/b);
        }
        catch (ArithmeticException e){
            throw new ArithmeticException("Please provide a number which is greater than 0");
        }
    }
    public static void main(String[] args) {
        System.out.println(addition(100,200));
        System.out.println(multiplication(10,20));
        System.out.println(division(10,2));
    }
}
