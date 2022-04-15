import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseOfInteger {
    public static void reverseOfIntList(List<Integer> integerList){
        integerList.sort(Comparator.reverseOrder());
        integerList.forEach(integer -> System.out.println(integer));
    }
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10,20,30,40,50);
        reverseOfIntList(intList);
    }
}
