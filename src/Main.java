public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        // Добавим тестовые данные
        employees[0] = new Employee("Иванов Иван Иванович", 1, 55000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 70000);
        employees[2] = new Employee("Сидоров Сидор Сидорович", 3, 50000);
        employees[3] = new Employee("Кузнецова Мария Ивановна", 1, 72000);
        employees[4] = new Employee("Смирнова Анна Сергеевна", 4, 60000);

        printAllEmployees();
        System.out.println("Сумма затрат на ЗП: " + calculateTotalSalary());
        System.out.println("Сотрудник с мин. ЗП: " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с макс. ЗП: " + findEmployeeWithMaxSalary());
        System.out.println("Средняя ЗП: " + calculateAverageSalary());
        printAllEmployeeNames();
    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double calculateTotalSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee min = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (min == null || employee.getSalary() < min.getSalary()) {
                    min = employee;
                }
            }
        }
        return min;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee max = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (max == null || employee.getSalary() > max.getSalary()) {
                    max = employee;
                }
            }
        }
        return max;
    }

    public static double calculateAverageSalary() {
        double total = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
                count++;
            }
        }
        return count == 0 ? 0 : total / count;
    }

    public static void printAllEmployeeNames() {
        System.out.println("Список сотрудников:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
