class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(){
        System.out.println("\nNama buku : "+this.judul);
        System.out.println("Nama penulis : "+this.penulis);
    }
}


public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Buku 1", "Reza Alfara");
        buku1.display();

        //Menampilkan address buku1
        String addressbuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressbuku1);

        //assignment object
        Buku buku2 = buku1;
        buku2.display();
        String addressbuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressbuku2);

        //karena buku1 dan buku2 berada pada address atau referensi yang sama
        buku1.judul = "Ini buku 1";
        buku1.display();
        buku2.display();

        //memasukkan object ke dalam method
        fungsi(buku2);
        buku1.display();
        buku2.display();
    }

    public static void fungsi(Buku dataBuku){
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("Address dalam fungsi : "+addressDataBuku);
        dataBuku.penulis = "Anonymous";
    }
}