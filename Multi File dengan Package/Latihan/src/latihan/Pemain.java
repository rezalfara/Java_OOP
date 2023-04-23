package latihan;
class Pemain{
    private String nama;

    Pemain(String nama){
        this.nama = nama;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void tampil(){
        System.out.println("Nama Pemain\t: "+this.nama);
    }
}