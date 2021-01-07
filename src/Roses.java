public class Roses extends Flowers {

    public Roses() {
        super(45);
    }

    public String toString() {
        return "Roses" + "(" + super.getCost() + ")";
    }
}
