public class Main {
    private static Employee[] employers = new Employee[10];

    public static void main(String[] args) {
        employers[0] = new Employee("Петров Александр Иванович", 3, 21000);
        employers[1] = new Employee("Иванов Михаил Илларионович", 1, 39000);
        employers[2] = new Employee("Светлый Николай Николаевич", 1, 37000);
        employers[3] = new Employee("Баринов Василий Иванович", 1, 17000);
        employers[4] = new Employee("Мотин Матвей Матвеевич", 2, 45000);
        employers[5] = new Employee("Полежайкин Алексей Александрович", 1, 33000);
        employers[6] = new Employee("Робертов Илья Павлович", 2, 28000);
        employers[7] = new Employee("Анциферов Денис Петрович", 3, 27000);
        employers[8] = new Employee("Золотов Даниил Данилович", 1, 31000);
        employers[9] = new Employee("Мешков Степан Степанович", 3, 33000);

        printAllEmployers();
        System.out.println("Сумма затрат на зп в месяц = " + calculateTotalSalary());
        calculateMidSalary();
        System.out.println("Сотрудник с мин зарплатой = " + calculateMinSalary());
        System.out.println("Сотрудник с макс зарплатой = " + calculateMaxSalary());
        System.out.println(allEmployers());
        System.out.println();
    }

    public static void printAllEmployers() {
        for (int i = 0; i < employers.length; i++) {
            Employee employee = employers[i];
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    private static int calculateTotalSalary() {
        int total = 0;
        for (int i = 0; i < employers.length; i++) {
            if (null == employers[i]) {
                continue;
            }
            total = total + employers[i].getSalary();
        }
        return +total;
    }

    private static void calculateMidSalary() {
        Employee savedEmployee = null;
        double total = 0;
        int count = 0;
        for (int i = 0; i < employers.length; i++) {
            if (null == employers[i]) {
                continue;
            }
            if (employers[i] != null) {
                total += employers[i].getSalary();
                count++;
            }
        }
        System.out.printf("Средняя зарплата в месяц = %.2f", total / count);
        System.out.println();
    }

    public static Employee calculateMinSalary() {
        Employee savedEmployee = null;
        for (int i = 0; i < employers.length; i++) {
            Employee currentEmployee = employers[i];
            if (null == currentEmployee) {
                continue;
            }
            if (null == savedEmployee) {
                savedEmployee = currentEmployee;
                continue;
            }
            if (currentEmployee.getSalary() < savedEmployee.getSalary()) {
                savedEmployee = currentEmployee;
            }
        }
        return savedEmployee;
    }

    public static Employee calculateMaxSalary() {
        Employee savedEmployee = null;
        for (int i = 0; i < employers.length; i++) {
            Employee currentEmployee = employers[i];
            if (null == currentEmployee) {
                continue;
            }
            if (null == savedEmployee) {
                savedEmployee = currentEmployee;
                continue;
            }
            if (currentEmployee.getSalary() > savedEmployee.getSalary()) {
                savedEmployee = currentEmployee;
            }
        }
        return savedEmployee;
    }

    public static String allEmployers() {
        System.out.println("ФИО всех сотрудников: ");
        String savedEmployee = employers[0].getName();
        for (int i = 0; i < employers.length; i++) {
            if (null == employers[i]) {
                continue;
            }
            if (savedEmployee == employers[i].getName()) {
                continue;
            }
            savedEmployee += "\n" + employers[i].getName();
        }
        return savedEmployee;
    }
}
