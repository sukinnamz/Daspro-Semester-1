import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahMahasiswa = 30;
        String namaMahasiswa;
        String jenisKelamin;

        int i = 0; // Inisialisasi penghitung
        do {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa = scanner.nextLine();
            System.out.print("Masukkan jenis kelamin (L/P) mahasiswa ke-" + (i + 1) + ": ");
            jenisKelamin = scanner.nextLine().toUpperCase();
            if (jenisKelamin.equalsIgnoreCase("p")) {
                System.out.println("Mahasiswa perempuan dengan nama " + namaMahasiswa);
            }
            i++; // Menambahkan penghitung setiap kali data dimasukkan
        } while (i < jumlahMahasiswa); // Melakukan loop selama belum mencapai jumlah mahasiswa yang diinginkan

    }
}
