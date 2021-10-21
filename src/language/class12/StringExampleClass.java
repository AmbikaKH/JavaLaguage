package language.class12;

import java.nio.charset.StandardCharsets;

public class StringExampleClass {
    public static void main(String[] args) {

        String name = "ambika";
        System.out.println(name.hashCode());
        System.out.println(name.getBytes(StandardCharsets.UTF_8));

    }
}
