package latihan;

public class Hero{
    //attribute
    String nama;
    double attackPower;
    double defencePower;

    //constructor
    Hero(String nama, double attackPower, double defencePower){
        this.nama = nama;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
    }

    //overloading constructor
    Hero(String nama){
        this.nama = nama;
    }

    //method
    void display(){
        System.out.println("\nNama Hero\t\t: "+this.nama);
        System.out.println("Attack Power\t: "+this.attackPower);
        System.out.println("Defence Power\t: "+this.defencePower);
    }
}