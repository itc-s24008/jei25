public class D49Q25 {
    String code;

    public static void main(String[] args) {
        D49Q25 obj = new D49Q25();
        obj.setCode("FB1257");
        System.out.println("コードは: " + obj.code);  // 確認用の出力
    }

    void setCode(String code) {
        this.code = code;  // フィールドに代入
    }
}
