public class D50Q6 {
    public static void main(String[] args) {
        PrimeNumbers pn = new PrimeNumbers();
        pn.initializePrimeNumbers(50);  // 0〜50までの素数を用意

        int[] part = pn.getPart(10, 30); // 10〜30の素数を抽出

        for (int p : part) {
            System.out.print(p + " ");
        }
    }
}

class PrimeNumbers {
    boolean[] isPrimeNumbers;

    // エラトステネスの篩で素数配列を初期化
    void initializePrimeNumbers(int max) {
        isPrimeNumbers = new boolean[max + 1];

        for (int i = 2; i <= max; i++) {
            isPrimeNumbers[i] = true;
        }

        for (int i = 2; i * i <= max; i++) {
            if (isPrimeNumbers[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrimeNumbers[j] = false;
                }
            }
        }
    }

    // min〜maxの範囲で素数だけを取り出す
    int[] getPart(int min, int max) {
        if (isPrimeNumbers == null || max >= isPrimeNumbers.length) {
            throw new IllegalArgumentException("initializePrimeNumbers()で十分なmax値を指定してください。");
        }

        java.util.List<Integer> result = new java.util.ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (isPrimeNumbers[i]) {
                result.add(i);
            }
        }

        // Listからint[]へ変換
        int[] primes = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            primes[i] = result.get(i);
        }

        return primes;
    }
}
