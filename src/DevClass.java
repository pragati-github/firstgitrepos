import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DevClass {
    private static String myMessage = "Updated Successfully";
    //private static List<String> strList = Arrays.asList("adam","john","lilly");

    public static String printMessage(String message){

        String msg = message.toUpperCase();
        /*String result = strList.stream()
                .collect(Collectors.joining());*/

        return msg;
    }
    public static void main(String[] args) {
        System.out.println("This is a new class on Dev Branch");
        System.out.println(printMessage(myMessage));
    }
}
