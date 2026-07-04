package UAS;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        //  IO Sederhana
        Scanner scanner = new Scanner(System.in);

        //  Array
        PlayStation[] daftarPS = new PlayStation[3];

        //  Object
        daftarPS[0] = new PlayStation(
                "PS01",
                "PlayStation 4 Pro",
                8000,
                "PS4");

        daftarPS[1] = new PlayStation(
                "PS02",
                "PlayStation 5 Digital",
                12000,
                "PS5");

        daftarPS[2] = new PlayStation(
                "PS03",
                "PlayStation 5 Disk Edition",
                15000,
                "PS5");

        System.out.println("====================================");
        System.out.println(" SISTEM MANAJEMEN RENTAL PLAYSTATION ");
        System.out.println("====================================");
        System.out.println("\nDaftar Konsol Tersedia:");

        //  Perulangan
        for (int i = 0; i < daftarPS.length; i++) {
            System.out.println((i + 1) + ". "
                    + daftarPS[i].getInformasi());
        }

        int pilihan;
        int durasi;

        try {

            System.out.print("\nPilih nomor PS yang ingin disewa (1-3): ");
            pilihan = Integer.parseInt(scanner.nextLine());

            //  Seleksi
            if (pilihan < 1 || pilihan > daftarPS.length) {
                System.out.println("Pilihan tidak valid!");
                scanner.close();
                return;
            }

            System.out.print("Masukkan durasi sewa (jam): ");
            durasi = Integer.parseInt(scanner.nextLine());

            //  Seleksi
            if (durasi <= 0) {
                System.out.println("Durasi harus lebih dari 0 jam!");
                scanner.close();
                return;
            }

            PlayStation psDipilih = daftarPS[pilihan - 1];

            double totalBiaya =
                    psDipilih.getHargaPerJam() * durasi;

            System.out.println("\n=== DATA PENYEWAAN ===");
            System.out.println("Item Dipilih : "
                    + psDipilih.getNamaItem());

            System.out.println("Jenis Konsol : "
                    + psDipilih.getJenisKonsol());

            System.out.println("Harga/Jam    : Rp "
                    + psDipilih.getHargaPerJam());

            System.out.println("Durasi       : "
                    + durasi + " jam");

            System.out.println("---------------------------");

            System.out.println("TOTAL BAYAR  : Rp "
                    + totalBiaya);

            System.out.println("---------------------------");
            System.out.println("Terima kasih telah menyewa!");

        }

        //  Error Handling
        catch (NumberFormatException e) {

            System.out.println(
                    "Terjadi Kesalahan: Input harus berupa angka!");

        }

        scanner.close();
    }
}