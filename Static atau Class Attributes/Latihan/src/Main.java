class Display{
    static String static1 = "contoh static(public)";
    private String nama;

    Display(String nama){
        this.nama = nama;
    }

    void setStatic1(String inputStatic1) {
        //static1 = inputStatic1;         //alternatif 1
        //this.static1 = inputStatic1;    //alternatif 2
        Display.static1 = inputStatic1;

    }

    void show(){
        System.out.println("Nama\t: "+this.nama);
    }
}

public class Main {
    public static void main(String[] args) {
        Display nama1 = new Display("Reza");
        nama1.show();
        System.out.println();

        nama1.setStatic1("CONTOH STATIC");

        //tampilkan static variabel atau class variabel
        System.out.println(nama1.static1);
        System.out.println(Display.static1);
        System.out.println();

    }
}