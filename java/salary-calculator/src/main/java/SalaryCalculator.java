public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85: 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13: 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000.00;
        double maxSalary = 2000.00;

        salary = salary * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);

        return salary > maxSalary ? maxSalary : salary;
    }
}
