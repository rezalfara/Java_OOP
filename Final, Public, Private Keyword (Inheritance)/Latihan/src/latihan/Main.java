package latihan;

//visibility
//1. Public : jika method atau attribut dalam public secara explisit,
//   maka subclass tidak boleh mengurangi visibility.
//2. Private : jika method atau attribut dalam private secara explisit,
//   maka subclass pun tidak dapat mengakses.
//3. Final : method atau attribut dengan final keyword akan diwariskan,
//    tapi tidak bisa di override. dalam class yang sama bisa di overload.


public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Hero 1", 100);
        Hero_Tank hero2 = new Hero_Tank("Hero 2", 80);

        hero1.display();
        hero2.display();

        System.out.println(hero1.getHealth());
        System.out.println(hero2.getHealth());

        hero1.setHealth(150);
        hero1.display();

        hero1.setHealth("reset");
        hero1.display();


        hero2.setHealth("reset");
        hero2.display();
    }
}