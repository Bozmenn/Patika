public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if (this.salary <= 1000){
            return 0;
        }
        else {
            return (this.salary * 3) / 100;
        }
    }

    double bonus(){
        if (this.workHours > 40){
            return (30 * (workHours-40));
        }
        else {
            return 0;
        }
    }

    double raiseSalary(){
        if (2021 - this.hireYear <= 9){
            return (this.salary * 5) / 100;
        }
        else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20){
            return (this.salary * 10) / 100;
        }
        else {
            return (this.salary * 15) / 100;
        }
    }

    void tostring(){
        System.out.println("Adi : " + this.name);
        System.out.println("Maasi : " + this.salary);
        System.out.println("Calisma saati : " + this.workHours);
        System.out.println("Baslangic yili : " + this.hireYear);
        System.out.println("Vergi : " + this.tax() );
        System.out.println("Bonus : " + this.bonus() );
        System.out.println("Maas artisi : " + this.raiseSalary() );
        System.out.println("Vergi ve bonuslar ile birlikte maas : " + (this.salary + this.bonus() - this.tax()));
        System.out.println("Toplma maas : " + (this.salary + this.bonus() - this.tax() + this.raiseSalary())); 
    }
}
