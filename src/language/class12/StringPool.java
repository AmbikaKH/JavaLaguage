package language.class12;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "Java"; //String pool
        String s2 = "Java"; //String pool
        String s6 = "java";
        String s5 = "C++"; //String pool
        String s3 = new String("Java"); // Java Heap
        String s4 = new String("Java").intern(); //String pool
        System.out.println((s1 == s2));
        System.out.println((s1 == s3));
        System.out.println((s1 == s4));
        System.out.println((s1 == s5));
        System.out.println((s1 == s6));

    }
}

