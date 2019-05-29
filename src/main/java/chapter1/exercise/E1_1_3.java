package chapter1.exercise;

public class E1_1_3 {

    static boolean tripleEqual(String[] args) {
        if (args.length == 3) {
            for(int i = 1; i < 3; i++) {
                if (!args[i].equals(args[0])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(tripleEqual(args) ? "equal" : "not equal");
    }
}
