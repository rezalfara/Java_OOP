package latihan;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Hero 1", 30, 70);
        hero1.display();

        Hero_Tank hero2 = new Hero_Tank("Johnson", 20, 100);
        hero2.display();

        Hero_Fighter hero3 = new Hero_Fighter("Alpha", 45, 95);
        hero3.display();

        hero2.attack(hero3);
        hero2.display();
        hero3.display();

        hero3.attack(hero2);
        hero2.display();
        hero3.display();
    }
}