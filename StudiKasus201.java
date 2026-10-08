import java.util.Scanner;
public class StudiKasus201 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, jenisKegiatan;
        int jumlahDokumen, peringkatJuara,

        System.out.print("Nama Mahasiswa    : ");
        nama = input.nextLine();
        System.out.print("Jenis Kegiatan    : ");
        jenisKegiatan = input.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")) {
            System.out.print("Masukkan Peringkat Juara (1/2/3, 0 jika bukan juara) : ");
            peringkatJuara = input.nextInt();
            System.out.print("Masukkan Jumlah Dokumen (0-4)                        : ");
            jumlahDokumen = input.nextInt();
            if (jumlahDokumen < 4) {
                System.out.println("--- Hasil ---");
                System.out.println("Nama Mahasiswa      : " + nama);
                System.out.println("Status Dana         : TIDAK DIBERIKAN");
                System.out.println("Alasan              : Dokumen Tidak Lengkap");
                System.out.println("Dokumen Kurang      : " + (4 - jumlahDokumen));
            } else {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("--- Hasil ---");
                    System.out.println("Nama Mahasiswa      : " + nama);
                    System.out.println("Status Dana         : DIBERIKAN");
                    System.out.println("Alasan              : Mendapat juara " + peringkatJuara + " dan dokumen lengkap");
                } else {
                    System.out.println("--- Hasil ---");
                    System.out.println("Nama Mahasiswa      : " + nama);
                    System.out.println("Status Dana         : TIDAK DIBERIKAN");
                    System.out.println("Alasan              : Bukan Juara 1, 2, atau 3");
                }
            }
        } else if (jenisKegiatan.equalsIgnoreCase("BAKORMA")) {
            System.out.print("Masukkan Peringkat Juara (1/2/3, 0 jika bukan juara) : ");
            peringkatJuara = input.nextInt();
            System.out.print("Masukkan Jumlah Dokumen (0-4)                        : ");
            jumlahDokumen = input.nextInt();
            if (jumlahDokumen < 4) {
                System.out.println("--- Hasil ---");
                System.out.println("Nama Mahasiswa      : " + nama);
                System.out.println("Status Dana         : TIDAK DIBERIKAN");
                System.out.println("Alasan              : Dokumen Tidak Lengkap");
                System.out.println("Dokumen Kurang      : " + (4 - jumlahDokumen));
            } else {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("--- Hasil ---");
                    System.out.println("Nama Mahasiswa      : " + nama);
                    System.out.println("Status Dana         : DIBERIKAN");
                    System.out.println("Alasan              : Mendapat juara " + peringkatJuara + " dan dokumen lengkap");
                } else {
                    System.out.println("--- Hasil ---");
                    System.out.println("Nama Mahasiswa      : " + nama);
                    System.out.println("Status Dana         : TIDAK DIBERIKAN");
                    System.out.println("Alasan              : Bukan Juara 1, 2, atau 3");
                }
            }  
        } else if (jenisKegiatan.equalsIgnoreCase("Mandiri")) {
            System.out.print("Masukkan Peringkat Juara (1/2/3, 0 jika bukan juara) : ");
            peringkatJuara = input.nextInt();
            System.out.print("Masukkan Jumlah Dokumen (0-4)                        : ");
            jumlahDokumen = input.nextInt();
            if (jumlahDokumen < 4) {
                System.out.println("--- Hasil ---");
                System.out.println("Nama Mahasiswa      : " + nama);
                System.out.println("Status Dana         : TIDAK DIBERIKAN");
                System.out.println("Alasan              : Dokumen Tidak Lengkap");
                System.out.println("Dokumen Kurang      : " + (4 - jumlahDokumen));
            } else {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("--- Hasil ---");
                    System.out.println("Nama Mahasiswa      : " + nama);
                    System.out.println("Status Dana         : DIBERIKAN");
                    System.out.println("Alasan              : Mendapat juara " + peringkatJuara + " dan dokumen lengkap");
                } else {
                    System.out.println("--- Hasil ---");
                    System.out.println("Nama Mahasiswa      : " + nama);
                    System.out.println("Status Dana         : TIDAK DIBERIKAN");
                    System.out.println("Alasan              : Bukan Juara 1, 2, atau 3");
                }
            }
        } 
    }
}