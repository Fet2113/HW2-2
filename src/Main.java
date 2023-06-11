public class Main {
    public static void main(String[] args) {
        Griffindor[] griffindors = {
                new Griffindor("Harry Potter", 15, 21, 9, 15, 12),
                new Griffindor("Hermiona Grenger", 10, 18, 12, 10, 9),
                new Griffindor("Ron Uisly", 7, 24, 7, 16, 15)};
        Slytherin[] slytherins = {
                new Slytherin("Draco Malfoy", 12, 24, 11, 20, 13, 14, 15),
                new Slytherin("Greham Montegu", 9, 20, 5, 4, 3, 2, 1),
                new Slytherin("Gregory Goil", 10, 17, 3, 2, 1, 4, 5)};
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Zahary Smit", 12, 18, 1, 2, 3, 7),
                new Ravenclaw("Sadrik Diggery", 16, 19, 3, 2, 1, 6),
                new Ravenclaw("Dgastin Finch", 6, 22, 2, 3, 1, 5)};
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Dgou Chang", 11, 20, 1, 2, 3),
                new Hufflepuff("Padma Patil", 10, 25, 3, 2, 3),
                new Hufflepuff("Marcus Belby", 7, 19, 3, 2, 1)
        };
        Griffindor wizard = Griffindor.findStudents("Harry Potter", griffindors);

        if (wizard == null)
            System.out.println("Это ОРКИ");
        else
            System.out.println(wizard.getName() + "\n"
                    + "Сила магии - " + wizard.getMagic() + "\n"
                    + "Трансгрессирование - " + wizard.getTransgession() + "\n"
                    + "Честь - " + wizard.getHonor() + "\n"
                    + "Храбрость - " + wizard.getBravery() + "\n"
                    + "Благородство - " + wizard.getNobility());

        Hogwarts harry = new Griffindor("Harry Potter", 15, 21, 9, 15, 12);
        Hogwarts draco = new Slytherin("Draco Malfoy", 12, 24, 11, 20, 13, 14, 15);
        Hogwarts hermiona = new Griffindor("Hermiona Grenger", 10, 18, 12, 10, 9);

        hermiona.compare(harry);
        harry.compare(draco);

    }

}
