import java.util.Scanner;

public class UcapanTerimakasih_15 {
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan nama orang yang ingin anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world. \n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything");
        UcapanTambahan("makasi yak " + nama);
    }

    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

}
