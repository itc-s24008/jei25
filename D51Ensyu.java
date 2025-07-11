public class D51Ensyu {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("使い方: java D51Ensyu 学籍番号 氏名");
            return;
        }

        String studentID = args[0];
        String name = args[1];

        D51Student student = new D51Student(studentID, name);

        System.out.println("学籍番号: " + student.getStudentID());
        System.out.println("氏名: " + student.getName());
    }
}
