package latihan;
public class Hero {
    String nama;
    double attackPower, health;

    Hero(String namaInput, double attackInput, double healthInput){
        this.nama = namaInput;
        this.attackPower = attackInput;
        this.health = healthInput;
    }

    //method attack
    void attack(Hero lawan){
        System.out.println("\n"+this.nama+" menyerang "+lawan.nama);
        lawan.takeDamage(this.attackPower);
    }

    void takeDamage(double damage){
        System.out.println(this.nama+" menerima damage sebesar "+damage);
        this.health -= damage;
    }

    void display(){
        System.out.println("\nNama Hero\t\t: "+this.nama);
        System.out.println("Health\t\t\t: "+this.health);
        System.out.println("Attack Power\t: "+this.attackPower);
    }
}
