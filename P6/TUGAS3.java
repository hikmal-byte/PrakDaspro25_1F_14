package P6;

import java.util.Scanner;

public class TUGAS3 {
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);

        System.out.print("Masukkan jenis user (dosen/mahasiswa):");
        String user = hikmal14.nextLine();

        if (user.equals("dosen")) {

            System.out.println("Akses wifi diberikan (dosen)");
        } else if (user.equals("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang diambil:");
            int sks = hikmal14.nextInt();

            if (sks >= 12) {
                System.out.println("Akses wifi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses wifi ditolak SKS kurang dari 12");
            }
        } else {
            System.out.println("User tidak dikenali");
        }

        hikmal14.close();
    }
}