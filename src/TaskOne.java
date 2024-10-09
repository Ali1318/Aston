import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = scanner.nextInt();
        System.out.println("Введите число b: ");
        int b = scanner.nextInt();
        String compare = (a > b) ? "a > b" : (a < b) ? "a < b" : "a = b";
        System.out.println(compare);
        System.out.println("сложения :" + (a + b));
        System.out.println("вычитания :" + (a - b));
        System.out.println("деления :" + ((b!=0) ? a / b:"Деление на ноль невозможно"));
        System.out.println("умножения :" + (a * b));
    }
}
