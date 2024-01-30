/**
 *
 shutdown hook

 Shutdown hook позволяет приложению выполнить некоторый код перед завершением приложения.


 Для создания hook нужно создать объект класса Thread
 и передать его в метод addShutdownHook() класса Runtime.
 Когда приложение завершается,
 все заданные hook выполнятся последовательно.

 Shutdown hook работает в случае нормального
 или аварийного завершения приложения
 и часто используется для освобождения ресурсов,
 закрытия соединений, сохранения данных.
 */
public class ShuDownHookExample {
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(){
            public void run() {
                //runs before shutting down
                System.out.println("Performing hook");
            }
        });

    }
}
