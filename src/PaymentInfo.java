public class PaymentInfo {
    public String getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(String paymentInfo) {

        if (paymentInfo.length() == 12) {
            this.paymentInfo = paymentInfo;
        } else
            System.out.println("Invalid info, please enter 12 digits in quotes.");
    }
}