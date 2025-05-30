import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainProduct {
    public static void main(String[] args) {
        Comparator<Product> comparator = Comparator
                .comparingDouble((Product p) -> p.getPrice())
                .thenComparingDouble(p -> p.getRating()).reversed();

        TreeSet<Product> products = new TreeSet<>(comparator);
        products.add(new Product(15.2, "Курица", 5));
        products.add(new Product(15.2, "Говядина", 6));
        products.add(new Product(17.2, "Индейка", 3));
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("-----------------------------------------------------");
        // Задача 1: проверка на уникальность
        UniqueChar uniqueChar = new UniqueChar();

        String StringOne = "treyu";
        String StringTwo = "tree";

        System.out.println(uniqueChar.hasUnique(StringOne));
        System.out.println(uniqueChar.hasUnique(StringTwo));

        System.out.println("-----------------------------------------------------");
        // Задача 2: объединение множеств
        Set<String> set1 = new HashSet<>();
        set1.add("H");
        set1.add("a");
        set1.add("s");
        set1.add("h");


        Set<String> set2 = new HashSet<>();
        set2.add("s");
        set2.add("e");
        set2.add("t");

        Set<String> mergeSet = MergeSet.mergeSets(set1, set2);


        System.out.println(mergeSet);
    }
}

