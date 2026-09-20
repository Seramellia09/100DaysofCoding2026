public class App {
    public static void main(String[] args) {
        
        double nilaiDouble = 100.99;
        float nilaiFloat = (float) nilaiDouble;
        long nilaiLong = (long) nilaiFloat;
        int nilaiInt = (int) nilaiLong;
        short nilaiShort = (short) nilaiInt;
        byte nilaiByte = (byte) nilaiShort;

        System.out.printf("%f\n %f\n %d\n %d\n %d\n %d\n", nilaiDouble, nilaiFloat, nilaiLong, nilaiInt, nilaiShort, nilaiByte);


      
    }
}
