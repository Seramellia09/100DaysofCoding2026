import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                if (n >= 1 && n <= 20) {
                    System.out.print(j + " ");
                }
            }
          System.out.println();
        }
    }
}
