import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in); // mendeklarasikan scanner
        double diskon = 0; // set awal diskon
        int jumlah_buku, harga_buku, bayar, jumlah_diskon; // deklarasi variabel 
        String jenis_buku; // ini juga deklarasi variabel

        System.out.print("Masukkan jenis buku : "); 
        jenis_buku = input15.nextLine(); // menerima inputan jenis buku
        System.out.print("Masukkan harga buku : ");
        harga_buku = input15.nextInt(); // menerima input harga buku
        System.out.print("Masukkan jumlah_buku : ");
        jumlah_buku = input15.nextInt(); // menerima input jumlah buku

        if (jenis_buku.equalsIgnoreCase("kamus")) { // mengecek apakah inputan sama dengan jenis buku kamus
            if (jumlah_buku > 2) { // jika jumlah buku kamus lebih dari dua maka
                diskon = 0.12; // diskon nya 12%
            } else { // jika jumlah buku kamus kurang dari sama dengan 2 maka
                diskon = 0.1; // diskon nya 10%
            }
        } else if (jenis_buku.equalsIgnoreCase("novel")) { // mengecek apakah inputan sama dengan jenis buku novel
            if (jumlah_buku > 3) { // jika jumlah buku novel lebih dari tiga maka
                diskon = 0.09; // diskon sama dengan 9%
            } else { // jika jumlah buku novel kurang dari sama dengan 3 maka
                diskon = 0.08; // diskon sama dengan 8%
            }
        } else { // jika tipe buku bukan novel maupun kamus
            if (jumlah_buku > 3) { // dan jumlah buku tersebut lebih dari 3 maka
                diskon = 0.05; // diskon sama dengan 5%
            } else { // jika jumlah buku kurang dari sama dengan 3
                diskon = 0; // yahahah ga dapet diskon
            }
        }

        jumlah_diskon = (int) (diskon * jumlah_buku * harga_buku); // menghitung total diskon dalam rupiah
        bayar = (int) ((harga_buku * jumlah_buku) - jumlah_diskon); // menghitung jumlah yang harus dibayar

        System.out.println("Anda mendapat diskon : " + jumlah_diskon);
        System.out.println("Anda harus membayar : " + bayar);
    }
}
