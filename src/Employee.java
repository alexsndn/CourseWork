public class Employee {
    private static int counter = 0;
    private final String name;
    private int division;
    private int salary;
    private final int id;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.division = department;
        this.salary = salary;
        this.id = ++counter;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getDivision() {
        return this.division;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setDivision(int department) {
        this.division = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Номер " + this.id + " ФИО " + this.name + ". Отдел: " + this.division + ". Зарплата: " + this.salary;
    }
}
