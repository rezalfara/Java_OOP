package latihan;

//Subclass
class Hero_Tank extends Hero{
    double defencePower;

    //overriding methods
    void display(){
        System.out.println("\nHero Tank");
        System.out.println("Nama Hero\t\t: "+this.nama);
        System.out.println("Defence Power\t: "+this.defencePower);
    }
}
