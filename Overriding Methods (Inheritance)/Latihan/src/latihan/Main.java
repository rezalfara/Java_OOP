package latihan;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.nama = "Hero 1";
//        hero1.defencePower = Tidak punya;
//        hero1.magicPower = Tidak punya;
        hero1.display();

        Hero_Tank hero2 = new Hero_Tank();
        hero2.nama = "Johnson";
        hero2.defencePower = 50.0;
        hero2.display();

        Hero_Mage hero3 = new Hero_Mage();
        hero3.nama = "Cyclops";
        hero3.magicPower = 35.5;
        hero3.display();

    }
}