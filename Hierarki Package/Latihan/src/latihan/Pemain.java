package latihan;

import terminal.Console;

//visibility = default
class Pemain {
    private String nama;

    Pemain(String nama){
        this.nama = nama;
    }

    String getNama(){
        return this.nama;
    }

    void tampilNama(){
//        System.out.println("Nama Pemain\t= "+this.nama);
        Console.log("Menggunakan Console");
        Console.log("Nama Pemain\t: "+this.nama);

    }
}
