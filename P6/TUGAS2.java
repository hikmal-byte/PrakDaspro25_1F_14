package P6;

import java.util.Scanner;

public class TUGAS2 {
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);

        System.out.print("Masukkan angka");
        int angka = hikmal14.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan genap");
        } else {
            System.out.println(angka + " adalah bilangan ganjil");
        }
    }
}