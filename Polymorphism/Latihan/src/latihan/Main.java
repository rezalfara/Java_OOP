package latihan;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Hero 1");
        Hero_Tank hero2 = new Hero_Tank("Johnson");

        //hero1.display();
        //hero2.display();

        //Polymorphic
        Hero hero3 = new Hero_Mage("Cyclops");
        //hero3.display();

        Hero_Fighter hero4 = new Hero_Fighter("Hilda");
        //hero4.display();

        //TIDAK BISA
//        Hero_Mage hero4 = new Hero("Kadita");
//        hero4.display();

        //ArrayList
        Hero[] kumpulanHero = new Hero[4];
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = hero3;
        kumpulanHero[3] = hero4;    //casting

        kumpulanHero[0].display();
        kumpulanHero[1].display();
        kumpulanHero[2].display();
        kumpulanHero[3].display();

        //method calls
//        kumpulanHero[3].showoff();        //sehingga ini tidak bisa
        hero4.showoff();

        //APLIKASI
        hero1.attack(hero2);
        hero1.attack(hero3);
        hero1.attack(hero4);


    }
}