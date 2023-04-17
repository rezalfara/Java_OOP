

//membuat class sebagai template
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}



public class Main {
    public static void main(String[] args) {

        //membuat object baru / instansiasi
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Reza Alfara";
        mahasiswa1.NIM = "1857301003";
        mahasiswa1.jurusan = "TIK";
        mahasiswa1.IPK = 3.59;
        mahasiswa1.umur = 22;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Rahma";
        mahasiswa2.NIM = "1857301022";
        mahasiswa2.jurusan = "TIK";
        mahasiswa2.IPK = 3.65;
        mahasiswa2.umur = 22;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);


    }
}