package latihan;

public class Mahasiswa {
    private String nama;
    private static int jumlahMahasiswa;

    //Overloading constructor
    //opsi 1
    Mahasiswa(String nama){
        Mahasiswa.jumlahMahasiswa++;
        this.nama = nama;
    }

    //opsi 2
    Mahasiswa(){
        Mahasiswa.jumlahMahasiswa++;
        this.nama = "Mahasiswa "+Mahasiswa.jumlahMahasiswa;
    }

    void tampil(){
        System.out.println("Nama\t: "+this.nama);
    }
}
