package latihan;

public class Hero_Fighter extends Hero{
    String type = "Fighter";

    //subclass constructor
    Hero_Fighter(String namaInput, double attackInput, double healthInput){
        super(namaInput, attackInput, healthInput);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type\t\t\t: "+this.type);
    }

    @Override
    void takeDamage(double damage) {
        System.out.println(this.nama+" menerima damage 2x lipat sebesar "+damage+" -> "+2*damage);
        this.health -= 2*damage;
    }
}
