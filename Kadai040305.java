public class Kadai040305 {
    public static void main(String[] args) {
        int num = diff(3,5);
        System.out.println("2つの整数の差：" + num);
    }
    public static int diff(int a, int b) {
        return a>b ? a-b : b-a;
    }
}
