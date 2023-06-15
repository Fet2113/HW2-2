public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int magic, int transgession, int nobility, int honor, int bravery) {
        super(name, magic, transgession);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    int calculateSpecificScore() {
        return this.nobility + this.honor + this.bravery;
    }

    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Гриффиндорец, чем %s", best.getName(), worst.getName()));
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility" + nobility +
                ", honor" + honor +
                ", bravery" + bravery +
                "} " + super.toString();
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public static Griffindor findStudents(String name, Griffindor[] griffindors) {
        for (int i = 0; i < griffindors.length; i++) {
            if (name == griffindors[i].getName())
                return griffindors[i];
        }
        return null;
    }

}
