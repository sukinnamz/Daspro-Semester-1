import java.util.Scanner;

public class SwitchCase15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;

        System.out.println("Masukkan Angka : ");
        angka = sc.nextInt();

        switch (angka) {
            case 1:
                System.out.println("Hari senin");
                break;
            case 2:
                System.out.println("Hari selasa");
                break;
            case 3:
                System.out.println("Hari rabu");
                break;
            case 4:
                System.out.println("Hari kamis");
                break;
            case 5:
                System.out.println("Hari jumat");
                break;
            case 6:
                System.out.println("Hari sabtu");
                break;
            case 7:
                System.out.println("Hari minggu");
                break;
            default:
                System.out.println("Maaf angka yang anda masukkan salah");
                break;
        }
    }
}
