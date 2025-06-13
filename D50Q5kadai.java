public class D50Q5kadai {
    public static void main(String[] args) {
                if (args.length != 5) {
                    System.out.println("5つの整数を指定してください。");
                    return;
                }

                // 引数を整数配列に変換
                int[] data = new int[5];
                for (int i = 0; i < args.length; i++) {
                    data[i] = Integer.parseInt(args[i]);
                }

                // バブルソート（途中経過を表示）
                for (int i = 0; i < data.length - 1; i++) {
                    for (int j = 0; j < data.length - 1 - i; j++) {
                        if (data[j] > data[j + 1]) {
                            // 要素を交換
                            int temp = data[j];
                            data[j] = data[j + 1];
                            data[j + 1] = temp;

                            // 交換があった場合に途中結果を表示
                            printArray("ソート途中:", data);
                        }
                    }
                }

                System.out.println("-------------------");
                printArray("ソート結果:", data);
            }

            // 配列を表示するメソッド
            private static void printArray(String label, int[] array) {
                System.out.print(label);
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i]);
                    if (i != array.length - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
