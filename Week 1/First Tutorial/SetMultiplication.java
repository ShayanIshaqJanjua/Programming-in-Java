import java.util.*;
public class SetMultiplication {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("x1");
        set1.add("x2");
        set1.add("x3");
        set2.add("y1");
        set2.add("y2");
        set2.add("y3");
        Set<Set> ResultSet = new HashSet<>();
        for(String e: set1) {
            for(String f: set2) {
                Set<String> temp = new HashSet<>();
                temp.add(e);
                temp.add(f);
                ResultSet.add(temp);
            }
        }
        System.out.print("(");
        for(Set s: ResultSet) {
            System.out.print(s + ", ");
        } 
        System.out.print("\b\b)");
    }
}

