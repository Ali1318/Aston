import java.util.Arrays;

public class TaskThree {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
            System.out.println("Четные числа");
            Arrays.stream(num).filter(x-> x % 2 == 0).forEach(x-> System.out.println(x));
    }

}
