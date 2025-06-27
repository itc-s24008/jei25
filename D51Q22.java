public class D51Q22 {
    public static void main(String[] args) {
        int a = 0b11; // 2進数の3
        int b = 5;   // 10進数の5
        int sum = a + b; // 3 + 5 = 8

        // 計算結果を表示
        view(true, "計算結果（0b11 + 5）は " + sum);
    }

    public static void view(boolean b, String s) {
        System.out.println(b + " " + s);
    }
}
