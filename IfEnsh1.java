import java.util.Scanner;

public class IfEnsh1{
    public static void main(String[] args){
        System.out.println("今日の降水確率は？↓↓");//質問
        Scanner in = new Scanner(System.in);//入力したいために新しいScannerを作った
        int i = in.nextInt();//入力した文字を変数iに代入する
        String wstring ;
        if(i>=80){
            wstring = "今日は絶対に雨が降りますね";
        }else if(i>=60){
            wstring = "今日は雨の可能性が高い";
        }else if(i>=50){
            wstring = "今日は雨が降るかもね";
        }else if(i>=30){
            wstring = "今日は曇りですね";
        }else if(i>=0){
            wstring = "今日は晴れかな！";
        }else{
            wstring = "ありえないですね";
        }
        System.out.println(wstring);
        in.close();
    }
}




