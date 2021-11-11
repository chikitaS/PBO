package AnotherTypeOfEmployee;

public class Commission extends Hourly{
    double totalSales;
    double rateCommission;
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,double eRateCommission){
        super(eName,eAddress,ePhone,socSecNumber,rate);
        rateCommission=eRateCommission;
    }
    public void addSales (double totalSales){
      this.totalSales=totalSales;
    }
    public double pay() {
        double payment=super.pay() + (rateCommission*totalSales);
        totalSales=0;
        return payment;
    }
    public String toString() {
        String result=super.toString();
        result += "\nCurrent total sales:" + totalSales;
        return result;
    }
}
