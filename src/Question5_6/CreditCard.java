package Question5_6;

public class CreditCard extends Card {
    private int pinNumber;
    private int number;


    public CreditCard(String n, int pinNumber, int number) {
        super(n);
        this.pinNumber = pinNumber;
        this.number = number;
    }


    /**
     * credit card not expiring (assumtion)
     * @return
     */
    @Override
    public boolean isExpired() {
        return false;
    }

    @Override
    public String format() {
        return "CreditCard{" +super.format()+
                "pinNumber=" + pinNumber +
                ", number=" + number +
                '}';
    }
}
