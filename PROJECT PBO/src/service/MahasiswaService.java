package service;

import java.util.ArrayList;
import model.Mahasiswa;

public class MahasiswaService {

    private ArrayList<Mahasiswa<String, String, String>> list = new ArrayList<>();

    public void tambah(Mahasiswa<String, String, String> m) {
        list.add(m);
    }

    public void tampil() {
        if (list.isEmpty()) {
            System.out.println("Data kosong!");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.print((i + 1) + ". ");
                list.get(i).print();
            }
        }
    }

    public void hapus(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
            System.out.println("Data berhasil dihapus!");
        } else {
            System.out.println("Index tidak valid!");
        }
    }

    public void edit(int index, String namaBaru, String kelasBaru) {
        if (index >= 0 && index < list.size()) {
            Mahasiswa<String, String, String> m = list.get(index);
            m.setName(namaBaru);
            m.setClas(kelasBaru);
            System.out.println("Data berhasil diupdate!");
        } else {
            System.out.println("Index tidak valid!");
        }
    }
}