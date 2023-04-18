import java.sql.SQLOutput;

//Player
class Player{
    String name;
    double health;
    int level;
    //object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("Name : "+this.name);
        System.out.println("Health : "+this.health+" HP");
        this.weapon.display();
        this.armor.display();
        System.out.println("----------------------------------------");
    }
}

//Weapon
class Weapon{
    String name;
    double attackPower;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon : "+ this.name + ", Attack : "+ this.attackPower);
    }
}

//Armor
class Armor{
    String name;
    double defencePower;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor : "+this.name+", Defence : "+this.defencePower);
    }
}

public class Main {
    public static void main(String[] args) {
        //membuat object player
        Player player1 = new Player("Reza", 100);
        Player player2 = new Player("Alfara", 75);

        //membuat object weapon
        Weapon pedang = new Weapon("Pedang", 90);
        Weapon panah = new Weapon("Panah", 80);

        //membuat object armor
        Armor bajuBesi = new Armor("Baju Besi", 50);
        Armor kaos = new Armor("Kaos", 15);

        //player 1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        //player 2
        player2.equipWeapon(panah);
        player2.equipArmor(kaos);
        player2.display();



    }
}