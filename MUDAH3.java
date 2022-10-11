import java.util.*;

public class MUDAH3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bil, n, cacah;
        
        System.out.println("Masukkan Bilangan yang akan difaktorial kan =");
        bil = input.nextInt();
        n = 1;
        for (cacah = 1; cacah <= bil; cacah++) {
            n = n * cacah;
        }
        System.out.println("Faktorial dari " + bil + " adalah " + n);
    }
}
