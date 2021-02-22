import employees.Accountant;
import manager.Hospital;


public class Main {
    public static void main(String[] args){

        Hospital myHospital = Hospital.getInstance(); //singleton

        myHospital.addSubjects();



        for(int day = 1; day < 32; day++){
            if(day == 31){
                System.out.println("\nDen c. " + day + "(den vyplaty)");
                myHospital.payDay();

            }
            else if(day % 7 == 0 || (day - 1) % 7 == 0) {
                System.out.println("\nDen c. " + day + "(vikend)");
            }
            else {
                System.out.println("\nDen c. " + day + "(pracovny)");
                myHospital.workDay(day, myHospital.getListOfEmployee());
            }
        }
        System.out.println("\n");
        myHospital.getEmployees();

        if(myHospital.getDoctor("Fero Stredny") != null){
            System.out.println(myHospital.getDoctor("Fero Stredny").getName() + " tu pracuje");
        }
        else{
            System.out.println("Nenasli sme doktoram s danym menom");
        }

        if(myHospital.getDoctor("Miso Maly") != null){
            System.out.println(myHospital.getDoctor("Miso Maly").getName() +" tu pracuje");
        }
        else{
            System.out.println("Nenasli sme doktoram s danym menom");
        }
    }
}
