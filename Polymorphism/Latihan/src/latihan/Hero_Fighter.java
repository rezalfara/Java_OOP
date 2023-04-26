package latihan;

public class Hero_Fighter extends Hero{
    String type = "Fighter";

    Hero_Fighter(String nama){
        super(nama);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type\t\t: "+this.type);
    }

    void showoff(){
        System.out.println("\nSaya Hero Fighter!!");
    }
}
