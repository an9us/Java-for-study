public class Kadai040308 {
    public static void main(String[] args) {
        int num = getSum(5);
        System.out.println("合計:"+num);
    }
    public static int getSum(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        return sum;
    }
}
