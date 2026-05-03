import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student Alex = new Student("Александр", "091-1", 1, new int[]{3, 2, 3, 2, 4});
        Student Roman = new Student("Роман", "091-1", 1, new int[]{5, 5, 5, 5, 5});
        Student Ekaterina = new Student("Екатерина", "092-2", 2, new int[]{4, 4, 3, 4, 3});
        Student Mari = new Student("Мария", "093-1", 3, new int[]{3, 3, 3, 3, 2});
        Student Ruslan = new Student("Руслан", "093-2", 3, new int[]{2, 3, 4, 2, 5});
        ArrayList<Student> studentsList = new ArrayList<Student>(Arrays.asList(Alex, Roman, Ekaterina, Mari, Ruslan));

        Student.printStudents(studentsList, 1);

        System.out.println();

        Student.print(studentsList);
        Student.deleteStudents(studentsList);
        Student.print(studentsList);
        System.out.println();

        System.out.println("Телефонный справочник:");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "8-999-999-99-01");
        phoneBook.add("Петров", "8-999-999-99-02");
        phoneBook.add("Сидоров", "8-999-999-99-03");
        phoneBook.add("Иванов", "8-999-999-99-04");
        phoneBook.add("Петров", "8-999-999-99-05");

        // Ищем номера по фамилии
        List<String> ivanovPhones = phoneBook.get("Иванов");
        System.out.println("Телефоны Иванова: " + ivanovPhones);
        List<String> sidorovPhones = phoneBook.get("Сидоров");
        System.out.println("Телефон Сидорова: " + sidorovPhones);
        List<String> kozlovPhones = phoneBook.get("Смит");
        System.out.println("Телефон Козлова: " + kozlovPhones);
    }
}
