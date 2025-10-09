package P6;
import java.util.Scanner;
public class TUGAS3_Perpus {
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);
        boolean bawaKTM, regsitOnline;

        System.out.print("Apakah anda membawa KTM? (true/false) : ");
        bawaKTM = hikmal14.nextBoolean();
        System.out.print("Apakah anda sudah registrasi online? (true/false) : ");
        regsitOnline = hikmal14.nextBoolean();

        if (regsitOnline || bawaKTM) {
            System.out.println("Boleh masuk perpustakaan");
        } else {
            System.out.println("Tidak boleh masuk perpustakaan");
        }
        hikmal14.close();
    }
}