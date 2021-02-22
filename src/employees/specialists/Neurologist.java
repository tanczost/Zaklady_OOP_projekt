package employees.specialists;
import employees.Doctor;
import surgery.Surgery;

public class Neurologist extends Doctor{
    private final String department;

    public Neurologist(String name, int age, int id, double hourlyWage, int workHours,
                       String department) {
        super(name, age, id,  hourlyWage, workHours);
        this.department = department;
    }

    public void performSurgery(Surgery surgeries){
        System.out.println("Vykonal som neurologicku operaciu pacientovi c. " + surgeries.getPatientId());
    }

    @Override
    public String toString() {
        return "Neurologist: " + super.toString()+
                "department= " + department;
    }
}
