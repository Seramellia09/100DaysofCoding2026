public class App {
    public static void main(String[] args) {
      
// tipe data kecil(byte)
byte nilaiByte = 99;

// konversi otomatis tipe data lebih besar(short)
short nilaiShort = nilaiByte;

// konversi otomatis ketipe data lebih besar(integer)
int nilaiInt = nilaiShort;

// konversi otomatis ke tipe data lebih besar(long)
long nilaiLong = nilaiInt;

// konversi otomatis ke tipe data lebih besar(float)
float nilaiFloat = nilaiLong;

// konversi otomatis ke tipe data lebih besar(double)
double nilaiDouble = nilaiFloat;


System.out.println("nilai byte:" + nilaiByte);
System.out.println("nilai short setelah konversi: " + nilaiShort);
System.out.println("nilai int setelah konversi:" + nilaiInt);
System.out.println("nilai long setelah konversi:" +nilaiLong);
System.out.println("nilai float setelah konversi: " + nilaiFloat);
System.out.println("nilai double setelah konversi: " + nilaiDouble);

    }
}
