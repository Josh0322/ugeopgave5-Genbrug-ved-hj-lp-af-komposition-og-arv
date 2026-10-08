import java.util.ArrayList;

    void main() {
        System.out.println("\u001B[34m=== ANIMAL CONTEST ===\u001B[0m");
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Lion("Simba", 80));
        animals.add(new Wolf("Wolfie", 70));
        animals.add(new Rabbit("Bunny"));
        animals.add(new Lion("Mufasa", 90));

        Contest contest1 = new Contest(animals.get(0), animals.get(1));
        contest1.printContestants();

        while (contest1.getWinner() == null) { //Null - spil hvis ingen vinder endnu
            contest1.playRound();
        }

        System.out.println("Vinder: \u001B[32m" + contest1.getWinner().getName() + "\u001B[0m");
        System.out.println(" ");

        Contest contest2 = new Contest(animals.get(2), animals.get(3));
        contest2.printContestants();

        while (contest2.getWinner() == null) {
            contest2.playRound();
        }

        System.out.println("Vinder: \u001B[32m" + contest2.getWinner().getName() + "\u001B[0m");
    }
