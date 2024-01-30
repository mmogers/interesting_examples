import java.util.PriorityQueue;

/**
 *
 Priority Queue

 PriorityQueue — это коллекция, которая хранит элементы в
 соответствии с их приоритетом.
 Реализует очередь на базе кучи (heap) и используется в ситуациях,
 когда необходимо обрабатывать или получать элементы в определенном порядке.

 Элементы в очереди упорядочены по их естественному порядку
 (если элементы компарируемые) или согласно компаратору,
 переданному при создании очереди.
 Первым всегда будет элемент с наивысшим приоритетом и
 извлечь можно только его.

 PriorityQueue не поддерживает изменение приоритета элемента после добавления.
 */
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(7);
        queue.add(3);
        queue.add(2);

        while(!queue.isEmpty()) {
            System.out.print(queue.poll() + " "); // 1 2 3 5 7
        }
    }
}
