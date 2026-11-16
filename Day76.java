public class App {
     public static void main(String[] args) {
         String teks = " Belajar Java ";
         String hasilTrim = teks.trim();
         String hasilReplace = hasilTrim.replace("Java", "Dart");
         String hasilSubstring = hasilReplace.substring(0, 7);
       
         System.out.println("Teks awal : [" + teks + "]");
         System.out.println("Setelah trim : [" + hasilTrim + "]");
         System.out.println("Setelah replace : " + hasilReplace);
         System.out.println("Setelah substring: " + hasilSubstring);

     }
}
