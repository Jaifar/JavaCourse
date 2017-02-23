package Module4;

/**
 * Created by Owner on 2/11/2017.
 */
public class Main {


    public static void main(String[] args) {
        //создать 6 объектов класса User (2 - USBank, 2 - EUBank, 2 - ChinaBank)
        USBank usBank = new USBank(0, "USA", Currency.USD, 23, 122000, 12, 10000);
        USBank usBank1 = new USBank(0, "USA", Currency.USD, 22, 344440, 1, 234000);

        EUBank euBank = new EUBank(12, "UK", Currency.EUR, 120, 230000, 3, 200000);
        EUBank euBank1 = new EUBank(10, "Italy", Currency.EUR, 130, 60000, 3, 4555555);

        ChinaBank chinaBank = new ChinaBank(30, "China", Currency.EUR, 1000, 1000000000, 2, 1000000000);
        ChinaBank chinaBank1 = new ChinaBank(2, "China", Currency.EUR, 100023, 100045555, 2, 50000000);

        chinaBank.getLimitOfFunding();
        chinaBank1.getAvrSalaryOfEmployee();

        euBank.moneyPaidMonthlyForSalary();
        euBank1.getMonthlyRate();

        chinaBank.getBankCountry();
        chinaBank1.getNumberOfEmployees();
        // Run four different operations with erery User’s baalance and print its objects to console.
    }
}
