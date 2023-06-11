public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int magic, int transgession, int hardworking, int loyal, int honest) {
        super(name, magic, transgession);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    int calculateSpecificScore() {
        return this.hardworking + this.loyal + this.honest;
    }

    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Пуффендуец, чем %s", best.getName(), worst.getName()));
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "hardworking" + hardworking +
                "loyal" + loyal +
                "honor" + honest +
                "} " + super.toString();
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public static Hufflepuff findStudents(String name, Hufflepuff[] hufflepuffs) {
        for (int i = 0; i < hufflepuffs.length; i++) {
            if (name == hufflepuffs[i].getName())
                return hufflepuffs[i];
        }
        return null;
    }
}
