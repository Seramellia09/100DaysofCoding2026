public class App {
    public static void main(String[] args) {
        int a = 10;
        
        a += 8; 
       // hasilnya menjadi 18
        System.out.println("Hasil += : " + a);
        
        a -= 3; 
       // hasilnya menjadi 15
        System.out.println("Hasil -= : " + a);
        
        a *= 2; 
       // hasilnya menjadi 30
        System.out.println("Hasil *= : " + a);
        
        a /= 5; 
        // hasilnya menjadi 6
        System.out.println("Hasil /= : " + a);
        
        a %= 4; 
       // hasilnya menjadi 1 (sisa bagi 2)
        System.out.println("Hasil %= : " + a);
    }
}
