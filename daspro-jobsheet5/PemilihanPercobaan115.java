import java.util.Scanner;

public class PemilihanPercobaan115 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = input15.nextInt();

        // if (angka % 2 == 0) {
        // System.out.println("Angka " + angka + " bilangan genap");
        // } else {
        // System.out.println("Angka " + angka + " bilangan ganjil");
        // }

        String hasil = (angka % 2 == 0) ? "Angka " + angka + " bilangan genap" : "Angka " + angka + " bilangan ganjil";
        System.out.println(hasil);
    }
}