/**
 * Memory Model
 *
 * Memory Model (модель памяти) в Java определяет взаимодействие потоков
 * с разделяемой памятью.
 * Она гарантирует видимость изменений в памяти и порядок операций.
 *
 * Java Memory Model (JMM) устанавливает правила для этого взаимодействия.
 * JMM обеспечивает видимость изменений через синхронизацию и волатильные переменные. Она также определяет порядок операций и гарантирует атомарность для некоторых операций.
 */
public class MemoryModelExample {
    private static int sharedValue = 0; //not volatile because is called from a static content

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                sharedValue++;
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                sharedValue++;
            }
        });

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("sharedValue = " + sharedValue);
    }
}
