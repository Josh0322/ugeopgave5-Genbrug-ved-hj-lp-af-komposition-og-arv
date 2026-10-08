public class Lion extends Animal {

    public Lion(String name, int energy) {
        super(name, energy); // kalder animal-konstruktøren
    }

    @Override
    public int attack() { // Lion — trækker altid et fast højt beløb
        return 15;
    }
}

