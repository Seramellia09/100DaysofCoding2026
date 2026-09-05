public class App {
    public static void main(String[] args) throws Exception {
    
        // byte memiliki ukuran 8-bit, rentang dari -128 hingga 127.
        // short memiliki ukuran 16-bit, rentang dari -32.768 hingga 32.767.
        /* int memiliki ukuran 32-bit, rentang dari -2.147.483.648
        hingga 2.147.483.647. */
        /* long memiliki ukuran 64-bit, rentang dari -9.223.372.036.854.775.808
        hingga 9.223.372.036.854.775.807. */
        
        byte nilaiByte = 110;
        short nilaiShort = 9000;
        int nilaiInt = 540000;
        long nilaiLong = 1500000000L; 
        // khusus untuk nilai LONG harus ditambahkan (L) dibelakang angka

System.out.println("Byte: " + 110);
System.out.println("Short: " + 9000);
System.out.println("Integer: " + 540000);
System.out.println("Long: " + 1500000000);
    }
}
