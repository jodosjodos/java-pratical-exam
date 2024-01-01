import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Mugisha ", "Mike", " Software Engineer", 20, 3000);
        Employee emp2 = new Employee("Mugisha ", "Marc", "Database Administrator", 18, 2000);
        Employee emp3 = new Employee("Mugisha ", "Mike", " Software Engineer", 20, 3000);
        Employee emp4 = new Employee("Mugisha ", "Moses", " Software Developer", 20, 3000);
        Employee emp5 = new Employee("Iradukunda ", "Sandra", "Database Administrator", 20, 3000);
        Employee emp6 = new Employee("Iradukunda ", "Gael", "Software Engineer", 20, 3000);


        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);


        ArrayList<Employee> removedDuplicate = new ArrayList<>();
        for (Employee em : employees) {
            if (!removedDuplicate.contains(em)) {
                removedDuplicate.add(em);
            }
        }
        Collections.sort(removedDuplicate);


//        System.out.println(" sorted");
        for (Employee em : removedDuplicate) {
            System.out.println(em);

        }

    }

}
