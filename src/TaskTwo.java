import java.util.Scanner;

public class TaskTwo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку a: "  );
            String a =scanner.nextLine();
            System.out.println("Введите строку b: "  );
            String b =scanner.nextLine();
            String result = (a.equals(b))?("Строки идентичны"):("Строки неидентичны");
            System.out.println(result);
            }
        }

