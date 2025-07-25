public class D52Q5kadai {
    public static void main(String[] args) {
        String majors = "+----";
        final int LIMIT = 400;

        if (args.length == 0) return;

        int max = 0;
        int[] data = new int[args.length];

        // 引数の数値を配列に格納、最大値を取得
        for (int i = 0; i < args.length; i++) {
            int value = Integer.parseInt(args[i]);
            if (value <= 0 || value >= LIMIT) return;
            data[i] = value;
            if (max < value) {
                max = value;
            }
        }

        // 目盛りの長さを10単位で決定
        int majormax = (max - 1) / 10 + 1;

        // 目盛り表示
        System.out.print("    ");
        for (int i = 0; i < majormax; i++) {
            System.out.print(majors.charAt(i % majors.length()));
        }
        System.out.println();

        // 各データに対応する棒グラフを出力
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%4d : ", data[i]);
            int n = (data[i] - 1) / 10 + 1;  // 10単位に変更
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
