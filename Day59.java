import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
        System.out.print("Masukkan nilai N (batas akhir): ");
        int n = in.nextInt();
        
        System.out.print("Masukkan nilai M (kelipatan): ");
        int m = in.nextInt();

        System.out.println("\nKelipatan " + m + " dari 1 sampai " + n + " adalah:");
        
        for (int i = m; i <= n; i += m) {
            System.out.print(i + " ");
        }
    }
}
