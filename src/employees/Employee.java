package employees;
import income.Income;
import manager.Hospital;

public  abstract class Employee{
    protected final String name;
    protected final int id;

    protected double hourlyWage;
    protected double[] workedHours = new double[31];
    protected int workHours;
    protected int age;

    protected Hospital observer;

    protected Income income;

    protected Employee( String name, int id, int age, double hourlyWage, int workHours) {
        this.name = name;
        this.id = id;
        this.hourlyWage = hourlyWage;
        this.workHours = workHours;
        this.income = new Income();
        this.age = age;

    }

    public void notifyMyObserver(){
        if(observer != null){
            observer.arriveToWork(this);
        }

    }

    public void goToWork(int day, boolean goToWork) {
        if(goToWork){
            this.workedHours[day - 1] = this.workHours;
        }
        else{
            this.workedHours[day - 1] = 0;
        }

    }

    public abstract void specificWork();

    public double getHourlyWage() {
        return hourlyWage;
    }

    public double getIncome() {
        return this.income.getAccountBalance();
    }

    public final void setIncome(double income) {
        this.income.setAccountBalance(income);
    }

    public double[] getWorkedHours() {
        return workedHours;
    }



    public String getName() {
        return name;
    }

    public void setObserver(Hospital observer) {
        this.observer = observer;
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", id = " + id +
                ", hourlyWage = " + hourlyWage +
                ", workHours = " + workHours +
                ", accountBalance = " + this.income.getAccountBalance() +" ";
    }
}
