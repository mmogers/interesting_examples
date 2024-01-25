import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 Как используется класс Future?

 Класс Future является частью пакета java.util.concurrent,
 и он используется для представления результата асинхронной операции или задачи,
 которая выполняется в фоновом потоке.
 Future позволяет вам управлять и получать результаты выполнения задачи в будущем,
 даже если она еще не завершилась.
 */
public class FutureExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> future = executor.submit(() ->{
            //executing other opertaion
            Thread.sleep(2000);
            return 42;
        });

        //check if the task has ended
        if(!future.isDone()){
            System.out.println("Task is still running");
        }

        //receiving result (blocks the thread if the task is not finished)
        int result = future.get();
        System.out.println("Result: " + result);

        executor.shutdown();

    }
}
