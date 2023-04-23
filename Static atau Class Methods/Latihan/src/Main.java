import java.util.ArrayList;

class Pemain{
    private String nama;
    private static ArrayList<String> daftarNama = new ArrayList<String>();
    private static int jumlahPemain;

    Pemain (String nama){
        this.nama = nama;
        Pemain.jumlahPemain++;
        Pemain.daftarNama.add(this.nama);
    }

    void tampilNama(){
        System.out.println("Nama Pemain\t\t: "+nama);
    }

    //static method
    static void tampilJumlahPemain(){
        System.out.println("\nJumlah Pemain\t: "+Pemain.jumlahPemain);
    }

    static ArrayList<String> getDaftarNama(){
        return Pemain.daftarNama;
    }
}

public class Main {
    public static void main(String[] args) {
        Pemain pemain1 = new Pemain("Reza");
        Pemain pemain2 = new Pemain("Alfara");
        Pemain pemain3 = new Pemain("Alex");
        Pemain pemain4 = new Pemain("Andi");
        Pemain pemain5 = new Pemain("Ariel");

        Pemain.tampilJumlahPemain();

        System.out.println("Daftar nama pemain\t: "+Pemain.getDaftarNama());
        //System.out.println("Daftar nama pemain\t: "+pemain1.getDaftarNama());     //ini bisa dilakukan, tetapi tidak direkomendasikan

    }
}