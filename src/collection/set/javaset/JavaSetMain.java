package collection.set.javaset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSetMain {
    public static void main(String[] args) {
        run(new HashSet<>()); //입력한 순서 보장 X, O(1)
        run(new LinkedHashSet<>()); //입력한 순서 보장 O, O(1)
        run(new TreeSet<>()); //뎅티ㅓ 값을 기준으로 정렬, O(log N)
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
