import java.util.Scanner;

/**
 * Created by: Shane Anil Paulus
 * Date: 2020/03/15/03/2020
 * Time: 23:47
 */

public class Application {
    public static void main(String[] args) {
        Details details = new Details();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the employee number >> ");
        details.setEmployeeIdNumber(scanner.nextInt());

        System.out.print("Enter the employee first name >> ");
        details.setFirstName(scanner.next());

        System.out.print("Enter the employee surname >> ");
        details.setSurname(scanner.next());

        System.out.print("Enter the employee salary to be increased >> ");
        details.setSalary(scanner.nextDouble());

        printDetails(details);

        System.out.print("Would you like to see the increased salary with deductions? Enter (1) to view the deductions report or any other key to exit.");

        if (scanner.next().equals("1")) {
            salaryDeductions(details);
        }

        System.out.println("Application complete");
    }

    public static void printDetails(Details details) {
        System.out.println("EMPLOYEE DETAILS REPORT");
        System.out.println("*****************************************************");
        System.out.println("EMPLOYEE NUMBER:\t\t" + details.getEmployeeIdNumber());
        System.out.println("EMPLOYEE FIRST NAME:\t" + details.getFirstName());
        System.out.println("EMPLOYEE SURNAME:\t\t" + details.getSurname());
        System.out.println("ORIGINAL SALARY:\t\tR" + details.getSalary());
        System.out.println("INCREASED SALARY:\t\tR" + details.getUpdatedSalary());
        System.out.println("INCREASED AMOUNT:\t\tR" + (details.getUpdatedSalary() - details.getSalary()));
        System.out.println("*****************************************************");
    }

    public static void salaryDeductions(Details details) {
        double tax = details.getUpdatedSalary() * 0.18;
        double medical = details.getUpdatedSalary() * 0.125;
        double carAllowance = details.getUpdatedSalary() * 0.08;
        double uif = details.getUpdatedSalary() * 0.02;
        double totalDeductions = tax + medical + carAllowance + uif;

        System.out.println("EMPLOYEE DEDUCTIONS REPORT");
        System.out.println("*****************************************************");
        System.out.println("SALARY:\t\t\t" + details.getUpdatedSalary());
        System.out.println("TAX:\t\t\t" + tax);
        System.out.println("MEDICAL AID:\t" + medical);
        System.out.println("CAR ALLOWANCE:\t" + carAllowance);
        System.out.println("UIF:\t\t\t" + uif);
        System.out.println("Take Home Pay:\t" + (details.getUpdatedSalary() - totalDeductions));
        System.out.println("*****************************************************");
    }
}
