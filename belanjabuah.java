import java.util.Scanner;

public class belanjabuah {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int stokApel = 35, stokJeruk = 30;
    System.out.println("Selamat datang di Toko Buah Fatih!");
    System.out.println("Tersedia Apel dan Jeruk");
    System.out.println("=========");
    System.out.println("Stok yang tersedia: stock Apel: " + stokApel + " dan stock Jeruk: " + stokJeruk);
    System.out.println("Masukkan Jumlah Apel yang ingin dibeli: ");
    int Apel = input.nextInt();
    System.out.println("Masukkan Jumlah Jeruk yang ingin dibeli: ");
    int Jeruk = input.nextInt();
    double hargaApel = 15000, hargaJeruk = 10500;
    double total, bayar, kembalian;

        stokApel -= Apel;
        stokJeruk -= Jeruk;
        total=(Apel * hargaApel) + (Jeruk * hargaJeruk);
        System.out.println("=========");
        System.out.println("Jumlah Apel yang dibeli: " + Apel+ " dan Jeruk : " + Jeruk);
        System.out.println("Total harga yang harus dibayar: " + total);
        System.out.println("=========");
        System.out.println("Masukkan pembayaran: ");
        bayar = input.nextDouble();
        kembalian = bayar - total;
        System.out.println(" Kembalian Anda adalah: " + kembalian);
        System.out.println("=========");
        System.out.println("Stok Apel sekarang: " + stokApel + " dan Stok Jeruk sekarang: " + stokJeruk);
    }
}
