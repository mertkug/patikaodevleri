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

    double tax() {
        if (this.salary < 1000) {
            return 0;
        }
        return this.salary * 0.03;
    }

    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        int year = 2021 - this.hireYear;

        if (year < 10) {
            return this.salary * 0.05;
        } else if (year < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    public String toString() {
        return "Adi : " + this.name
                + "\nMaasi : " + this.salary
                + "\nCalisma Saati : " + this.workHours
                + "\nBaslangic Yili : " + this.hireYear
                + "\nVergi : " + tax()
                + "\nBonus : " + bonus()
                + "\nMaas Artisi : " + raiseSalary()
                + "\nVergi ve Bonuslar ile birlikte maas : " + (this.salary - tax() + bonus())
                + "\nToplam Maas : " + (this.salary + raiseSalary() - tax() + bonus());
    }
}
