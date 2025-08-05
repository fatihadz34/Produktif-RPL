import java.util.Scanner;

public class BelanjaBarangFatih {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nama Barang1:");
        String namaBarang1 = input.nextLine();
        System.out.println("Harga Barang1:");
        double hargaBarang1 = input.nextDouble();
        System.out.println("Nama Barang2:");
        String namaBarang2 = input.next();
        System.out.println("Harga Barang2:");
        double hargaBarang2 = input.nextDouble();


        System.out.println("=========");
        System.out.println("Barang yang dibeli: " + namaBarang1 + " dan " + namaBarang2);
        System.out.println("Harga: " + hargaBarang1 + " dan " + hargaBarang2);

    }
}