import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        String name = "Максим";
        int birthYear = 1986;
        String template = "{\"name\" : %s\", \"birthYear\": \"%d\"}";//%s строка %d целое число %f не целое
        //%b boolean %n перенос строки %t дата Date %% символ процента
        String result = String.format(template, name, birthYear);
        System.out.println(result);
        System.out.printf(template, name, birthYear);
    }

}
