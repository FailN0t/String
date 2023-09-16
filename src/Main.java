import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        String name1 = "Алексей";
        String name2 = "Дмитрий";
        System.out.println(name2 == name1);//ссылки на разные оъекты

        name1 = "Алексей";
        name2 = "Алексей";
        System.out.println(name2 == name1);//ссылки на один оъект

        name1 = "Алексей";
        name2 = new String("Алексей");
        System.out.println(name2 == name1);//ссылки на разные оъекты

        name1 = "Алексей";
        name2 = new String("Алексей").intern();//говорим передать ссылку на такойже объект
        // в пуле
        System.out.println(name2 == name1);//ссылки на разные оъекты




    }

}
