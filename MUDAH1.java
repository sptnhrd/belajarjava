import java.util.*;

public class MUDAH1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double panjang,lebar,luas;
        
        System.out.println("Masukkan Ukuran Panjang Persegi (cm)");
        panjang = input.nextDouble();
        System.out.println("Masukkan Ukuran Lebar Persegi (cm)");
        lebar = input.nextDouble();
        luas = panjang*lebar;
        System.out.println("Luas Persegi Tersebut Adalah " +luas+ " cm2");
    }
}
