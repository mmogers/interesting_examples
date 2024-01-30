import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CartesianProduct {
    public static void main(String[] args) {
        List<Integer> listA = Arrays.asList(1, 2, 3);
        List<String> listB = Arrays.asList("a", "b");

        List<List<Object>> cartesianProduct = new ArrayList<>();

        for (Integer i:listA) {
            for (String j:listB) {
                cartesianProduct.add(Arrays.asList(i, j));
            }
        }

        System.out.println(cartesianProduct); //{(1, a), (1, b), (2, a), (2, b), (3, a), (3, b)}
    }
}
