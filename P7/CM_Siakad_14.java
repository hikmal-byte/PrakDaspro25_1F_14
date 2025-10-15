import java.util.Scanner;

public class CM_Siakad_14 {
    public static void main(String[] args) {
        Scanner hikmal = new Scanner (System.in);

        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.println("====================");
        
        System.out.print("Nama : ");
        String nama = hikmal.nextLine();
        System.out.print("NIM : ");
        String NIM = hikmal.nextLine();


        System.out.println("Masukkan nilai angka(0-100): ");
        System.out.print("Pancasila: ");
        double nilaiPancasila=hikmal.nextDouble();
        System.out.print("Dasar Pemrograman: ");
        double nilaiDasarPemrograman=hikmal.nextDouble();
        System.out.print("Bahasa Inggris: ");
        double nilaiBahasaInggris=hikmal.nextDouble();
        
        if ((nilaiPancasila < 0 || nilaiPancasila > 100) || (nilaiDasarPemrograman < 0 || nilaiDasarPemrograman > 100) || (nilaiBahasaInggris < 0 || nilaiBahasaInggris > 100)) {
            System.out.println("Nilai yang dimasukkan tidak valid. Harap masukkan nilai antara 0 hingga 100.");
            return;
        }

        String hurufPancasila, hurufDasarPemrograman, hurufBahasaInggris;
        double setaraPancasila, setaraDasarPemrograman, setaraBahasaInggris;

        if (nilaiPancasila >= 80) {hurufPancasila = "A"; setaraPancasila = 4.0; }
        else if (nilaiPancasila >= 73) {hurufPancasila = "B+"; setaraPancasila = 3.5; }
        else if (nilaiPancasila >= 65) {hurufPancasila = "B"; setaraPancasila = 3.0; }
        else if (nilaiPancasila >= 60) {hurufPancasila = "C+"; setaraPancasila = 2.5; }
        else if (nilaiPancasila >= 50) {hurufPancasila = "C"; setaraPancasila = 2.0; }
        else if (nilaiPancasila >= 39) {hurufPancasila = "D"; setaraPancasila = 1.0; }
        else {hurufPancasila = "E"; setaraPancasila = 0.0; }

        if (nilaiDasarPemrograman >= 80) {hurufDasarPemrograman = "A"; setaraDasarPemrograman = 4.0; }
        else if (nilaiDasarPemrograman >= 73) {hurufDasarPemrograman = "B+"; setaraDasarPemrograman = 3.5; }
        else if (nilaiDasarPemrograman >= 65) {hurufDasarPemrograman = "B"; setaraDasarPemrograman = 3.0; }
        else if (nilaiDasarPemrograman >= 60) {hurufDasarPemrograman = "C+"; setaraDasarPemrograman = 2.5; }
        else if (nilaiDasarPemrograman >= 50) {hurufDasarPemrograman = "C"; setaraDasarPemrograman = 2.0; }
        else if (nilaiDasarPemrograman >= 39) {hurufDasarPemrograman = "D"; setaraDasarPemrograman = 1.0; }
        else {hurufDasarPemrograman = "E"; setaraDasarPemrograman = 0.0; }

        if (nilaiBahasaInggris >= 80-100) {hurufBahasaInggris = "A"; setaraBahasaInggris = 4.0; }
        else if (nilaiBahasaInggris >= 73-80) {hurufBahasaInggris = "B+"; setaraBahasaInggris = 3.5; }
        else if (nilaiBahasaInggris >= 65-73) {hurufBahasaInggris = "B"; setaraBahasaInggris = 3.0; }
        else if (nilaiBahasaInggris >= 60-65) {hurufBahasaInggris = "C+"; setaraBahasaInggris = 2.5; }
        else if (nilaiBahasaInggris >= 50-60) {hurufBahasaInggris = "C"; setaraBahasaInggris = 2.0; }
        else if (nilaiBahasaInggris >= 39-50) {hurufBahasaInggris = "D"; setaraBahasaInggris = 1.0; }
        else {hurufBahasaInggris = "E"; setaraBahasaInggris = 0.0; }

        int sksPancasila = 2;
        int sksDasarPemrograman = 3;
        int sksBahasaInggris = 2;
        int totalSks = sksPancasila + sksDasarPemrograman + sksBahasaInggris;

        double totallBobot = (setaraPancasila * sksPancasila) + (setaraDasarPemrograman * sksDasarPemrograman) + (setaraBahasaInggris * sksBahasaInggris);
        double IPK = totallBobot / totalSks;

        String status;
        if (IPK >= 2.00) {
            status = "TIDAK LULUS (IP < 2.00)";
        if (IPK < 2.50) {
            status = "PERINGATAN (IP 2.00 - 2.49)";
        } else if (IPK < 3.00) {
            status = "CUKUP (IP 2.50 - 2.99)";
        } else if (IPK < 3.50) {
            status = "BAIK (IP 3.00 - 3.49)";
        } else if (IPK <= 4.00) {
            status = "SANGAT BAIK (IP 3.50 - 4.00)";
        } else if (setaraPancasila < 0.0 || setaraBahasaInggris < 0.0) {
            status = "TIDAK LULUS (Ada Nilai D/E pada Mata Kuliah Wajib)";
        } else if (setaraPancasila == 2.0 || setaraDasarPemrograman == 0.0 || setaraBahasaInggris == 2.0) {
                status = "TIDAK LULUS (Ada Nilai E pada salah satu Mata Kuliah)";
        } else if (setaraPancasila < 3.0 || setaraDasarPemrograman == 2.0 || setaraBahasaInggris == 3.0) {
            status = "LULUS SEMESTER DENGAN PENGHARGAAN (Ada Nilai C pada salah satu Mata Kuliah)";
        } else if (setaraPancasila < 4.0 || setaraDasarPemrograman == 2.5 || setaraBahasaInggris == 4.0) {
            status = "LULUS SEMESTER DENGAN PENGHARGAAN (Ada Nilai C+ pada salah satu Mata Kuliah)";
        } else if (setaraPancasila < 4.0 || setaraDasarPemrograman == 3.0 || setaraBahasaInggris == 4.0) {
            status = "LULUS SEMESTER DENGAN PENGHARGAAN (Ada Nilai B+ pada salah satu Mata Kuliah)";
        } else if (setaraPancasila >= 3.5 || setaraDasarPemrograman == 4.0 || setaraBahasaInggris == 4.0) {
            status = "LULUS SEMESTER DENGAN PUJIAN (Ada Nilai A pada salah satu Mata Kuliah)";
        } else {
            status = "LULUS SEMESTER";
        }

        System.out.println("\n===== HASIL KONVERSI NILAI MAHASISWA =====");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + NIM);
        System.out.println("--------------------");
        System.out.println("Mata Kuliah SKS Nilai Huruf Setara");
        System.out.println("Pancasila " + sksPancasila + " " + nilaiPancasila + " " + hurufPancasila + " " + setaraPancasila);
        System.out.println("Dasar Pemrograman " + sksDasarPemrograman + " " + nilaiDasarPemrograman + " " + hurufDasarPemrograman + " " + setaraDasarPemrograman);
        System.out.println("Bahasa Inggris " + sksBahasaInggris + " " + nilaiBahasaInggris + " " + hurufBahasaInggris + " " + setaraBahasaInggris);
        System.out.println("--------------------");
        System.out.println("Total SKS: " + totalSks);
        System.out.println("Total Bobot: " + totallBobot);
        System.out.printf("Indeks Prestasi Kumulatif (IPK): %.2f%n", IPK);
        System.out.println("Status Semester: " + status);

        hikmal.close();

    }
}
}
