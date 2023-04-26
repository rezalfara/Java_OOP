package latihan;

public class Hero {
    String nama;

    Hero(String nama){
        this.nama = nama;
    }

    void display(){
        System.out.println("\nNama Hero\t: "+this.nama);
    }

    void attack(Hero lawan){
        System.out.println("\nMenyerang");
    }
}
