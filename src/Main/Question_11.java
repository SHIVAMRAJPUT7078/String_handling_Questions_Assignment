package Main;

import java.util.Scanner;

class InputString{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.nextLine().charAt(0);
        String string = scanner.nextLine().trim();
        Question_11 question_1 = new Question_11(ch,string);
        System.out.println(question_1.getIndex());

    }
}

public class Question_11 {
   private char ch;
   private String inputString;

    public Question_11(char ch, String inputString) {
        this.ch = ch;
        this.inputString = inputString;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public int getIndex(){
        int index  = getInputString().indexOf(getCh());
        return index;
    }

}


