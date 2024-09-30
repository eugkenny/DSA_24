package examples;

public class SalaryWorker extends Employee{

    double salary;

    public SalaryWorker(String name, int id, double salary){
        super(name, id);
        this.salary = salary;
    }

    @Override
    public double earnings() {
        return salary;
    }
}
