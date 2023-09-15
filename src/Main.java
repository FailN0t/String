import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        String name1 = "Василий";
        String name2 = "Георгий";
        String name3 = "Алексей";

        StringJoiner joiner = new StringJoiner(", ");
        joiner.add(name1);
        joiner.add(name2);
        joiner.add(name3);
        System.out.println(joiner);

        String list = String.join(", ", name1, name2, name3);
        System.out.println(list);
    }

}
