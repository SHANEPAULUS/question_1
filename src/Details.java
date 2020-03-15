/**
 * Created by: Shane Anil Paulus
 * Date: 2020/03/15/03/2020
 * Time: 23:47
 */

//ID number, first name, surname and salary
// getUpdatedSalary() that will increase the staff members salary by 10%
public class Details {

    private int employeeIdNumber;
    private String firstName;
    private String surname;
    private double salary;

    public int getEmployeeIdNumber() {
        return employeeIdNumber;
    }

    public void setEmployeeIdNumber(int employeeIdNumber) {
        this.employeeIdNumber = employeeIdNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getUpdatedSalary() {
        return this.salary + (this.salary * 0.10);
    }
}
