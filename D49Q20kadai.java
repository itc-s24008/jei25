public class D49Q20kadai {
    public static void main(String[] args) {
        double[][] arr = new double[5][10];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = i * 10 + j + 0.5;
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

