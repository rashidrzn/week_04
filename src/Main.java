public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(4);
       // machine.fillUp(10); // fill up with ten cans
        machine.insertToken();
        machine.insertToken();
        System.out.print("Token count = ");
        System.out.println(machine.getTokenCount());
        System.out.print("Can count = ");
        System.out.println(machine.getCansCount());

        System.out.println( "print bibcsdcjk");

    }
}
