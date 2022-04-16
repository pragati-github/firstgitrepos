public class DevClass {
    private static String myMessage = "Update Successful";

    public static String printMessage(String message){
        return message;
    }
    public static void main(String[] args) {
        System.out.println("This is a new class on Dev Branch");
        System.out.println(printMessage(myMessage));
    }
}
