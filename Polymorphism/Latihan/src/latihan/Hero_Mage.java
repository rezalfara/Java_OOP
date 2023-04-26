package latihan;

public class Hero_Mage extends Hero{
    String type = "Mage";

    Hero_Mage(String nama){
        super(nama);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type\t\t: "+this.type);
    }
}
