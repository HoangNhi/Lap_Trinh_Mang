package ltm_09032024.test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test1 {

    public static void main(String[] args) {
        // Copy
        Path source = Paths.get("src/ltm_09032024/test/dir1/dir2/dir3/hello.java");
        Path newDir = Paths.get("src/ltm_09032024/main");

        try{
            Files.copy(source, newDir.resolve(source.getFileName()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
