import java.util.Scanner;

public class Bank15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jml_tabungan_awal, lama_menabung;
        double jml_tabungan_akhir, bunga, prosentase_bunga = 0.02;

        System.out.println("Masukkan jumlah tabungan awal anda");
        jml_tabungan_awal = input.nextInt();
        System.out.println("Masukkan lama menabung anda");
        lama_menabung = input.nextInt();

        bunga = lama_menabung * prosentase_bunga * jml_tabungan_awal;
        jml_tabungan_akhir = bunga + jml_tabungan_awal;
        System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);
    }

}
