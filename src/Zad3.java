public class Zad3 {
    public static void main(String[] args) {
        Zad3able test1 = (a, b, c) -> "String1";
        Zad3able test2 = (a, b, c) -> { return "String2"; };
        Zad3able test3 = (int a, int b, String c) -> { return "String3"; };
        Zad3able test4 = (int a, int b, String c) -> "String4";

        System.out.println(test1.newMethod(1, 1, "argument"));
        System.out.println(test2.newMethod(2, 1, "argument"));
        System.out.println(test3.newMethod(3, 1, "argument"));
        System.out.println(test4.newMethod(4, 1, "argument"));

    }
}
