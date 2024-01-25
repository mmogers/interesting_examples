import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 Фильтрация

 Фильтрация — это процесс выбора элементов из коллекции,
 удовлетворяющих определенному критерию.
 Фильтрация является одной из базовых операций при работе с коллекциями
 и позволяет легко извлекать нужные элементы.

 В Java фильтрация может быть выполнена с использованием метода filter()
 из класса java.util.stream.Stream.
 Метод filter() принимает предикат (функцию, которая возвращает true или false
 в зависимости от того, удовлетворяет ли элемент критерию)
 и возвращает новый Stream, содержащий только те элементы,
 которые удовлетворяют критерию.
 */
public class Filtration {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("apple");
        words.add("ad");
        words.add("is");
        words.add("awesome");

        //filter words, leaving only those starting from a
        List<String> filteredWords = words.stream()
                .filter(el -> el.startsWith("a"))
                .collect(Collectors.toList());

       //filtered list
        for(String word : filteredWords){
            System.out.println(word);
        }
    }
}
