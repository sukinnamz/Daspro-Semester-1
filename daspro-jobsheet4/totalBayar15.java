import java.util.Scanner;

public class totalBayar15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int harga, jumlah, jmlHalaman;
        double dis, total, bayar, jmlDis;
        String merkBuku;

        System.out.println("Masukkan harga barang yang dibeli : ");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli : ");
        jumlah = input.nextInt();
        System.out.println("Masukkan besaran diskon");
        dis = input.nextDouble();
        System.out.println("Masukkan merk buku : ");
        merkBuku = input2.nextLine();
        System.out.println("Masukkan halaman buku : ");
        jmlHalaman = input.nextInt();

        total = harga * jumlah;
        jmlDis = total * dis;
        bayar = total - jmlDis;

        System.out.println("Anda telah membeli buku dengan merk " + merkBuku + " dengan jumlah halaman " + jmlHalaman);
        System.out.println("Diskon yang anda dapat adalah " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);
    }
}
