//membuat class dengan constructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    
    //constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Reza Alfara", "1857301003", "TIK");
        Mahasiswa mahasiswa2 = new Mahasiswa("Rahma Dayanti", "1857301022", "TIK");
        Mahasiswa mahasiswa3 = new Mahasiswa("Cut Salsabila Umara", "1857301008", "TIK");
        Mahasiswa mahasiswa4 = new Mahasiswa("Salsabila Akmal", "1857301014", "TIK");
    }
}