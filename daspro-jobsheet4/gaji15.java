import java.util.Scanner;

public class gaji15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlMasuk, jmlTdkMasuk, TotGaji, gaji, potGaji;

        System.out.println("Masukkan jumlah masuk : ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan jumlah tidak masuk :");
        jmlTdkMasuk = input.nextInt();
        System.out.println("Masukkan besaran gaji :");
        gaji = input.nextInt();
        System.out.println("Masukkan potongan gaji : ");
        potGaji = input.nextInt();

        TotGaji = (jmlMasuk * gaji) - (jmlTdkMasuk * potGaji);
        System.out.println("Gaji anda : " + TotGaji);
    }
}
