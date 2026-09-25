import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

// menghitung luas persegi panjang
    int panjang = in.nextInt();
    int lebar = in.nextInt();

// rumus panjang*lebar
    int hasil = panjang*lebar;

    System.out.println("luas persegi panjang = " + hasil);

    in.close();

    }
}
