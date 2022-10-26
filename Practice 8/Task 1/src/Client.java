import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Person person = new Person("Eric", "Bieszczad-Stie", 2002);
        Employee employee = new Employee(
                person,
                1,
                2020,
                43000,
                28
                );
        showAllValues(employee);

        Scanner input = new Scanner(System.in);

        int menuChoice = 1;
        while (menuChoice != 0) {
            System.out.println("------------- Meny ------------");
            System.out.println("0. Quit");
            System.out.println("1. Sett månedslønn");
            System.out.println("2. Sett skatteprosent\n");

            menuChoice = input.nextInt();

            switch (menuChoice) {
                case 0:
                    return;

                case 1:
                    System.out.println("\n -> Hva skal den nye verdien være? (oppgi som heltall)");
                    int newMonthlySalary = input.nextInt();
                    employee.setMonthlySalary(newMonthlySalary);
                    break;

                case 2:
                    System.out.println("\n -> Hva skal den nye verdien være? (oppgi som heltall)");
                    double newTaxPercentage = input.nextDouble();
                    employee.setTaxPercentage(newTaxPercentage);
                    break;
            }

            // Show the new values
            if (menuChoice != 0) showAllValues(employee);
        }
    }

    public static void showAllValues(Employee employee) {
        System.out.println("Her er verdiene til " + employee.toString() + ":");
        System.out.printf("Viser toString metoden: %s\n\n", employee.toString());
        System.out.printf("Get Arbtakernr: %s\n", employee.getEmployeeNumber());
        System.out.printf("Get Ansettelsesår: %s\n", employee.getEmploymentYear());
        System.out.printf("Get Månedslønn: %s\n", employee.getMonthlySalary());
        System.out.printf("Get Skatteprosent: %s\n", employee.getTaxPercentage());
        System.out.printf("Get Betalt skatt: %s\n", employee.getMonthlyTaxPaid());
        System.out.printf("Get Bruttolønn: %s\n", employee.getGrossSalary());
        System.out.printf("Get Skattetrekk per år: %s\n", employee.getTaxDeductionsPerYear());
        System.out.printf("Get Fullt navn: %s\n", employee.getFullName());
        System.out.printf("Get Alder: %s\n", employee.getAge());
        System.out.printf("Get År i selskapet: %s\n", employee.getYearsInCompany());
        System.out.println("");
    }
}
