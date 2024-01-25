import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * В чем отличия между TreeSet и HashSet?
 *
 * Основное отличие между TreeSet и HashSet заключается в том,
 * что TreeSet хранит элементы в отсортированном порядке,
 * в то время как порядок хранения элементов в HashSet не определен.
 * TreeSet также обеспечивает быстрый поиск и извлечение элементов
 * в отсортированном порядке.
 *
 * Основное отличие, что в treeSet данные хранятся в дереве, а в hashSet - в массиве,
 * с доступом по хэшу.
 * Отсюда следует сложность операций.
 * В hashSet вставка и извлечение за O(1), а в treeSet - за O(logN).
 * Возможность хранить элементы в отсортированном порядке также обеспечивается
 * хранением в дереве.
 * Чисто для примера - двоичное дерево поиска.
 * В treeSet фактически более сложная реализация зашита.
 */
public class treeSetvsHashSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("cherry");
        hashSet.add("date");

        System.out.println("HashSet elements unsorted: ");
        for (String fruit : hashSet){
            System.out.println(fruit);
        }

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("cherry");
        treeSet.add("date");
        System.out.println("TreeSet elements sorted: ");
        for (String fruit : treeSet){
            System.out.println(fruit);
        }

    }
}
