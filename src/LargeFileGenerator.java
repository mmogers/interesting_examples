import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.UUID;

public class LargeFileGenerator {
    public static void main(String[] args) {
        new LargeFileGenerator().generate();
    }

    private void generate() {
       var data = prepareData(5000000);
        File f = new File("/test.txt");

        int stepCount = 10;
        long total = 0;
        for (int i = 0; i < stepCount; i++) {
            System.out.printf("Step %s%n " , (i + 1));
            long begin = System.currentTimeMillis();
            long end = System.currentTimeMillis();
            // todo invoke method
            total += end - begin;
        }
        System.out.printf("Average time : %s%n", total / stepCount);
    }
    public String prepareData(int lineCount) {
        var data = new StringBuilder();
        for (int i = 0; i < lineCount; i++) {
            data.append(UUID.randomUUID()).append(System.lineSeparator());
        }
        return data.toString();
    }

    public void writeFileSimple(File f , String content) { //try with resources
        try(var fw = new FileWriter(f)) {
            fw.write(content);//FileWriter saves all to file system ; try with resources calse method close() automatically, implements autoclosable interface
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void writeFileBuffered (File f , String content){ //faster saving
        try(var fw = new BufferedWriter(new FileWriter(f))) {
            fw.write(content);//FileWriter saves all to file system ; try with resources calse method close() automatically, implements autoclosable interface
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public void writeFileNio(File f, String content) { //even faster
        try{
            Files.writeString(Paths.get(f.toURI()), content, StandardOpenOption.CREATE); //create file even if it exists
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
