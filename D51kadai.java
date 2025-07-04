public class D51kadai {
    public static void main(String[] args) {
                // コマンドライン引数の2番目は args[1]
                double value = Double.parseDouble(args[1]); // 文字列をdoubleに変換
                double result = Math.ceil(value); // 切り上げ処理
                System.out.println(result); // 結果を出力
            }
        }
