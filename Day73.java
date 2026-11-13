import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;

        for (;;) {
            int n = in.nextInt();
            if (n < 0) {
                break;
            }
            sum += n;
        }
        System.out.println("Total = " + sum);
    }
}
