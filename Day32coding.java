public class KombinasiOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;
        boolean nilaitidakbenar = true;

        // Mengkombinasikan perbandingan dengan operator logika && (AND) dan || (OR)
        boolean hasilKombinasi = (a < b) && (b > c) || (a == c);
        boolean hasilKombinasi2 = (a <= b) && (b >= c) || (a != c);
        boolean nilaibenar = !nilaitidakbenar;
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c);
        System.out.println("Hasil (a < b && b > c || a == c) adalah: " + hasilKombinasi);
        System.out.println("Hasil (a <= b && b >= c || a != c) adalah: " + hasilKombinasi2);
        System.out.println("Nilai Benar: " + nilaibenar);
  
        }
    }
