import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        long perkalian = 1;

        for (int i = 1; i <= n; i++) {
        perkalian*=i;
       }
        System.out.println(perkalian);

        in.close( );
    }
}
