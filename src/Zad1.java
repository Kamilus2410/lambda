import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Zad1 {
    public static void main(String[] args) {
        List<Zad1Class> animals = new ArrayList<>(List.of(
                new Zad1Class(1, "Animal1"),
                new Zad1Class(2, "Animal2"),
                new Zad1Class(3, "Animal3")
        ));
        System.out.println(animals);
        print(animals, animalek -> "kupa");
        animals.removeIf(animal -> animal.getName().equals("Animal1")); //niby predicate
        System.out.println(animals);
    }

    private static void print(List<Zad1Class> animals, Zad1able checker) {
        for (Zad1Class animal : animals) {
            System.out.println(checker.someMethod(animal.getAge())+animal.getAge());
        }
    }

}