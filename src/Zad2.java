import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Zad2 {
    public static void main(String[] args) {
        Zad2able test1 = (a, b) -> "String1";
        Zad2able test2 = (a, b) -> {return "String2";};
        Zad2able test3 = (int a, String b) -> {
            System.out.println("String3");
            System.out.println(b);
            return "stringx";
            //wrzucamy do metody newMethod to co jest poniżej i w klamrze okreslamy co ta metoda robi dalej
            //w drugim przydaku drukuje string3 i agrument oraz zwraca stringx ale go nie drukuje bo ponizej nie ma sout
            };
        Zad2able test4 = (int a, String b) -> "String4";

        System.out.println(test1.newMethod(1, "argument"));
        System.out.println(test2.newMethod(2, "argument"));
        System.out.println(test3.newMethod(2, "argument"));
        test3.newMethod(3, "argument");
        System.out.println(test4.newMethod(4, "argument"));

        Predicate<String> lambda = a -> a.contains("x");
        Predicate<String> lambda1 = a -> a.isEmpty();
        System.out.println(lambda.test("x"));
        System.out.println(lambda1.test("x"));

        List<String> lista = new ArrayList<>();
        lista.add("Perła");
        lista.add("Werka");
        lista.add("");
        System.out.println(lista);
        Predicate<String> doListy = l -> { //fajne
            System.out.println(l);
            return l.isEmpty();
        };
        lista.removeIf(doListy);
        System.out.println(lista);

    }
}
