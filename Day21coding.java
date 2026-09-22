import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String n = in.nextLine();
    String u = in.nextLine();
    String t = in.nextLine();
    String b = in.nextLine();
    String s = in.nextLine();
    String i = in.nextLine();
    String N = in.nextLine();
    String j = in.nextLine();
    String k = in.nextLine();

// konversi ke tipe data primitif yang sesuai
String nama = n;
char inisial = nama.isEmpty() ? ' ' : nama.charAt(0);
int umur = Integer.parseInt(u); //bulat standar
float tinggi = Float.parseFloat(t);
float berat = Float.parseFloat(b);
short semester = Short.parseShort(s);
double ipk = Double.parseDouble(i);
long nim = Long.parseLong(N);
byte jumlahpenghargaan = Byte.parseByte(j);
char kodekelas = k.isEmpty()? ' ' : k.charAt(0);

// perhitungan sesuai soal
int perkiraanlahir = 2026 - umur;
int totalprestasi = (jumlahpenghargaan * 10) + (semester * 5);
double tinggimeter = tinggi / 100.0;


// menampilkan output
System.out.println("Nama: " + nama + " (inisial: " + inisial + ")");
System.out.println("Umur: " + umur + " tahun, Perkiraan Lahir: " + perkiraanlahir);
System.out.printf("Tinggi: %f cm (%f m), Berat: %f kg\n", tinggi, tinggimeter, berat);
System.out.println("Semester: " + semester + ", IPK: " + ipk + ", NIM: " + nim);
System.out.println("kode Kelas: " + kodekelas + ", Jumlah Penghargaan: " + jumlahpenghargaan);
System.out.println("Total Point Prestasi: " + totalprestasi);
    
in.close();

      
    }
}
