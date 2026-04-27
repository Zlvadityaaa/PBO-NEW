package model;

public class Mahasiswa<T, U, V> extends Person implements Printable {
    private T nim;
    private V clas;

    public void setNim(T nim) {
        this.nim = nim;
    }

    public void setName(U name) {
        this.name = (String) name;
    }

    public void setClas(V clas) {
        this.clas = clas;
    }

    public T getNim() {
        return nim;
    }

    public V getClas() {
        return clas;
    }

    @Override
    public void getInfo() {
        System.out.println("Mahasiswa: " + name);
    }

    @Override
    public void print() {
        System.out.println(nim + " | " + name + " | Kelas: " + clas);
    }
}