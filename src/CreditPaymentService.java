public class CreditPaymentService {
    public int calculate(int creditAmount, int creditTerm, float ratePercent){

        float rateMonth = ratePercent / 100 / 12;
        double degreeRateMonth = Math.pow((1 + rateMonth), (creditTerm * 12));
        double ratio = (rateMonth * st) / (st - 1);
        return (int) (creditAmount * ratio);

    }
}
