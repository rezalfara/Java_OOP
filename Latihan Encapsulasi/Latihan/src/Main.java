class Player{
    private String nama;
    private int baseAttack;
    private int baseHealth;
    private int level;
    private int incrementAttack;
    private int incrementHealth;
    private Armor armor;
    private Weapon weapon;


    Player(String nama){
        this.nama = nama;
        this.baseAttack = 100;
        this.baseHealth = 100;
        this.level = 1;
        this.incrementAttack = 20;
        this.incrementHealth = 20;
    }

    public void setArmor(Armor armor){
        this.armor = armor;
    }
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public int maxHealth(){
        return this.baseHealth + this.level*this.incrementHealth +this.armor.getAddHealth();
    }

    public int getAttackPower(){
        return this.baseAttack + this.level*this.incrementAttack + this.weapon.getAttack();
    }

    public void levelUp(){
        this.level++;
    }

    public void display(){
        System.out.println("Player : "+this.nama);
        System.out.println("Level : "+this.level);
        System.out.println("Max Health : "+this.maxHealth());
        System.out.println("Attack : "+this.getAttackPower());
    }
}

class Weapon{
    private String nama;
    private int attack;

    public Weapon(String nama, int attack){
        this.nama = nama;
        this.attack = attack;
    }

    public int getAttack() {
        return this.attack;
    }
}

class Armor{
    private String nama;
    private int strength;
    private int health;

    Armor(String nama, int strength, int health){
        this.nama = nama;
        this.strength = strength;
        this.health = health;
    }

    public int getAddHealth(){
        return this.strength*10 + this.health;
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Reza");
        Armor armor1 = new Armor("Baju besi", 100, 50);
        Weapon weapon1 = new Weapon("Pedang", 70);

        player1.setArmor(armor1);
        player1.setWeapon(weapon1);
        player1.display();

        player1.levelUp();
        player1.display();

        Player player2 = new Player("Alfara");
        Armor armor2 = new Armor("Kaos", 15, 12);
        Weapon weapon2 = new Weapon("Samurai", 90);

        player2.setArmor(armor2);
        player2.setWeapon(weapon2);
        player2.display();
        player2.levelUp();
        player2.display();
    }
}