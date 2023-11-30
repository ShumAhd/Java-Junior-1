import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс, представляющий сотрудника.
 */
class Employee {
    private String name;
    private int age;
    private double salary;
    private String department;

    // Конструктор, геттеры и сеттеры

    public Employee(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

/**
 * Пример использования лямбд и Stream API для работы с сотрудниками.
 */
public class EmployeeExample {

    /**
     * Создает и возвращает список из 20 сотрудников.
     *
     * @return Список сотрудников.
     */
    public static List<Employee> createEmployeeList() {
        return Arrays.asList(
                new Employee("John", 25, 12000, "HR"),
                new Employee("Alice", 30, 9000, "IT"),
                new Employee("Bob", 28, 11000, "Finance"),
                new Employee("Charlie", 35, 9500, "IT"),
                new Employee("David", 32, 10500, "Marketing"),
                new Employee("Emma", 27, 9800, "Finance"),
                new Employee("Frank", 40, 13000, "HR"),
                new Employee("Grace", 29, 8500, "IT"),
                new Employee("Henry", 33, 11500, "Marketing"),
                new Employee("Ivy", 26, 9200, "HR"),
                new Employee("Jack", 31, 10200, "IT"),
                new Employee("Katherine", 38, 12500, "Marketing"),
                new Employee("Leo", 24, 8800, "IT"),
                new Employee("Mia", 36, 10700, "Finance"),
                new Employee("Nathan", 34, 11200, "Marketing"),
                new Employee("Olivia", 28, 9400, "Finance"),
                new Employee("Peter", 37, 11800, "HR"),
                new Employee("Quinn", 30, 9900, "IT"),
                new Employee("Ryan", 39, 12200, "Marketing"),
                new Employee("Sophia", 29, 9000, "Finance")
        );
    }

    /**
     * Выводит список всех различных отделов (department) по списку сотрудников.
     *
     * @param employees Список сотрудников.
     */
    public static void printDistinctDepartments(List<Employee> employees) {
        List<String> distinctDepartments = employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Различные отделы: " + distinctDepartments);
    }

    /**
     * Повышает зарплату на 20% всем сотрудникам, чья зарплата меньше 10_000.
     *
     * @param employees Список сотрудников.
     * @return Обновленный список сотрудников.
     */
    public static List<Employee> increaseSalary(List<Employee> employees) {
        return employees.stream()
                .filter(employee -> employee.getSalary() < 10000)
                .peek(employee -> employee.setSalary(employee.getSalary() * 1.2))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Employee> employeeList = createEmployeeList();

        // Вывод различных отделов
        printDistinctDepartments(employeeList);

        // Повышение зарплаты сотрудникам с зарплатой менее 10_000 на 20%
        List<Employee> updatedEmployeeList = increaseSalary(employeeList);

        // Вывод обновленного списка сотрудников
        updatedEmployeeList.forEach(employee -> System.out.println(employee.getName() + ": " + employee.getSalary()));
    }
}
