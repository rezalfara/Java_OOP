class Player{
    private String nama;
    private int baseAttack;
    private int baseHealth;
    private int level;
    private int incrementAttack;
    private int incrementHealth;
    private int totalDamage;
    private boolean isAlive;

    //ini adalah object member
    private Armor armor;
    private Weapon weapon;


    Player(String nama){
        this.nama = nama;
        this.baseAttack = 100;
        this.baseHealth = 100;
        this.level = 1;
        this.incrementAttack = 20;
        this.incrementHealth = 20;
        this.isAlive = true;
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

    private void levelUp(){
        this.level++;
    }

    public String getNama(){
        return this.nama;
    }

    public int getHealth(){
        return this.maxHealth() - this.totalDamage;
    }

    public void display(){
        System.out.println("Player\t\t: "+this.nama);
        System.out.println("Level\t\t: "+this.level);
        System.out.println("Health\t\t: "+this.getHealth()+"/"+this.maxHealth());
        System.out.println("Attack\t\t: "+this.getAttackPower());
        System.out.println("Alive\t\t: "+this.isAlive+"\n");
    }

    public int getAttackPower(){
        return this.baseAttack + this.level*this.incrementAttack + this.weapon.getAttack();
    }

    public void attack(Player opponent){
        //hitung total damage
        int damage = this.getAttackPower();
        //print event
        System.out.println("Player : "+this.nama+ " is attacking "+ opponent.getNama()+" dengan damage : "+damage);
        //attack si opponent
        opponent.defence(damage);

        this.levelUp();
    }

    public void defence(int damage){

        //receive damage
        int defencePower = this.armor.getDefencePower();
        int deltaDamage;

        System.out.println("Defence power = "+defencePower);
        if (damage > defencePower){
            deltaDamage = damage - defencePower;
        }else {
            deltaDamage = 0;
        }

        System.out.println("Damage earned = "+deltaDamage+"\n");

        //adding total damage
        this.totalDamage += deltaDamage;

        //check isAlive
        if (this.getHealth() <= 0){
            this.isAlive = false;
            this.totalDamage = this.maxHealth();
        }

        this.display();
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

    public int getDefencePower() {
        return this.strength*2;
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Reza");
        Armor armor1 = new Armor("Baju besi", 100, 50);
        Weapon weapon1 = new Weapon("Pedang", 70);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        Player player2 = new Player("Alfara");
        Armor armor2 = new Armor("Kaos", 15, 12);
        Weapon weapon2 = new Weapon("Samurai", 90);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.display();
        player2.display();

        player1.attack(player2);
        player2.attack(player1);
        player1.attack(player2);

    }
}