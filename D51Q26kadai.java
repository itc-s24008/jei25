public class D51Q26kadai {
    public static void main(String[] args) {
        int n = 1;
        String s = "";

        switch (n) {
            case 1:
                s += "one";     // n が 1 のときに実行される処理
                break;          // break があると、ここで switch を抜ける

            case 2:
                s += "two";     // n が 2 のときに実行される処理
                break;

            default:
                s += "?";       // n がどの case にも一致しなかった場合に実行される
        }

        System.out.println(s);  // → 出力結果: one
    }
}

