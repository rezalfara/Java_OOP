package latihan;

//Subclass
class Hero_Mage extends Hero{
    double magicPower;

    //overriding methods
    void display(){
        System.out.println("\nHero Mage");
        System.out.println("Nama Hero\t: "+this.nama);
        System.out.println("Magic Power\t: "+this.magicPower);
    }
}
