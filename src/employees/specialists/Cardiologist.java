package employees.specialists;

import employees.Doctor;
import surgery.Surgery;


public class Cardiologist extends Doctor {
    private final String department;

    public Cardiologist(String name,  int id, int age,double hourlyWage, int workHours,
                            String department) {
        super(name, id, age, hourlyWage, workHours);
        this.department = department;
    }

    public void performSurgery(Surgery surgeries){
        System.out.println("Vykonal som kardiologicku operaciu pacientovi c. " + surgeries.getPatientId());
    }

    @Override
    public String toString() {
        return "Cardiologist: " + super.toString()+
                "department= " + department;
    }
}
