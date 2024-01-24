//File to String
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileToString {
    public static void main(String[] args) throws IOException {
        String filePath = "./src/test.txt";
        String result = Files.readString(Path.of(filePath));
        System.out.println(result);

        String content = result + " Demo";
        Files.writeString(Path.of(filePath), content);

        String result2 = new String(Files.readAllBytes(Path.of(filePath)), StandardCharsets.UTF_8);
        System.out.println(result2);
    }
}
