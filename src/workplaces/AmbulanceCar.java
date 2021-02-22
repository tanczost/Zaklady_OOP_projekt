package workplaces;

public class AmbulanceCar {
    private String id;
    private boolean hasFuel;

    public AmbulanceCar(String id, boolean hasFuel) {
        this.id = id;
        this.hasFuel = hasFuel;
    }

    public boolean isHasFuel() {
        return hasFuel;
    }

    public void setHasFuel(boolean hasFuel) {
        this.hasFuel = hasFuel;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "AmbulanceCar: " +
                "id='" + id + '\'' +
                ", hasFuel=" + hasFuel;
    }
}
