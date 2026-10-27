import java.util.Scanner;

public class Tugas329 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSeluruhBarang = 0;
        int maxBarang = -1;
        int tokoTerbanyak = 0;

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.print("\nToko " + i + "- ");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int totalBarangToko = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("  Masukkan jumlah barang yang dibeli pelanggan ke-" + j + ": ");
                int barangPelanggan = sc.nextInt();
                totalBarangToko += barangPelanggan;
            }

            System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);
            totalSeluruhBarang += totalBarangToko;

            if (totalBarangToko > maxBarang){
                maxBarang = totalBarangToko;
                tokoTerbanyak = i;
            }
        }
        System.out.println("Total barang seluruh toko: " + totalSeluruhBarang);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
    }
}
