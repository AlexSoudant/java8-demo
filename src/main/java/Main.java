import java.io.File;

public class Main
{
    public static void main(String[] args) {
        JavaFileFilter fileFilter = new JavaFileFilter();
        File dir = new File("C:\\Users\\Alex\\Documents");
        File[] javaFiles = dir.listFiles(fileFilter);
        System.out.println("Welcome to Online IDE!! Happy Coding :)" + javaFiles);
    }
}