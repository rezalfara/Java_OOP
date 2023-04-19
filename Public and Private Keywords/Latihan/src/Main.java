class Pemain{
    String nama;    //default, dia akan bisa dibaca dan ditulis dari luar class
    public int exp; //public, dia akan bisa dibaca dan ditulis dari luar class
    private int health; //private, dia akan bisa dibaca dan ditulis di dalam class saja

    Pemain(String nama, int exp, int health){
        this.nama = nama;
        this.exp = exp;
        this.health = health;
    }

    //Default modifier access
    void display(){
        tambahHealth();     //contoh mengakses private method
        System.out.println("\nNama\t: "+this.nama);
        System.out.println("Exp\t: "+this.exp);
        System.out.println("Health\t: "+this.health); //membaca, tapi di dalam class
    }

    //Public modifier access
    public void ubahNama(String namaBaru){
        this.nama = namaBaru;
    }

    //Private modifier access
    private void tambahHealth(){
        this.health += 100;
    }

}

public class Main {
    public static void main(String[] args) {
        Pemain pemain1 = new Pemain("Reza", 25, 100);

        //Default
        System.out.println(pemain1.nama);   //membaca data
        pemain1.nama = "Reza Alfara";       //menulis data
        System.out.println(pemain1.nama);   //membaca data

        //Public
        System.out.println(pemain1.exp);   //membaca data
        pemain1.exp = 0;                   //menulis data
        System.out.println(pemain1.exp);   //membaca data

        //Private (Tidak bisa diakses)
//        System.out.println(pemain1.health);   //membaca data
//        pemain1.health = 200;                 //menulis data
//        System.out.println(pemain1.health);   //membaca data

        //Methods
        //default
        pemain1.display();

        //public
        pemain1.ubahNama("Alfara Reza");
        pemain1.display();

        //private (Tidak bisa diakses)
//        pemain1.tambahHealth();

    }
}