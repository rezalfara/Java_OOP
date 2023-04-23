package latihan;

//ini akan mengimport class Console
import terminal.Console;

//ini akan mengimport static method dari Console
import static terminal.Console.log;

// class tidak bisa digunakan, karna menggunakan keyword private, Keyword pada class (default, public)
//private class Test{
//
//}

class Main {
    public static void main(String[] args) {
        Pemain pemain1 = new Pemain("Reza");
        Pemain pemain2 = new Pemain("Alfara");
        Pemain pemain3 = new Pemain("Alex");

        pemain1.tampilNama();
        pemain2.tampilNama();
        pemain3.tampilNama();
        System.out.println();
        System.out.println("Menampilkan data dengan console.log");
        Console.log(pemain1.getNama());
        System.out.println("Menampilkan data dengan log saja");
        log(pemain1.getNama());

    }
}