

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax = 0d;
        if (this.salary > 1000){
            tax = this.salary * 0.03d;
        }
        return tax;
    }

    public double bonus() {
        double bonus = 0d;
        if ((this.workHours - 40) > 0){
            bonus = 30d * (this.workHours - 40);
        }
        return bonus;
    }

    public double raiseSalary() {
        double raise = 0d;
        if ((2021 - this.hireYear) < 10){
            raise = this.salary * 0.05d;
        }else if ((2021 - this.hireYear) < 20) {
            raise = this.salary * 0.1d;
        }else {
            raise = this.salary * 0.15d;
        }
        return raise;
    }

    public String toString() {
        String result = "";
        result += "Ad� : " + this.name +"\nMaa�� : "+this.salary + "\n�al��ma Saati : " + this.workHours + "\nBa�lang�� Y�l� : " + this.hireYear;
        result += "\nVergi : " + tax() + "\nBonus : " + bonus() + "\nMaa� Art��� : " + raiseSalary();
        result += "\nVergi ve Bonuslar ile birlikte maa� : " + (this.salary + bonus() - tax());
        result += "\nToplam Maa� : " + (this.salary + raiseSalary());
        return result;
    }
}