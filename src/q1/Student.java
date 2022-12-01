package q1;

public class Student implements printable {
    private String name;
     String[] grades= new String[5];
   // String[] grades = {"a","b","c","d","e"};

//    public Student(String name, String[] grades) {
//        this.name = name;
//        this.grades = grades;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getGrades() {
        return grades;
    }

    public void setGrades(String[] grades) {
        this.grades = grades;
    }

    @Override
    public void print() {
        System.out.println("Name :"+name);
        System.out.print("grades :");
        for (int i = 0 ; i< grades.length;i++){

            System.out.print( grades[i]+" ");
        }
    }
}
