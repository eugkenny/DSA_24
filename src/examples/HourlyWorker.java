package examples;

public class HourlyWorker extends Employee {
    int hours;
    double rate;

    public HourlyWorker(String name, int id, int hours, double rate) {
        super(name, id);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double earnings() {
        return hours * rate;
    }
}
