package exercise;

import java.util.List;


// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        return emails.stream()
                .filter(email -> email.endsWith("@gmail.com")
                        || email.endsWith("@yandex.ru")
                        || email.endsWith("@hotmail.com"))
                .count();
    }

//    public final static List<String> VALID_DOMAINS = List.of("gmail.com", "yandex.ru", "hotmail.com");
//
//    public static long getCountOfFreeEmailsPro(List<String> emails) {
//        return emails.stream()
//                .map(email -> email.split("@")[1])
//                .filter(VALID_DOMAINS::contains)
//                .count();
//    }
}
// END
