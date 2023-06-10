public class Main {
    public static void main(String[] args) {
        Griffindor[] griffindors = {
                new Griffindor("Harry Potter", 15, 21, 9, 15, 12),
                new Griffindor("Hermiona Grenger", 10, 18, 12, 10, 9),
                new Griffindor("Ron Uisly", 7, 24, 7, 16, 15)};
        Slytherin[] slytherins = {
                new Slytherin("Draco Malfoy", 12, 24, 1, 2, 3, 4, 5),
                new Slytherin("Greham Montegu", 9, 20, 5, 4, 3, 2, 1),
                new Slytherin("Gregory Goil", 10, 17, 3, 2, 1, 4, 5)};
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Zahary Smit", 12, 18, 1, 2, 3),
                new Ravenclaw("Sadrik Diggery", 16, 19, 3, 2, 1),
                new Ravenclaw("Dgastin Finch", 6, 22, 2, 3, 1)};
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Dgou Chang", 11, 20, 1, 2, 3),
                new Hufflepuff("Padma Patil", 10, 25, 3, 2, 3),
                new Hufflepuff("Marcus Belby", 7, 19, 3, 2, 1)
        };

        Griffindor wizard = Griffindor.findStudents("Harry Potter", griffindors);
        Griffindor wizard1 = Griffindor.findStudents("Hermiona Grenger", griffindors);

        if (wizard == null)
            System.out.println("Это ОРКИ");
        else
            System.out.println(wizard.getName() + "\n"
                    + "Сила магии - " + wizard.getMagic() + "\n"
                    + "Трансгрессирование - " + wizard.getTransgession() + "\n"
                    + "Честь - " + wizard.getHonor() + "\n"
                    + "Храбрость - " + wizard.getBravery() + "\n"
                    + "Благородство - " + wizard.getNobility());

        if (wizard.getStudentsPower() > wizard1.getStudentsPower())
            System.out.println(wizard.getName() + " лучший Гриффиндорец, чем " + wizard1.getName());
        else if (wizard.getStudentsPower() < wizard1.getStudentsPower())
            System.out.println(wizard.getName() + " лучший Гриффиндорец, чем " + wizard1.getName());
        else
            System.out.println("Это ОРКИ");

        Slytherin swizard = Slytherin.findStudents("Draco Malfoy", slytherins);
        Ravenclaw rwizard = Ravenclaw.findStudents("Sadrik Diggery", ravenclaws);

        if (swizard.getStudentsPowerMagic() > rwizard.getStudentsPowerMagic())
            System.out.println(swizard.getName() + " круче, чем " + rwizard.getName());
        else if (swizard.getStudentsPowerMagic() < rwizard.getStudentsPowerMagic())
            System.out.println(rwizard.getName() + " круче, чем " + swizard.getName());
        else
            System.out.println("Это ОРКИ");
    }

}
