import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String username = "innamkicik", input_username, password = "1234", input_password;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan username : ");
        input_username = input.nextLine();
        System.out.println("Masukkan password : ");
        input_password = input.nextLine();

        if (input_username.equals(username) && input_password.equals(password)) {
            System.out.println("Anda berhasil login");
        } else {
            System.out.println("Anda gagal login");
        }
    }
}
