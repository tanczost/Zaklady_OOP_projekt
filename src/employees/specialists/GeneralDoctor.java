package employees.specialists;

import patient.Patient;
import surgery.Surgery;

import java.util.ArrayList;

public interface GeneralDoctor {

    default void nextTask(Patient patient, ArrayList<Surgery> surgeries){
        if(patient.isHasSurgery()) {
            surgeries.add(new Surgery(patient));
        }
        else{
            System.out.println("Vysetril som pacienta cislom: " + patient.getId());
        }
    }

    default void nextTask(Surgery surgery){
        performSurgery(surgery);
    }

    void performSurgery(Surgery surgeries);
}
