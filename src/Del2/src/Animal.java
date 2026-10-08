public abstract class Animal {
    private String name;
    private int energy;

    public Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public boolean isActive() {
        return energy > 0;
    }

    public abstract int attack(); // abstrakt, fordi hvert dyr skal angribe på sin egen måde.

    @Override
    public String toString() {
        return name + " (energi: " + energy + ")";
    }
}