package Question5_6;

public class DrivingLicence extends Card{
    private int expirationYear;


    public DrivingLicence(String n, int expirationYear) {
        super(n);
        this.expirationYear = expirationYear;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    @Override
    public boolean isExpired() {
        if (this.expirationYear<2022){
            return false;
        }else return true;
    }

    @Override
    public String format() {
        return "DrivingLicence{" +super.format() +
                "expirationYear=" + expirationYear +
                '}';
    }
}
