public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, int magic, int transgession, int smart, int wise, int witty, int creativity) {
        super(name, magic, transgession);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    @Override
    int calculateSpecificScore() {
        return this.smart + this.wise + this.witty + this.creativity;
    }

    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Когтевранец, чем %s", best.getName(), worst.getName()));
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "smart" + smart +
                "wise" + wise +
                "witty" + witty +
                "creativity" + creativity +
                "} " + super.toString();
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public static Ravenclaw findStudents(String name, Ravenclaw[] ravenclaws) {
        for (int i = 0; i < ravenclaws.length; i++) {
            if (name == ravenclaws[i].getName())
                return ravenclaws[i];
        }
        return null;
    }
}
