package examples;

public class TestEmployee {
    public static void main(String[] args) {
        Employee [] employees = new Employee[10];
        employees[0] = new SalaryWorker("Joe", 123, 60000.00);
        employees[1] = new HourlyWorker("Mary", 210, 10, 15.0);

        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i]);
        }
    }
}