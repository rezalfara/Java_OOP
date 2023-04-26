package latihan;

public class Hero_Tank extends Hero{
    String type = "Tank";

    Hero_Tank(String nama){
        super(nama);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type\t\t: "+this.type);
    }
}
