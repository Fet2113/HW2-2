public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstforpower;

    public Slytherin(String name, int magic, int transgession, int cunning, int determination, int ambition, int resourcefulness, int thirstforpower) {
        super(name, magic, transgession);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstforpower = thirstforpower;
    }

    @Override
    int calculateSpecificScore() {
        return this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstforpower;
    }

    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Слизеринец, чем %s", best.getName(), worst.getName()));
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning" + cunning +
                "determination" + determination +
                "ambition" + ambition +
                "resourcefulness" + resourcefulness +
                "thirstforpower" + thirstforpower +
                "} " + super.toString();
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstforpower() {
        return thirstforpower;
    }

    public static Slytherin findStudents(String name, Slytherin[] slytherins) {
        for (int i = 0; i < slytherins.length; i++) {
            if (name == slytherins[i].getName())
                return slytherins[i];
        }
        return null;
    }
}
