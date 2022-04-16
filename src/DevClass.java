import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class DevClass {
    //private static String myMessage = "Update Successful";
    private static List<String> strList = Arrays.asList("adam","john","lilly");

    public static int printMessage(List<String> strList){

        //String msg = message.toUpperCase();
        String result = strList.stream()
                .collect(Collectors.joining());

        return result.length();
    }
    public static void main(String[] args) {
        System.out.println("This is a new class on Dev Branch");
        System.out.println("The total number of characters in list :"+printMessage(strList));
        strList.sort(Comparator.reverseOrder());
        strList.forEach(s -> System.out.println(s));
    }
}
