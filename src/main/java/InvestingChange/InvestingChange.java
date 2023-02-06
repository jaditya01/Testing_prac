    package InvestingChange;

    import java.util.List;

    public class InvestingChange {
        private static Double calculateAverageInvestedChange(List<Double> purchase) {
            Double Investedamount;
            Double finalamount=0.0;
            Double a=0.0;
            for(Double d:purchase){
                Investedamount = Math.ceil(d)-d;
                finalamount= finalamount + Investedamount;
                a=  finalamount/purchase.size();
            }
            return a;
        }
        public static void main(String[] args) {

            List<Double> purchase = List.of(12.38,38.29,5.27,3.21);
            System.out.println(calculateAverageInvestedChange(purchase));
        }
    }
