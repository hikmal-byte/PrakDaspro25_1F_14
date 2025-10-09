package P6;

import java.util.Scanner;

public class TUGAS1 {
    public static void main(String[] args) {
        Scanner Hikmal = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = Hikmal.nextBoolean();

        String pesan = (uktLunas)
                ? "Pembayaran UKT terverifikasi. \nSIlakan cetak KRS dan minta tanda tangan DPA."
                : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.";
                System.out.println(pesan);
    }
}
