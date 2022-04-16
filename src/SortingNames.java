import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingNames {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Pragati","Dibya","Barsha");
        List<String> result = strList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
