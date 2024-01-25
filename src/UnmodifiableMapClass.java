/**
 *
 unmodifiableMap

 UnmodifiableMap используется для создания неизменяемого представления отображения,
 это позволяет предоставить доступ к отображению,
 не давая возможности изменить его.

 Как видно из примера, при попытке изменить неизменяемое отображение
 unmodifiableMap выбрасывается исключение UnsupportedOperationException.
 Это гарантирует, что исходное отображение не будет случайно изменено.

 */

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UnmodifiableMapClass {
    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 3);

        //create an unmodofoable map based on original map
        Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(originalMap);

        //unmodifiableMap.put("D", 4); //throws UnsupportedOperationException

        System.out.println(unmodifiableMap); //{A=1, B=2, C=3}
    }
}
