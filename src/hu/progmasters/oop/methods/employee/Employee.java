package hu.progmasters.oop.methods.employee;

/**
 * 1. Az Employee nevű osztály tartalmazzon három adatot példányváltozóként:
 * - firstName (String)
 * - lastName (String)
 * - monthlySalary (double)
 * <p>
 * Az osztálynak legyen konstruktora, ami inicializálja a három példányváltozót!
 * Ha a monthlySalary negatív, állítsd 0.0-ra!
 * Biztosíts getter és setter metódust mindegyik példányváltozóhoz!
 * <p>
 * 2. Hozz létre egy EmployeeMain nevű osztályt, melyben kipróbálhatod az Employee osztály működését!
 * <p>
 * 3. Hozz létre két Employee példányt és írd ki mindkettőnek az éves fizetését!
 * - először használd ehhez a megfelelő get metódust
 * - írj egy olyan metódust az Employee osztályba, ami kiszámolja az éves fizetést
 * <p>
 * 4. Adj mindkettő Employee-nek 10%-os fizetésemelést és írd ki újra az éves fizetésüket!
 * - először használd ehhez a megfelelő set metódust
 * - írj egy olyan metódust, ami paraméterben egy egész számot vár (a fizetésemelést százalékban), és beállítja
 * ez alapján az új fizetést
 */
public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary < 0 ? 0.0 : monthlySalary;
    }

    public double annualSalary() {
        return monthlySalary * 12;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }


}
