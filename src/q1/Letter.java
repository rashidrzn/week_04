package q1;

public class Letter implements printable{


    private String text;

    public Letter(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println("Text :"+text);
    }
}
