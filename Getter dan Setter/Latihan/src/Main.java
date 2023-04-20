class Data{
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data(){
        this.intPublic = 0;
        this.intPrivate = 50;
    }

    //menampilkan semua nilai
    void display(){
        System.out.println("--------------------------------------");
        System.out.println("Nilai intPublic\t\t: "+this.intPublic);
        System.out.println("Nilai intPrivate\t: "+this.intPrivate);
        System.out.println("Nilai doublePrivate\t: "+this.doublePrivate);
    }
    //Getter
    public int getIntPrivate(){
        return this.intPrivate;
    }

    //Setter
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }
}

class Lingkaran{
    public double diameter;

    Lingkaran(double diameter){
        this.diameter = diameter;
    }

    //SETTER
    public void setJari2(double jari2){
        this.diameter = jari2 * 2;
    }

    //GETTER
    public double getjari2(){
        return this.diameter/2;
    }

    //GETTER LUAS
    public double getLuas(){
        return 3.14*(diameter/2)*(diameter/2);
    }
}

public class Main {
    public static void main(String[] args) {
        Data data1 = new Data();

        //read dan write dengan menggunakan public
        data1.intPublic = 15;
        System.out.println("Public\t\t\t: "+data1.intPublic);

        //read only (bisa menggunakan GETTER)
        int angkaPrivate = data1.getIntPrivate();
        System.out.println("Getter(private)\t: "+angkaPrivate);

        //write only (bisa menggunakan SETTER)
        data1.setDoublePrivate(27.4);

        //menampilkan semua nilai
        data1.display();

        //Lingkaran
        Lingkaran lingkaran1 = new Lingkaran(25);
        System.out.println("\nJari-jari : "+lingkaran1.getjari2());
        lingkaran1.setJari2(17.5);
        System.out.println("Jari - jari : "+lingkaran1.getjari2());

        System.out.println("Luas = "+lingkaran1.getLuas());


    }
}