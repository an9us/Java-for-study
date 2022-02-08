public class Kadai030303 {
    public static void main(String[] args){
        int sum = 0;
        for(int i=1;i<=100;i++){
            if(i%12 != 0){
                if(i%2==0 || i%3==0){
                    sum+=i;
                }
            }
        }
        System.out.println("合計は"+sum);
    }
}
