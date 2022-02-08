import java.util.Scanner;

public class InputTest{
    public static void main(String[] args){
        System.out.println("文字を入力してください↓↓");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println("入力した文字："+s);
        in.close();
    }
}
