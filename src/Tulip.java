public class Tulip extends Flowers {


    public Tulip() {
        super(20);
    }

    public String toString() {
        return "Tulip" + "(" + super.getCost() + ")";
    }
}
