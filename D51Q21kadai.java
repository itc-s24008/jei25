public class D51Q21kadai {
    public static void main(String[] args) {
        int a = 20;      // 10進数（そのまま20）
        int b = 025;       // 8進数 2×8 + 5 = 21
        int c = 0x10;        // 16進数 1×16 = 16
        int d = 0b11;     // 2進数 1×2 + 1 = 3

        // 各基数の値を合計
        int total = a + b + c + d;

        // 結果の表示
        System.out.println("合計 = " + total);
    }
}
