package model;

public class MahasiswaAktif extends Mahasiswa<String, String, String> {

    @Override
    public void getInfo() {
        System.out.println("Mahasiswa Aktif: " + getName());
    }
}