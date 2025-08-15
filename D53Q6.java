public class D53Q6 {
    private static String hex = "0123456789ABCDEF";

    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("引数は5個必要です。");
            return;
        }

        if (args[0].equals("b")) {
            // 16進 → 2進(表現形式)に変換
            for (int i = 1; i <= 4; i++) {
                int num = hex.indexOf(args[i].toUpperCase()); // 大文字に対応
                if (num == -1) {
                    System.out.println("不正な16進文字: " + args[i]);
                    continue;
                }
                System.out.println(intToStr(num));
            }
        } else if (args[0].equals("g")) {
            // 2進風表現 → 16進に変換
            for (int i = 1; i <= 4; i++) {
                System.out.println(strToInt(args[i]));
            }
        } else {
            System.out.println("最初の引数は 'b' または 'g' である必要があります。");
        }
    }

    public static String intToStr(int num) {
        String s = "";
        for (int i = 0; i < 4; i++) {
            if (num % 2 == 0) {
                s = "." + s;
            } else {
                s = "o" + s;
            }
            num /= 2;
        }
        return s;
    }

    public static String strToInt(String s) {
        int x = 1, sum = 0;
        for (int i = 3; i >= 0; i--) {
            if (s.charAt(i) == 'o') {
                sum += x;
            }
            x *= 2;
        }
        return hex.substring(sum, sum + 1);
    }
}
