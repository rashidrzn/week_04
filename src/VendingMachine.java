
public class VendingMachine {
    private int cans;
    private int token;

    public VendingMachine(){
       cans = 10;
    }
    public VendingMachine(int cans){
        fillUp(cans);
    }

    public void fillUp(int cans){
        this.cans+=cans;
    }

    public void insertToken(){
//        token++;
//        cans--;

        if (cans>0){
            token++;
            cans--;
        }
        else
        { System.out.println("The vending machine is empty ");}
    }

    public int getCansCount(){
        return cans;
    }
    public int getTokenCount(){
        return token;
    }
}





























