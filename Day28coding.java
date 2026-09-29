import java.util.Scanner;
public class App {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);

int a = in.nextInt(); // contoh nilainya 10
int b = in.nextInt(); // contoh nilainya 8
int c = in.nextInt(); // contoh nilainya 10

// operator (==) digunakan untuk menunjukan kesamaan (sama dengan)
System.out.println(a==b); // hasilnya akan false apabila nilai a dan b yang dimasukan tidak sama
System.out.println(a==c); // hasilnya akan true apabila nilai a dan c yang dimasukan sama

// operator (!=) digunakan untuk menunjukan ketidaksamaan (bukan sama dengan)
System.out.println(a!=c); // hasilnya akan false karena nilai a dan c adalah nilai yang sama, seharusnya menggunkan operator (==)
System.out.println(a!=b); // hasilnya akan true karena nilai a dan b bukan nilai yang sama


    }
}
