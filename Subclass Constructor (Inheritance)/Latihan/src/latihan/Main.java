package latihan;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Hero 1", 60, 20);
        hero1.display();

        Hero_Tank hero2 = new Hero_Tank("Johnson", 70, 90);
        hero2.display();

        Hero_Tank hero3 = new Hero_Tank("Franco");
        hero3.display();
    }
}