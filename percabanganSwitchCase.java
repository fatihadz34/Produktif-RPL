import java.util.Scanner;
public class percabanganSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan warna lampu");
        String lampu = input.nextLine();

        switch (lampu) {
            case "merah":
                System.out.println("Berhenti");
                break;
            case "kuning":
                System.out.println("Siap-siap");
                break;
            case "hijau":
                System.out.println("Silahkan jalan");
                break;
            default:
                System.out.println("Salah ketik yaaa?");
        }






    }
}
