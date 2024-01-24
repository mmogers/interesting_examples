//File to String
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileToString {
    public static void main(String[] args) throws IOException {
//1 Java1.11
        String filePath = "./src/test.txt";
        String result = Files.readString(Path.of(filePath));
        System.out.println(result);

        String content = result + " Demo";
        Files.writeString(Path.of(filePath), content);
//2 Streams Java 1.8
        String result2 = new String(Files.readAllBytes(Path.of(filePath)), StandardCharsets.UTF_8);
        System.out.println(result2);
    }
}
