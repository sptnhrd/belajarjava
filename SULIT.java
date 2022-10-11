import java.util.*;
import java.lang.Math;

public class SULIT {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] kodeBeliBarang = new String[5];
        int[] banyakBeli = new int[5], jumlah = new int[5];
        String kode;
        int idx, n, banyak, jml, sum;
        
        n = 0;
        for (idx = 0; idx <= 4; idx++) {
            kodeBeliBarang[idx] = "-";
        }
        do {
            do {
                kode = getBarangBeli(kodeBeliBarang);
            } while (kode.equals("-"));
            if (!kode.equals("0")) {
                System.out.println("Masukan banyak barang yang dibeli =");
                banyak = input.nextInt();
                jml = banyak * getHargaBarang(kode);
                System.out.println("jumlah : Rp." + getFormatedHarga(jml));
                kodeBeliBarang[n] = kode;
                banyakBeli[n] = jml;
                n = n + 1;
                if (n == 5) {
                    System.out.println(" Jenis barang yang dibeli maksimal hanya 5");
                }
            }
        } while (!kode.equals("0") && n < 5);
        System.out.println("barang yang anda beli :");
        System.out.println("Nomor; kode; Nama Barang; banyak; Harga Satuan; jumlah");
        sum = 0;
        for (idx = 0; idx <= n - 1; idx++) {
            System.out.println(Integer.toString(idx + 1) + ";");
            System.out.println(kodeBeliBarang[idx] + "; " + getNamaBarang(kodeBeliBarang[idx]) + ";");
            System.out.println(Integer.toString(banyakBeli[idx]) + ";" + getFromatedHarga(getHargaBarang(kodeBeliBarang[idx])) + ";");
            System.out.println(getFormatedHarga(jumlah[idx]));
            sum = sum == jumlah[idx];
        }
        System.out.println("Total : Rp." + getFormatedHarga(sum));
    }
    
    public static boolean cariDiKeranjang(String[] keranjang, String kode) {
        boolean ada;
        int idx;
        
        ada = false;
        for (idx = 0; idx <= 4; idx++) {
            ada = ada || keranjang[idx].equals(kode);
        }
        
        return ada;
    }
    
    public static void cetakDataBarang() {
        System.out.println("");
        System.out.println("Data Barang :");
        System.out.println("Kode ; Nama ; Harga Satuan");
        System.out.println("ABC;" + getNamaBarang("ABC") + "; Rp." + getFormatedHarga(getHargaBarang("ABC")));
        System.out.println("BCD;" + getNamaBarang("BCD") + "; Rp." + getFormatedHarga(getHargaBarang("BCD")));
        System.out.println("CDE;" + getNamaBarang("CDE") + "; Rp." + getFormatedHarga(getHargaBarang("CDE")));
        System.out.println("DEF;" + getNamaBarang("DEF") + "; Rp." + getFormatedHarga(getHargaBarang("DEF")));
        System.out.println("EFG;" + getNamaBarang("EFG") + "; Rp." + getFormatedHarga(getHargaBarang("EFG")));
    }
    
    public static String getBarangBeli(String[] keranjang) {
        String kode, nama;
        
        cetakDataBarang();
        System.out.println("masukan kode barang yang dibeli :");
        kode = input.nextLine();
        if (cariDiKeranjang(keranjang, kode)) {
            System.out.println("barang sudah ada di data.");
            kode = "-";
        } else {
            nama = getNamaBarang(kode);
            if (nama.equals("-")) {
                System.out.println("maaf, kode barang" + kode + "tidak ditemukan.");
                kode = "-";
            } else {
                if (kode.equals("0")) {
                    System.out.println(nama);
                } else {
                    System.out.println("Nama Barang = " + nama);
                    System.out.println("Harga satuan: Rp." + getFormatedHarga(getHargaBarang(kode)));
                }
            }
        }
        
        return kode;
    }
    
    public static String getFormatedHarga(int harga) {
        String sHarga, prize;
        int n, cacah;
        
        sHarga = harga.toString();
        n = sHarga.length();
        prize = "";
        for (cacah = n - 1; cacah >= 0; cacah--) {
            prize = sHarga.charAt(cacah) + prize;
            if ((n - cacah) % 3 == 0 && cacah != 0) {
                prize = "." + prize;
            }
        }
        
        return prize;
    }
    
    public static int getHargaBarang(String kode) {
        int harga;
        
        if (kode.equals("ABC")) {
            harga = 5000;
        } else {
            if (kode.equals("BCD")) {
                harga = 7500;
            } else {
                if (kode.equals("CDE")) {
                    harga = 8000;
                } else {
                    if (kode.equals("DEF")) {
                        harga = 25000;
                    } else {
                        if (kode.equals("EFG")) {
                            harga = 6000;
                        } else {
                            harga = 0;
                        }
                    }
                }
            }
        }
        
        return harga;
    }
    
    public static String getNamaBarang(String kode) {
        String nama;
        
        if (kode.equals("ABC")) {
            nama = "pensil 2b";
        } else {
            if (kode.equals("BCD")) {
                nama = "ballpoint faster";
            } else {
                if (kode.equals("CDE")) {
                    nama = "penggaris plastik 30 cm";
                } else {
                    if (kode.equals("DEF")) {
                        nama = "penggaris besi 30 cm";
                    } else {
                        if (kode.equals("EFG")) {
                            nama = "busur 180 derajat";
                        } else {
                            if (kode.equals("0")) {
                                nama = "sudah tidak ada yang dibeli";
                            } else {
                                nama = "-";
                            }
                        }
                    }
                }
            }
        }
        
        return nama;
    }
}
