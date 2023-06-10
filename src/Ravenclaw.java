public class Ravenclaw extends hogwarts {
    private int smart;
    private int wise;
    private int wittyandcreativity;

    public Ravenclaw(String name, int magic, int transgession, int smart, int wise, int wittyandcreativity) {
        super(name, magic, transgession);
        this.smart = smart;
        this.wise = wise;
        this.wittyandcreativity = wittyandcreativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWittyandcreativity() {
        return wittyandcreativity;
    }

    public static Ravenclaw findStudents(String name, Ravenclaw[] ravenclaws) {
        for (int i = 0; i < ravenclaws.length; i++) {
            if (name == ravenclaws[i].getName())
                return ravenclaws[i];
        }
        return null;
    }
}
