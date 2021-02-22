package employees;

import patient.Patient;
import surgery.Surgery;
import workplaces.Ambulance;
import employees.specialists.GeneralDoctor;

import java.util.ArrayList;
import java.util.Random;

abstract public class Doctor extends Employee implements GeneralDoctor {
    private final Ambulance ambulance;
    private final ArrayList<Patient> patients= new ArrayList<>();
    private final ArrayList<Surgery> surgeries= new ArrayList<>();

    public Doctor(String name, int age, int id, double hourlyWage, int workHours) {
        super(name, id, age, hourlyWage, workHours);
        this.ambulance = new Ambulance();
    }


    @Override
    public void specificWork(){
        Random random = new Random();
        int n = random.nextInt(5 + 1);

        for(int i = 0; i < n; i++){
            patients.add(Patient.createPatient());
        }

        System.out.println(this.ambulance.toString(this.name));

        if(this.patients.size() == 0){
            System.out.println("Na dnes nemam pacienta.");
        }
        else{
            for(Patient patient : this.patients){
                nextTask(patient, this.surgeries);
            }
        }

        if(this.surgeries.size() == 0){
            System.out.println("Na dnes nemam operaciu ziadnu.");
        }
        else{
            for(Surgery surgery: this.surgeries){
                nextTask(surgery);
            }
        }

        this.patients.clear();
        this.surgeries.clear();
    }
}
