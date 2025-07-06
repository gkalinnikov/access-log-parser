import java.io.File;
import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        int count = 1;
        while (true) {
            System.out.print("Введите путь к файлу: ");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);

            boolean noExists = !file.exists();
            if (noExists) {
                System.out.println("Файл не существует");
                continue;
            }
            boolean isDirectory = file.isDirectory();
            if (isDirectory) {
                System.out.println("Это папка, а не файл");
                continue;
            }

            System.out.println("Верный файл #" + count);
            count++;
        }
    }
}