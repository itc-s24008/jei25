enum Connection {OFFLINE, ONLINE}

public class D48Q22 {
    public static void main(String[] args) {
        Connection s = Connection.OFFLINE; // enum名を明示
        if (s == Connection.OFFLINE) {
            s = Connection.ONLINE;
        }
        System.out.println(s); // → ONLINE と出力される
    }
}

