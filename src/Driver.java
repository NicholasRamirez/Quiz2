import java.util.*;

public class Driver {
    public static void main(String[] args) {
        // Part 2
        List<String> chapter1 = new ArrayList<>();
        chapter1.add("Chapter 1");

        BookShallowCopy orignalCopy = new BookShallowCopy("Clean Code", "Robert C. Martin", chapter1);
        BookShallowCopy shallowCopy = orignalCopy.clone();
        orignalCopy.getChapters().add("Chapter 2");

        System.out.println("Part 2");
        System.out.println("Original Copy: " + orignalCopy);
        System.out.println("Shallow Copy: " + shallowCopy);
        System.out.println();

        // Part 3 
        List<String> chapter3 = new ArrayList<>();
        chapter3.add("Chapter 3");

        BookDeepCopy originalCopy2 = new BookDeepCopy("Clean Code", "Robert C. Martin", chapter3);
        BookDeepCopy deepCopy = originalCopy2.clone();
        originalCopy2.getChapters().add("Chapter 4");

        System.out.println("Part 3");
        System.out.println("Original Copy: " + originalCopy2);
        System.out.println("Deep Copy: " + deepCopy);
    }
}
