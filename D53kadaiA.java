public class D53kadaiA {
    public static void main(String[] args) {
        // 引数が渡されていない場合のエラーチェック
        if (args.length == 0) {
            System.out.println("引数が指定されていません。");
            System.out.println("java D53kadaiA 1 2 3");
            return; // プログラム終了
        }

        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            try {
                // 文字列を整数に変換して加算
                int num = Integer.parseInt(args[i]);
                sum += num;
            } catch (NumberFormatException e) {
                // 数字でない引数があった場合
                System.out.println("エラー: '" + args[i] + "' は整数ではありません。");
                return;
            }
        }

        System.out.println("合計=" + sum);
    }
}
