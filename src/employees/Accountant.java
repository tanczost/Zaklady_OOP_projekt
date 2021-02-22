package employees;
import java.util.Arrays;

public class Accountant extends Employee{
    public Accountant(String name, int age,  int id, double hourlyWage, int workHours) {
        super(name, id, age, hourlyWage, workHours);
    }

    @Override
    public void specificWork() {
        System.out.println("shit");
    }

    public double sendIncome(Employee employee){
        double[] workedHours = employee.getWorkedHours();
        double income = employee.getIncome();
        double hourlyWage = employee.getHourlyWage();

        for(int i = 0; i < 31; i++){
            income += (hourlyWage * workedHours[i]);
        }
        System.out.println("meno: " + employee.getName() +
                "\nodpracovane hodiny: " + Arrays.toString(workedHours));
        return income;
    }

    @Override
    public String toString() {
        return "Accountant: " + super.toString();
    }
}
