import java.util.ArrayList;
// TUGAS NO 2
public class ContohArrayList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswa = new ArrayList<>();

        mahasiswa.add("Ferdi");
        mahasiswa.add("Budi");
        mahasiswa.add("Sinta");

        // Menampilkan isi
        for (String mhs : mahasiswa) {
            System.out.println(mhs);
        }
    }
}