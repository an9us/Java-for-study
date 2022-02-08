import java.util.Scanner;

public class ReturnTree2{
    public static void main(String[] args){
        System.out.println("数字を入力してください↓↓");
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int i=0;i<s;i++){ //0.1.2.3.4...s行まで

            for(int j=s-i;j>=1;j--){//4.3.2.1.0
                System.out.print(" ");
            }
            
            for(int j=0;j<=i;j+=2){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
/*

       3  1  4 
  ***  2  3  5
 ***** 1  5  6


*/