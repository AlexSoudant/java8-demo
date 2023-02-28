import java.io.File;
import java.io.FileFilter;

public class Main
{
    public static void main(String[] args) {
        FileFilter fileFilter = (File file) -> file.getName().endsWith(".java");
        File dir = new File("C:\\Users\\Alex\\Documents");
        File[] javaFiles = dir.listFiles(fileFilter);
        System.out.println("Welcome to Online IDE!! Happy Coding :)" + javaFiles);
    }
}