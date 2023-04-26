package latihan;

//  public ini akan terbuka untuk semuanya
public class Hero_Tank extends Hero{
    Hero_Tank(String nama, double health){
        super(nama, health);
//        System.out.println(this.health);      //tidak bisa diakses karena private
    }

    //override getHealth
    //karena di super class method: public, maka di subclass harus public
//    public double getHealth(){
////        return this.health;     //ini tidak mau
//    }


    //visibility harus sama dengan super class
    public void display(){
        System.out.println(this.nama+" mempunyai health sebanyak "+this.getHealth());
    }

    //kita coba override setter setHealth, ini tidak bisa dilakukan
//    void setHealth(double newHealth){
//        System.out.println("mencoba memasukkan health = "+newHealth);
//    }


    //ini bisa dilakukan
    @Override
    void setHealth(String newHealth) {
        System.out.println("mencoba memasukkan health = "+newHealth);
    }
}
