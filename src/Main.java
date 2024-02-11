public class Main {
    public static void main(String[] args) {
        {
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";

            String fullName = lastName + " " + firstName + " " + middleName;
            System.out.println("Ф. И. О. сотрудника — " + fullName);

            String upperCase = fullName;
            String result = upperCase.toUpperCase();
            System.out.println("Ф. И. О. сотрудника — " + result);
        }
        {
            String firstName = "Семён";
            String middleName = "СЁмёнович";
            String lastName = "ИВАНОВ-Митин";
            String fullName = lastName + " " + firstName + " " + middleName;
            fullName = fullName.replace("ё","е");
            fullName = fullName.replace("Ё","Е");
            String upperCase = fullName.toUpperCase();
            System.out.println("Ф. И. О. сотрудника — " + upperCase);
        }


    }
}