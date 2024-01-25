/**
 *
 charBuffer

 Метод charBuffer() используется для получения буфера символов из строки.
 Он принадлежит классу String.

 Этот метод возвращает объект CharBuffer,
 который представляет последовательность символов строки.
 CharBuffer позволяет эффективно читать и манипулировать символами строки
 без создания копий.

 В этом примере создается строка «Hello».
 Затем из этой строки получаем буфер символов методом charBuffer().
 В цикле посимвольно читаем из буфера символы и выводим их на экран.
 */
import java.nio.CharBuffer;

public class CharBufferClass {
    public static void main(String[] args) {
        String string = "Hello";

        CharBuffer buffer = CharBuffer.wrap(string.toCharArray());

        while (buffer.hasRemaining()) {
            System.out.print(buffer.get());
        }
    }
}
