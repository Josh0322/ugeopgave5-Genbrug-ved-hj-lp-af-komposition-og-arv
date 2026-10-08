public class Rabbit extends Animal {

    public Rabbit(String name) {
        super(name, 100); // Starter med meget energy
    }

    @Override
    public int attack() {
        return 4;
    }
}