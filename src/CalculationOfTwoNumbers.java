public class CalculationOfTwoNumbers {
    public static String addition(int a ,int b){
        return "The addition of two numbers is : "+(a+b);
    }
    public static String multiplication(int a,int b){
        return "The multiplication of two numbers is : "+(a*b);
    }
    public static void main(String[] args) {
        System.out.println(addition(100,200));
        System.out.println(multiplication(10,20));
    }
}
