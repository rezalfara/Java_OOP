
class Mahasiswa{
    //Data member
    String nama;
    String NIM;

    //Constructor
    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    //method tanpa return dan tanpa parameter
    void tampil(){
        System.out.println("Nama : "+this.nama);
        System.out.println("NIM  : "+this.NIM);
    }

    //method tanpa return dan dengan parameter
    void ubahNama(String nama){
        this.nama = nama;
    }

    //method dengan return dan tanpa parameter
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }

    //method dengan return dan dengan parameter
    String sayHi(String message){
        return message + " juga, Nama saya " + this.nama;
    }
}


public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Reza", "1857301003");
        mahasiswa1.tampil();
        mahasiswa1.ubahNama("Alfara");
        mahasiswa1.tampil();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("Halo");
        System.out.println(data);
    }
}