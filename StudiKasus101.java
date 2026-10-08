import java.util.Scanner;
public class StudiKasus101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaPerCup = 18000, jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;

        System.out.println("Masukkan Jumlah Cup Anda : ");
        jumlahCup = input.nextInt();
        System.out.println("Masukkan Uang Bayar Anda : ");
        uangBayar = input.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }
        totalBayar = totalHarga - diskon;

        System.out.println("Total Harga              : Rp. " + totalHarga);
        System.out.println("Diskon                   : Rp. " + diskon);
        System.out.println("Total Bayar              : Rp. " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian                : Rp. " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp. " + kurang);
        }
    }
}