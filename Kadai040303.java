public class Kadai040303 {
    public static void main(String[] args) {
        int num = min(5,3);
        System.out.println("小さい方の値："+ num);
    }
    public static int min(int a, int b) {
        if (a<b) {
            return a;
        } else {
            return b;
        }
    }
}
