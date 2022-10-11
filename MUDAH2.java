import java.util.*;

public class MUDAH2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double nilaiMTK, nilaiPU, nilaiBI, total;
        String keterangan;
        
        System.out.println("Masukkan Nilai Matematika (0-100)");
        nilaiMTK = input.nextDouble();
        System.out.println("Masukkan Nilai Pengetahuan Umum (0-100)");
        nilaiPU = input.nextDouble();
        System.out.println("Masukkan Nilai Bahasa Indonesia (0-100)");
        nilaiBI = input.nextDouble();
        nilaiMTK = nilaiMTK * 25 / 100;
        nilaiPU = nilaiPU * 35 / 100;
        nilaiBI = nilaiBI * 40 / 100;
        total = nilaiMTK + nilaiPU + nilaiBI;
        if (total > 70) {
            keterangan = "DITERIMA";
        } else {
            keterangan = "DITOLAK";
        }
        System.out.println("Total Hasil Tes : " + total + "," + keterangan);
    }
}
