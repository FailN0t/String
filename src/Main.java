import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String phone1 = "+7 903 712-37-54";
        String phone2 = "7 (903) 968-60-45";
        String phone3 = "7999-666-66-66";
        String phone4 = "7(903)9616245";
        String regex = "[^0-9]"; //создает строку всех символов кроме
        // цифр благодаря отрицанию ^
        System.out.println(formatPhoneNumber(phone1, regex));
        System.out.println(formatPhoneNumber(phone2, regex));
        System.out.println(formatPhoneNumber(phone3, regex));
        System.out.println(formatPhoneNumber(phone4, regex));
        regex = "[0-9]";
        System.out.println(formatPhoneNumber(phone1, regex));
        System.out.println(formatPhoneNumber(phone2, regex));
        System.out.println(formatPhoneNumber(phone3, regex));
        System.out.println(formatPhoneNumber(phone4, regex));

        String text = "I know something about it";
        String[] words = text.split("\s"); //помещает слова без пробелов в
        // отдельную ячейку массива разделяем при помощи символа \s,
        // он обозначает все пробельные символы

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }


        //Проверка соответствия строк шаблону


        String lettersRange = "[АВЕКМНОРСТУХ]";
        String number = "А674МР197";
        String regex1 = lettersRange + "[0-9]{3}" + lettersRange + "{2}[0-9]{2,3}";

        System.out.println(number.matches(regex1));

        //Поиск фрагментов строк, соответствующих шаблону

        String text1 = "Алексей, добрый день!\nМой гитхаб — https://github.com/," +
                " а также ссылка на мой персональный сайт — https://www.skillbox.ru/\nЕсли возникнут вопросы," +
                " пишите мне напрямую. Я всегда доступен";
        String regex2 = "https://[^,\\s]+";
        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(text1);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text1.substring(start, end));
        }
        boolean b =true;
        matcher.find(0);
        while (b) {
            System.out.println(matcher.group());
            b = matcher.find();
        }

        //Маски в регулярных выражениях

        String text2 = "Дмитрий сообщил следующее: «Я вернусь в 12:40 и," +
                " будьте добры, подготовьте к этому времени" +
                " все документы!» На что Анна ему ответила:" +
                " «А документы-то так и не привезли». Дмитрий удивлённо" +
                " посмотрел на неё и сказал: «Ну и ладно», — вздохнул, махнул рукой и удалился.";
        String regex3 = "«([^»]+)»";
        Pattern pattern1 = Pattern.compile(regex3);
        Matcher matcher1 = pattern1.matcher(text2);
        while (matcher1.find()) {
            String citation = matcher1.group(1);//То есть:     matcher.group(1); вернёт
            // содержимое первой маски, matcher.group(2); — второй,
            // а  matcher.group(0); будет возвращать целиком весь
            // соответствующий регулярному выражению текст
            System.out.println(citation);
        }
        String data = "256 * 32 = ?";
        String[] word1 = data.split("\s+[^,;:]\s+");
        for (int i = 0; i < word1.length; i++) {
            System.out.println(word1[i]);
        }
        String text5 = "A23E-8M28-76AF-2L65-24A3";
        String regex5 = "[A-F0-9]{4}";
        Pattern pattern5 = Pattern.compile(regex5);
        Matcher matcher5 = pattern5.matcher(text5);
        matcher5.find();
        matcher5.find();
        matcher5.find();
        System.out.println(matcher5.group());
    }

    public static String formatPhoneNumber(String phone, String regex) {
        return phone.replaceAll(regex, "");
    }
}
