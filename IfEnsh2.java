import java.util.Scanner;

public class IfEnsh2{
    public static void main(String[] args){
        System.out.println("年齢は？↓↓");//質問
        Scanner in = new Scanner(System.in);//入力したいために新しいScannerを作った
        int i = in.nextInt();//入力した文字を変数iに代入する
        String wstring ;
        if(i>=65 || i<=6){
            wstring = "入場無料";
        }else if(i>=7 && i<=12){
            wstring = "入場料500円";
        }else if(i>=13 && i<=18){
            wstring = "入場料800円";
        }else{
            wstring = "入場料1200円";
        }
        System.out.println(wstring);
        in.close();
    }
}




