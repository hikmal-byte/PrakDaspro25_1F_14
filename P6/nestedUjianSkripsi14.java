package P6;

import java.util.Scanner;

public class nestedUjianSkripsi14 {
    public static void main(String[] args) {
        Scanner Hikmal = new Scanner(System.in);

        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = Hikmal.nextLine().trim();
        
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1");
        int bimbinganP1 = Hikmal.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2");
        int bimbinganP2 = Hikmal.nextInt();
        String pesan;
        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = ("Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi");
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = ("Gagal! Log Bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali");
            } else if (bimbinganP1 < 8) {
                pesan = ("Gagal! Log bimbingan P2 belum mencapai 4 kali");
            } else {
                pesan = ("Gagal! Mahasiswa masih memiliki tanggungan kompen");
            }
        } else {
            pesan = ("Gagal! Mahasiswa masih memiliki tanggungan kompen");
        }
        System.out.println(pesan);

    }
}