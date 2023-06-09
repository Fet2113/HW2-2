public class hogwarts {
    private String name;
    private int magic;
    private int transgession;

    public hogwarts(String name, int magic, int transgession) {
        this.name = name;
        this.magic = magic;
        this.transgession = transgession;
    }
    public String getName() {
        return name;
    }
    public int getMagic() {
        return magic;
    }
    public int getTransgession() {
        return transgession;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setTransgession(int transgession) {
        this.transgession = transgession;
    }
}
