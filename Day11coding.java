import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
     
// membuat objek Scanner untuk menerima input
Scanner input = new Scanner(System.in);

//deklarasi data
String nama;
int umur;
double tinggi;
char jenis_kelamin;

// minta input nama (String), umur (integer), tinggi (double), dan jenis kelamin (char)
System.out.print("Nama: ");
nama = input.nextLine();

System.out.print("Umur: ");
umur = input.nextInt();

System.out.print("Tinggi: ");
tinggi = input.nextDouble();

System.out.print("Jenis_kelamin: ");
jenis_kelamin = input.next().charAt(0);

// output menggunakan printf
System.out.print("\n=== BIODATA ===");
System.out.printf("Nama\t\t: %s%n", nama);
System.out.printf("Umur\t\t: %d tahun\n", umur);
System.out.printf("Tinggi\t\t: %.1f cm\n", tinggi);
System.out.printf("Jenis_kelamin\t: %c\n", jenis_kelamin);

input.close();

    }
}
