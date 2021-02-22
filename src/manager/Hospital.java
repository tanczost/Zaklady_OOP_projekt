package manager;

import employees.Accountant;
import employees.Doctor;
import employees.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Hospital implements Company {
    private final String name;
    private ArrayList<Employee> employees = new ArrayList<>();
    private Accountant ourAccountant;

    private static Hospital hospital;

    private Hospital(String name, Accountant ourAccountant) {
        this.name = name;
        this.ourAccountant = ourAccountant;

        Employee[] defaultDoctors = Seeder.getDefaultDoctors();
        Employee[] defaultParamedics = Seeder.getDefaultParamedics();


        employees.addAll(Arrays.asList(defaultParamedics));
        employees.addAll(Arrays.asList(defaultDoctors));
    }

    public static Hospital getInstance(){
        if(hospital == null){
            hospital = new Hospital("Nemocnica velka", new Accountant("Mirka Mila", 23, 77462, 9.5, 8));
        }

        return hospital;
    }

    public void addSubjects(){
        for(Employee employee : employees){
            employee.setObserver(this);
        }
    }

    public Doctor getDoctor(String name){
        for(Employee employee : this.employees){
            if(employee instanceof Doctor && employee.getName().equals(name)){
                return ((Doctor)employee);
            }
        }

        return null;
    }

    @Override
    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    @Override
   public void payDay(){
       for(Employee employee : this.employees){
           employee.setIncome(ourAccountant.sendIncome(employee));
       }
   }

    public void getEmployees() {
        for(Employee employee : this.employees){
            System.out.println(employee);
        }
    }

    public ArrayList<Employee> getListOfEmployee(){
        return this.employees;
    }
}
