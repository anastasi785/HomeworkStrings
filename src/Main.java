public class Main {
    public static void main(String[] args) {
        char a = 040;
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName +a+ lastName+a + middleName;

        System.out.println(fullName);
        //задание 2
        String str = fullName;
        String results = str.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета "+results);
        //Задание3
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.println(fullName1);

    }
}