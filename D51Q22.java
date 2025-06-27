public class D51Q22 {
    public static void main(String[] args) {
        int binary = 0b11; // 2進数の3
        int decimal = 5;   // 10進数の5
        int sum = binary + decimal; // 3 + 5 = 8

        // 計算結果を表示
        view(true, "計算結果（0b11 + 5）は " + sum);
    }

    public static void view(boolean b, String s) {
        System.out.println(b + " " + s);
    }
}
