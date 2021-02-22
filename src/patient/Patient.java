package patient;

import surgery.Surgery;

import java.util.Random;

public class Patient {
    private int id;
    private boolean hasSurgery;

    public Patient(int id,  boolean hasSurgery) {
        this.id = id;
        this.hasSurgery = hasSurgery;
    }

    public static Patient createPatient(){
        Random random = new Random();
        return new Patient(random.nextInt(2000 - 1000 + 1) + 100,  random.nextBoolean());
    }

    public boolean isHasSurgery() {
        return hasSurgery;
    }

    public int getId() {
        return id;
    }
}
