import java.util.Objects;

public class Employee implements Comparable {
    private String firstName;
    private String lastName;
    private Integer age;
    private Integer salary;
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Employee(String firstName, String lastName, String position, Integer age, Integer salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", age=" + age + ", salary=" + salary + ", position='" + position + '\'' + '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(age, employee.age) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, salary);
    }

    @Override
    public int compareTo(Object obj) {
        Employee emp = (Employee) obj;
        if (this.firstName.compareTo(emp.firstName) != 0) {
            return this.firstName.compareTo(emp.firstName);
        }
        if (this.lastName.compareTo(emp.lastName) != 0) {
            return this.lastName.compareTo(emp.lastName);
        }
        if (this.position.compareTo(emp.position) != 0) {
            return this.position.compareTo(emp.position);
        }
        if (this.age.compareTo(emp.age) != 0) {
            return this.age.compareTo(emp.age);
        }

        return this.salary.compareTo(emp.salary);

    }
}
