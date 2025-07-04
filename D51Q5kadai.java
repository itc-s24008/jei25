public class D51Q5kadai {
    public static void main(String[] args) {
        double[] level = {0.0, 24.0, 57.0, Double.MAX_VALUE};
        double[] level2 = {100.0, 3.0, 4.0, 6.0};

        int[] rate = {0, 20, 18, 15};

        if (args.length != 1) {
            System.out.println("引数の個数が不正");
            return;
        }

        double usage = Double.parseDouble(args[0]);
        double bill = 0.0;

        for (int i = 0; i < level.length - 1; i++) {
            if (usage > level[i]) {
                double amount = Math.min(usage, level[i + 1]) - level[i];
                bill += amount * rate[i + 1];
                bill += level2[i + 1];
            }
        }

        System.out.println("今月のガス代金は" + (int) bill + "円");
    }
}
