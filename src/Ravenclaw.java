public class Ravenclaw extends hogwarts{
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
}
