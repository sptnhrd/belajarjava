import java.util.*;

public class KOMPLEKS{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int select, count;
        String data[] = new String[100];

        System.out.println("==============================================");
        System.out.println("Program Data Anak Penerima Bantuan");
        System.out.println("==============================================");
        System.out.print("Jumlah anak : ");
        count = input.nextInt();

        for( int i = 0; i < count; i++ ){
            System.out.print("Nama Anak ke-" + (i+1) + " : ");
            data[i] = input.next();
        }
        System.out.println("----------------------------------------------");
        System.out.println("Pilih Nomor Menu :");
        System.out.println("1. Cari Data Anak Penerima Bantuan");
		//created by apraa
        System.out.println("2. List Urut nama Anak");
        System.out.print("Masukkan Menu yang anda Pilih : ");
        select = input.nextInt();

        switch(select){
            case 1:
            carisearch(data);
            break;

            case 2:
            urutsort();
            break;

            default:
            System.out.println("Pilihan Yang anda Masukkan Salah!");
        }
    }
        
    public static void urutsort() {
        String data[] = {"agus", "bayu", "tomi", "nando"};
	    String temp;
	    System.out.println("List Anak (Urut Abjad) : ");
	    for (int j = 0; j < data.length; j++) {
   	        for (int i = j + 1; i < data.length; i++) {
		
		        if (data[i].compareTo(data[j]) < 0) {
			        temp = data[j];
			        data[j] = data[i];
			        data[i] = temp;
		        }
                
	        }
	        System.out.println(data[j]);
	    }
    }
    
    static void carisearch(String data[]) {
        String key;
        

        System.out.print("Nama Anak penerima bantuan = ");
        key = input.next();

        int result = carisearch2(data, key);
 
        if (result == -1){
            System.out.println("Bukan Termasuk anak penerima bantuan");
        }else{
            System.out.println("Anak Tersebut Merupakan Penerima Bantuan");
        }
        
    }

    public static int carisearch2(String[] data, String key){
        int l = 0, r = data.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            int res = key.compareTo(data[m]);
 
            if (res == 0)
                {return m;}
 
            if (res > 0)
                {l = m + 1;}
 
            else
                {r = m - 1;}
                
        }
        return r;
    }
}
//created by apraa
