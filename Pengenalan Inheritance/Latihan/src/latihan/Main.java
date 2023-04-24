package latihan;

//inheritance adalah hubungan is-a
//interface adalah hubungan has-a

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.nama = "Hero 1";
        hero1.tampil();

        Hero_Tank hero2 = new Hero_Tank();
        hero2.nama = "Johnson";
        hero2.tampil();

        Hero_Mage hero3 = new Hero_Mage();
        hero3.nama = "Cyclops";
        hero3.tampil();
    }
}