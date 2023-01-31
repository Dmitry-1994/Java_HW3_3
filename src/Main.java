public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int dataOneYear = service.calculate(1_000_000, 1, 9.99f);
        System.out.println("При сумме кредита в 1 000 000 рублей под 9,99% годовых сроком на 1 год(а) ежемесячный платеж составит " + dataOneYear + " рублей(я)");

        int dataTwoYears = service.calculate(1_000_000, 2, 9.99f);
        System.out.println("При сумме кредита в 1 000 000 рублей под 9,99% годовых сроком на 2 год(а) ежемесячный платеж составит " + dataTwoYears + " рублей(я)");

        int dataThreeYears = service.calculate(1_000_000, 3, 9.99f);
        System.out.println("При сумме кредита в 1 000 000 рублей под 9,99% годовых сроком на 2 год(а) ежемесячный платеж составит " + dataThreeYears + " рублей(я)");
    }
}
