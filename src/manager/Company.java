package manager;

import employees.Employee;

import java.util.ArrayList;
import java.util.Random;

interface Company{
    void addEmployee(Employee employee);

    void payDay();

    default void arriveToWork(Employee employee){

        System.out.println(employee.getName() + " zacal pracovat.");

    }

    default void workDay(int day, ArrayList<Employee> employees){
        Random random = new Random();

        for(Employee employee : employees){

            boolean goToWork = random.nextBoolean();
            employee.goToWork(day, goToWork);

            if(goToWork){
                //System.out.println("\n" + employee.toString());
                employee.notifyMyObserver();
                employee.specificWork();
            }

        }
    }
}
