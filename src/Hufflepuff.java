public class Hufflepuff extends hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int magic, int transgession, int hardworking, int loyal, int honest) {
        super(name, magic, transgession);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
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
