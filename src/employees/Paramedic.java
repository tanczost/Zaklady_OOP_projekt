package employees;

import workplaces.AmbulanceCar;

public class Paramedic extends Employee{
    private AmbulanceCar myCar;

    public Paramedic(String name, int age,  int id, double hourlyWage, int workHours,  AmbulanceCar myCar) {
        super(name,    id, age,  hourlyWage, workHours);
        this.myCar = myCar;
    }

    @Override
    public void specificWork(){
        if(myCar.isHasFuel()){
            System.out.println("Idem zachranovat zivot.");
            myCar.setHasFuel(false);
        }
        else{
            System.out.println( "Musim tankovat do auta s SPZ: " + myCar.getId() + ".");
            myCar.setHasFuel(true);
        }
    }

    @Override
    public String toString() {
        return "Paramedic: "+ super.toString() +
                myCar.toString();
    }
}
