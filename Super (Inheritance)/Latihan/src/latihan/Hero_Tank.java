package latihan;

//Child class
public class Hero_Tank extends Hero{
    String nama = "Class Hero Tank";

    void display(){
        System.out.println("\nIni adalah "+this.nama);
        this.dummyMethod();
    }

    void displaySuper(){
        //keyword super disini akan mengakses atribut dari class Hero (Parent class)
        System.out.println("\nIni adalah "+super.nama);
        super.dummyMethod();
    }

    void dummyMethod(){
        System.out.println("Method ini ada di sub class");
    }
}
