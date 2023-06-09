public class Main {
    public static void main(String[] args) {
        hogwarts[] students = {
                new hogwarts("Harry Potter", 15, 21),
                new hogwarts("Hermiona Grenger", 10, 18),
                new hogwarts("Ron Uisly", 7, 24),
                new hogwarts("Draco Malfoy", 12, 24),
                new hogwarts("Greham Montegu", 9, 20),
                new hogwarts("Gregory Goil", 10, 17),
                new hogwarts("Zahary Smit", 12, 18),
                new hogwarts("Sadrik Diggery", 16, 19),
                new hogwarts("Dgastin Finch", 6, 22),
                new hogwarts("Dgou Chang", 11, 20),
                new hogwarts("Padma Patil", 10, 25),
                new hogwarts("Marcus Belby", 7, 19),

        };
        System.out.println("Студенты : " + students.length);
        for (int i = 0; i < students.length; i++) {
            hogwarts hogwarts = students[i];

            System.out.println("Ученик " + hogwarts.getName()
                    + "; Сила магии - " + hogwarts.getMagic()
                    + "; Трансгрессирование - " + hogwarts.getTransgession());
        }
        Griffindor[] gStudents = {
                new Griffindor("Harry Potter", 10, 21, 18, 25, 30)
        };
        System.out.println("Грифиндорф :" + gStudents.length);
        for (int i = 0; i < gStudents.length; i++) {
            Griffindor griffindor = gStudents[i];

            System.out.println("Ученик " + griffindor.getName()
                    + "; Сила магии - " + griffindor.getMagic()
                    + "; Трансгрессирование - " + griffindor.getTransgession()
                    + ": Благородство - " + griffindor.getNobility()
                    + ": Честь - " + griffindor.getBravery()
                    + ": Храбрость - " + griffindor.getHonor()
            );

            Griffindor HarryPotter = new Griffindor("Harry Potter", 15, 21, 18, 25, 30);
            Griffindor HermionaGrenger = new Griffindor("Hermiona Grenger", 10, 18, 24, 25, 21);
            System.out.println("Ученик Hermiona Grenger :"
                    + " Сила магии - " + HermionaGrenger.getMagic()
                    + "; Трансгрессирование - " + HermionaGrenger.getTransgession()
                    + ": Благородство - " + HermionaGrenger.getNobility()
                    + ": Честь - " + HermionaGrenger.getHonor()
                    + ": Храбрость - " + HermionaGrenger.getBravery());
            System.out.println("Ученик Harry Potter :"
                    + " Сила магии - " + HarryPotter.getMagic()
                    + "; Трансгрессирование - " + HarryPotter.getTransgession()
                    + ": Честь - " + HarryPotter.getHonor()
                    + ": Храбрость - " + HarryPotter.getBravery()
                    + ": Благородство - " + HarryPotter.getNobility());

        }
    }
}
