public class D53Q25kadai {
    public static void main(String[] args) {
        char[] ch = {'A', 'B', 'C'};

        String s1 = new String("ABC");
        String s2 = new String(ch);
        // intern() は同じ内容の文字列なら同じインスタンスを返すので、これで == の比較が true になる。
        boolean b1 = s1.intern() == s2.intern();
        boolean b2 = s1.equals(s2);

        System.out.println(b1 + " " + b2);
    }
}
