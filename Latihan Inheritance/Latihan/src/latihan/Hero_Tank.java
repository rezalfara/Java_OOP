package latihan;

public class Hero_Tank extends Hero{
    String type = "Tank";

    //subclass constructor
    Hero_Tank(String namaInput, double attackInput, double healthInput){
        super(namaInput, attackInput, healthInput);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type\t\t\t: "+this.type);
    }

    @Override
    void takeDamage(double damage) {
        System.out.println(this.nama+" menerima half damage sebesar "+damage+" -> "+0.5*damage);
        this.health -= 0.5*damage;
    }
}
