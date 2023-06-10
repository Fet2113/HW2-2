public class Slytherin extends hogwarts {
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
