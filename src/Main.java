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
            String middleName = "Семёнович";
            String lastName = "Иванов";
            String fullName = lastName + " " + firstName + " " + middleName;
            String fullNameNew = fullName.replace("ё","е");
            String upperCase = fullNameNew.toUpperCase();
            System.out.println("Ф. И. О. сотрудника — " + upperCase);
        }

    }
}