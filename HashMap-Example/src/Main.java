import java.util.*;
public class Main {
    public static void main(String[] args) {
        //create a database like system
        int id;
        String my_name;
        int my_age;
        double my_salary;
        int search_id;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ID: ");
        id = input.nextInt();

        System.out.print("Enter your name: ");
        my_name = input.next();
        System.out.print("Enter your age: ");
        my_age = input.nextInt();
        System.out.print("Enter your salary: ");
        my_salary = input.nextDouble();

        Person my_person = new Person(my_name, my_age, my_salary);

        Map<Integer,Person> personMap = new HashMap<>();
        personMap.put(id, my_person);

        System.out.print("Enter your search id: ");
        search_id = input.nextInt();
        System.out.println(personMap.get(search_id).name);







    }
}