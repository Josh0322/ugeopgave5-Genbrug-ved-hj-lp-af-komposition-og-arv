public class Wolf extends Animal {

    public Wolf(String name, int energy) {
        super(name, energy); // kalder konstruktøren
    }

    @Override
    public int attack() {
        return (int)(Math.random() * 8) + 5; // Wolf — trækker et tilfældigt beløb ud af 8 muligheder (5-12)
    }
}