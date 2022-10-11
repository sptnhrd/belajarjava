/*TUGAS PERTEMUAN KE-01
PEMROGRAMAN BERORIENTASI OBJEK, GANJIL 2022/2023
NPM : 2113020013
Nama : Septian Hariadi
Kelas : 2J
Kategori : Mudah
Soal : Menghitung luas persegi dengan input panjang dan lebar
*/
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
