import java.util.ArrayDeque;

// TUGAS NO 2
public class ContohArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> antrian = new ArrayDeque<>();

        // Tambah data
        antrian.add("A");
        antrian.add("B");
        antrian.add("C");

        // Ambil data (FIFO)
        System.out.println("Keluar: " + antrian.poll());
        System.out.println("Isi sekarang: " + antrian);
    }
}