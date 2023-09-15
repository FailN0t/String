import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String empty = "";
        boolean isEmpty = empty.length() == 0; // length - длинна строки

        isEmpty = empty.isEmpty(); // isEmpty - проверка пустая ли строка

        isEmpty = empty.isBlank(); // true если строка пуста или вней тольео символы " \t \n"

        long start = System.currentTimeMillis();
         String mask = "mask 9865";
         String goods = "";

         for(int i = 0; i<100_000; i++){
             goods += mask + "\n";
         }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(goods.length());

        start = System.currentTimeMillis();
        mask = "mask 9865";
        StringBuilder goods1 = new StringBuilder();

        for(int i = 0; i<10_000_000; i++){
            goods1.append(mask).append("\n");
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(goods1.length());

        start = System.currentTimeMillis();
        mask = "mask 9865";
        String goods2 = "";

        for(int i = 0; i<10_000_000; i++){
            goods2.concat(mask).concat("\n");
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(goods1.length());

        String name = "Dmitri";
        String customerName = "Dmi" + "tri";
        System.out.println(name.equals(customerName));//наиболее правильный способ сравнения строк
    }
}
