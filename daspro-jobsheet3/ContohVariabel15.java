public class ContohVariabel15 {
    public static void main(String[] args) {
        String salahSatuHobbySayaAdalah = "Bermain petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'P';
        byte umurSayaSekarang = 17;
        double ipk = 4.00, tinggi = 1.55;
        System.out.println(salahSatuHobbySayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Umurku saat ini : " + umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}