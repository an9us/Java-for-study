public class Kadai030308 {
    public static void main(String[] args){
        int sum = 0;
        int i = 1;
        while(i<=100){
            if(i%2==0){
                sum += i;
            }
            i++;
        }
        System.out.println("1~100までの偶数の合計は"+sum);
    }
}
