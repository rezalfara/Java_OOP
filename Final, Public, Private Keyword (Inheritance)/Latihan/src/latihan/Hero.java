package latihan;

public class Hero {
    public String nama;
    private double health;

    Hero(String nama, double health){
        this.nama = nama;
        this.health = health;
    }

    //Getter
    public double getHealth(){
        return this.health;
    }

    //Setter
    final void setHealth(double newHealth){
        this.health = newHealth;
    }

    // bisa di overload
    void setHealth(String mode){
        if (mode.equals("reset")){
            this.health = 100;
        }
    }

    public void display(){
        System.out.println(this.nama+" mempunyai health "+this.health);
    }
}
