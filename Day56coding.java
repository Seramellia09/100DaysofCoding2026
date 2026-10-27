import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); 
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.print(i+ " ");
        }

        System.out.println();
        for (int i = n; i >= 1; i--) {
            sum += i;
            System.out.print(i+ " ");
        }

        System.out.println();
        System.out.println(sum);   
 }
}
