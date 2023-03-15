package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App{
    public static String getForwardedVariables(String fileContent) {
        String[] variables = fileContent.split("\n");
        String envPrefix = "X_FORWARDED_";
        String envSb = "environment=";
        return Arrays.stream(variables)
                .filter(x -> x.startsWith(envSb))
                .map(x -> x.replaceAll(envSb, ""))
                .map(x -> x.replaceAll("\"", ""))
                .map(x -> x.split(","))
                .flatMap(Arrays::stream)
                .filter(x -> x.startsWith(envPrefix))
                .map(x -> x.replaceAll(envPrefix, ""))
                .collect(Collectors.joining(","));
    }
}
// environment="X_FORWARDED_mail=tirion@google.com ->  mail=tirion@google.com
//END
