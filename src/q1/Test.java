package q1;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("rashid");
        s1.setGrades(new String[]{"a","b","c","d","e"});

        s1.print();

        Letter l1=new Letter("here we go!");
        System.out.println(" ");
        l1.print();
    }


}