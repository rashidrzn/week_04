package Question5_6;

import java.util.TreeMap;

public class Passport extends Card{
   private String birthLocation;

    private int expirationYear;


//    public Passport(String birthLocation, int expirationYear) {
//        this.birthLocation = birthLocation;
//        this.expirationYear = expirationYear;
//    }

    public Passport(String n, String birthLocation, int expirationYear) {
        super(n);
        this.birthLocation = birthLocation;
        this.expirationYear = expirationYear;
    }

    public String getBirthLocation() {
        return birthLocation;
    }

    public void setBirthLocation(String birthLocation) {
        this.birthLocation = birthLocation;
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
        return "Passport{" +super.format()+'\''+
                "birthLocation='" + birthLocation + '\'' +
                ", expirationYear=" + expirationYear +
                '}';
    }
}
