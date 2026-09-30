import java.util.Scanner;
public class App {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);

int a = in.nextInt(); // contoh nilai = 9
int b = in.nextInt(); // contoh nilai = 8

// operator perbandingan (>)
System.out.println("a > b = " + (a > b)); // hasilnya true karena nilai a lebih besar dibanding b
System.out.println("b > a = " + (b > a)); // hasilnya false karena nilai b lebih kecil dibanding a

// operator perbandingan (<)
System.out.println("a < b = " + (a < b)); // hasilnya false karena nilai a lebih besar dibanding b
System.out.println("b < a = " + (b < a)); // hasilnya true karena nilai b lebih kecil dibanding a

    }
}
