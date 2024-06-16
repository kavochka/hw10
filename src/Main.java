public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("Ф.И.О. сотрудника - %s.%n", fullName);

        System.out.println("task 2");
        System.out.printf("Данные Ф.И.О. сотрудника для заполнения отчета - %s.%n", fullName.toUpperCase());

        System.out.println("task 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");
        System.out.printf("Данные Ф.И.О. сотрудника - %s.%n", fullName);

    }
}