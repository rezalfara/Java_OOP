package latihan;

public class Main {
    public static void main(String[] args) {
        //Overloading pada constructor
        Mahasiswa mahasiswa1 = new Mahasiswa("Reza Alfara");
        Mahasiswa mahasiswa2 = new Mahasiswa();
        Mahasiswa mahasiswa3 = new Mahasiswa();
        Mahasiswa mahasiswa4 = new Mahasiswa("Anonymous");

        mahasiswa1.tampil();
        mahasiswa2.tampil();
        mahasiswa3.tampil();
        mahasiswa4.tampil();

        //Overloading pada method
        System.out.println();
        int tambah1 = Matematika.tambah(5,5);
        System.out.println(tambah1);
        double tambah2 = Matematika.tambah(2,2.5);
        System.out.println(tambah2);

    }
}