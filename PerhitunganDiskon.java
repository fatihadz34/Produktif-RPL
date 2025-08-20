import java.util.Scanner;

public class PerhitunganDiskon {
    public static void main(String[] args) {
        double totalBeli, diskon, hargaAkhir, kembalian, Bayar;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Total Pembelian: ");
        totalBeli = input.nextDouble();

    if (totalBeli > 500000){
        diskon = (0.2)*totalBeli;
        System.out.println("Anda mendapatkan diskon 20%");
    }       
else if (totalBeli > 300000) {
    System.out.println("Anda mendapatkan diskon 15%");
        diskon = (0.15)*totalBeli;    
} else if (totalBeli > 100000) {
    System.out.println("Anda mendapatkan diskon 10%");
        diskon = (0.1)*totalBeli;
    } 
    else{System.out.println("Tidak ada diskon");
        diskon = 0;}
    
hargaAkhir = totalBeli - diskon;
        System.out.println("harga akhir "+hargaAkhir);
        System.out.println("Masukkan Uang Pembayaran: ");
        Bayar = input.nextDouble();
        if (Bayar < hargaAkhir) {
            System.out.println("Uang Anda tidak cukup");
        } else {
            kembalian = Bayar - hargaAkhir;
            System.out.println("Kembalian Anda: " + kembalian);



        }
    }
}