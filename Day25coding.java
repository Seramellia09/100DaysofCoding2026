import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // increment 
    int a = in.nextInt();
    int b = in.nextInt();
        
    System.out.println("++a = " + (++a)); // otomatis bertambah 1 angka
    System.out.println("a++ = " + ( a++)); // a dicetak terlebih dahulu baru ditambah 1
    System.out.println("Nilai a sekarang = " + a);

    // decrement
    System.out.println("--b = " + (--b)); // otomatis akan berkurang 1 angka
    System.out.println("b-- = " + (b--)); // b akan dicetak terlebih dahulu baru dikurang 1
    System.out.println("Nilai b sekarang = " + b);

    in.close();


    }
}
