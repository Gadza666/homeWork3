public class Main {
    public static void main(String[] args) {
        System.out.println("Halla Vandala World!");

        System.out.println(" Task1 ");
        int age = 13;
        if (age >= 18) {
            System.out.printf("Если возраст человека равен %s,он совершеннолетний\n", age);
        } else {
            System.out.printf("Если возраст человека равен %s,он не достиг совершеннолетия, нужно немного подождать\n", age);
        }

        System.out.println(" Task2 ");
        int temperature = 5;
        if (temperature >= 5) {
            System.out.printf(" На улице %s градуса, нужно надеть шапку%n ", temperature);
        } else {
            System.out.printf(" На улице %s градуса, можно идти без шапки%n ", temperature);
        }

        System.out.println(" Task3 ");
        int speed = 260;
        if (speed > 60) {
            System.out.printf("Если скорость %s, то придется заплатить штраф%n", speed);
        } else {
            System.out.printf("Если скорость %s, то можно ехать спокойно%n", speed);
        }

        System.out.println(" Task4 ");
        int newAge = 3;
        if (newAge >= 2 && newAge <= 6) {
            System.out.printf(" Если возраст человека равен %s, то ему нужно ходить в сад%n", newAge);
        }
        if (newAge > 6 && newAge <= 17) {
            System.out.printf(" Если возраст человека равен %s, то ему нужно ходить в школу%n", newAge);
        }
        if (newAge > 17 && newAge <= 24) {
            System.out.printf(" Если возраст человека равен %s, то ему нужно ходить в универститет%n", newAge);
        }
        if (newAge > 24) {
            System.out.printf(" Если возраст человека равен %s, то ему нужно ходить на работу%n", newAge);
        }

        System.out.println(" Task5 ");
        int attractionAge = 14;
        if (attractionAge < 5) {
            System.out.printf(" Если возраст ребенка равен %s, то нельзя кататься на аттракционе%n", attractionAge);
        }
        if (attractionAge >= 5 && attractionAge <= 14) {
            System.out.printf(" Если возраст ребенка равен %s, то можно кататься на аттракционе в сопровождении%n", attractionAge);
        }
        if (attractionAge > 14) {
            System.out.printf(" Если возраст ребенка равен %s, то можно кататься на аттракционе без сопровождения взрослого%n", attractionAge);
        }

        System.out.println(" Task6 ");
        int trainCarriage = 102;
        int seatCapacite = 62;
        int position = 300;
        if (position <= seatCapacite) {
            System.out.println(" Есть сидячие места ");
        }
        if (position > seatCapacite && position <= trainCarriage) {
            System.out.println(" Есть только стоячие места ");
        }
        if (position > trainCarriage) {
            System.out.println(" Мест нет");
        }

        System.out.println(" Task7 ");
        int one = 2;
        int two = 70;
        int three = 5;
        if (one > two && one > three) {
            System.out.println(" One большее число");
        }
        if (two > one && two > three) {
            System.out.println(" Второе большее число");
        }
        if (three > one && three > two) {
            System.out.println(" Третье большее число");
        }

        System.out.println(" The End ");


    }


}



