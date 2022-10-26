public class Employee {
    private Person person;
    private int employeeNumber;
    private int employmentYear;
    private int monthlySalary;
    private double taxPercentage;

    public Employee(Person person, int employeeNumber, int employmentYear, int monthlySalary, double taxPercentage) {
        this.person = person;
        this.employeeNumber = employeeNumber;
        this.employmentYear = employmentYear;
        this.monthlySalary = monthlySalary;
        this.taxPercentage = taxPercentage;
    }

    public int getEmployeeNumber() { return employeeNumber; }

    public int getEmploymentYear() { return employmentYear; }

    public int getMonthlySalary() { return monthlySalary; }

    public double getTaxPercentage() { return taxPercentage; }

    public double getMonthlyTaxPaid() {
        // I'm assuming that the tax percentage is a number between 0 and 100 and not a decimal number between 0 and 1
        return monthlySalary * taxPercentage/100;
    }

    public double getGrossSalary() {
        return  monthlySalary * 12 - getTaxDeductionsPerYear();
    }

    public double getTaxDeductionsPerYear() {
        return getMonthlyTaxPaid()*10.5;
    }

    public String getFullName() {
        return this.person.getLastName() + ", " +  this.person.getFirstName();
    }

    // This method is weird to have in the Employee class, but the task says to put it here
    // Normally this would be in the Person class because having an age is not specific to being an employee
    public int getAge() {
        java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();
        int currentYear = calendar.get(java.util.Calendar.YEAR);
        return currentYear - this.person.getBirthYear();
    }

    public int getYearsInCompany() {
        java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();
        int currentYear = calendar.get(java.util.Calendar.YEAR);
        return currentYear - getEmploymentYear();
    }

    public boolean inCompanyForLongerThan(int years) {
        return getYearsInCompany() > years;
    }


    // Set methods
    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    // Override toString method to include all data when writing out to stdout with for example System.out.println(Employee)
    public String toString() {
        return this.person.toString() + "\nArbeidstakernr: " + this.getEmployeeNumber() +
                "\nLønn og skatt: " + this.getMonthlySalary() + "kr i måneden med " +
                this.getTaxPercentage() + "% i skatt."+
                "\nBetalt skatt: " + this.getMonthlyTaxPaid() +
                "\nÅrsbruttoinntekt: " + this.getGrossSalary();
    }
}
