// 信号の色を表す列挙型
enum SignalColor {
    RED,
    YELLOW,
    BLUE
}

public class D51Q27kadai {
    public static void main(String[] args) {
        SignalColor signal = SignalColor.BLUE; // ここで BLUE を指定
        System.out.println(signal); // 出力: BLUE
    }
}
