package latihan;

//keyword import untuk package eksternal
import terminal.Console;

class Main {
    public static void main(String[] args) {
        Pemain pemain1 = new Pemain("Reza");
        Pemain pemain2 = new Pemain("Alfara");
        Pemain pemain3 = new Pemain("Saya");

        pemain1.tampil();
        pemain2.tampil();
        pemain3.tampil();

        Console.log("halo");
    }
}