package main;

import java.util.Scanner;
import service.MahasiswaService;
import model.Mahasiswa;

public class MainApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MahasiswaService service = new MahasiswaService();

        int pilihan;

        do {
            System.out.println("\n=== MENU MAHASISWA ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Hapus Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    Mahasiswa<String, String, String> m = new Mahasiswa<>();

                    System.out.print("NIM: ");
                    String nim = input.nextLine();

                    System.out.print("Nama: ");
                    String nama = input.nextLine();

                    System.out.print("Kelas: ");
                    String kelas = input.nextLine(); // ✅ FIX

                    m.setNim(nim);
                    m.setName(nama);
                    m.setClas(kelas);

                    service.tambah(m);
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    service.tampil();
                    break;

                case 3:
                    service.tampil();
                    System.out.print("Pilih nomor data yang mau diedit: ");
                    int editIndex = input.nextInt() - 1;
                    input.nextLine();

                    System.out.print("Nama baru: ");
                    String namaBaru = input.nextLine();

                    System.out.print("Kelas baru: ");
                    String kelasBaru = input.nextLine(); // ✅ FIX

                    service.edit(editIndex, namaBaru, kelasBaru);
                    break;

                case 4:
                    service.tampil();
                    System.out.print("Pilih nomor data yang mau dihapus: ");
                    int hapusIndex = input.nextInt() - 1;

                    service.hapus(hapusIndex);
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        input.close();
    }
}