import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Create some employees and students
        Employee e1 = new Employee("John", "Lennon", "Plumber", 27045.78);
        Employee e2 = new Employee("George", "Harrison", "Influencer", 50000.00);
        Student s1 = new Student("Ringo", "Starr", 2.5);
        Student s2 = new Student("Paul", "McCartney", 3.8);

        // Create an ArrayList of type Person and add the employees and students to it
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(e1);
        persons.add(e2);
        persons.add(s1);
        persons.add(s2);

        // Sort the ArrayList by the payment amount using the Collections.sort method
        Collections.sort(persons);

        // Call the printData method and pass the ArrayList as an argument
        printData(persons);
    }

    // printData method takes an Iterable of type Person as a parameter, and prints the data of each person using a foreach loop
    public static void printData(Iterable<Person> persons) {
        // foreach loop to iterate over each person in the iterable
        for (Person person : persons) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}