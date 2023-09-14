import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        Integer age = 37;
        String name = "Анна";
        String personInfo = name + " - " + age + " лет";
        String value = age.toString();
        System.out.println(String.valueOf(age));
        System.out.println(Charset.defaultCharset());

        String text = "Hello всем";
        String encoded = new String(text.getBytes(),
                StandardCharsets.US_ASCII); //создаём новую строку
        System.out.println(encoded);
        System.out.println(Charset.defaultCharset());
    }
}
