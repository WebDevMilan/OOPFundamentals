public class Employee {
//    set private fields to implement encapsualtion
    private int baseSalary;
    private  int hourlyRate;

    public Employee (int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

//    getters and setters
    public  void setBaseSalary (int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return this.baseSalary;
    }

    public  void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return this.baseSalary;
    }
}
