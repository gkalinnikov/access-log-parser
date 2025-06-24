import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        int firstNumber = new Scanner(System.in). nextInt();
        int secondNumber = new Scanner(System.in). nextInt();

        double quotient = (double) firstNumber / secondNumber;
        double sum = (double) firstNumber + secondNumber;
        double difference = (double) firstNumber - secondNumber;
        double multiplication = (double) firstNumber * secondNumber;

        System.out.println("Частное: " + quotient);
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + multiplication);


    }
}