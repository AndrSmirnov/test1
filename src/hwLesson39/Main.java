package hwLesson39;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String>list = List.of("knife", "plate", "fork");
        System.out.println(max_minLengthOfString(list)) ;
    }

    public  static String max_minLengthOfString (List<String> strings) {
        String maxStr = strings.get(0);
        String minStr = strings.get(0);

        for (String s : strings) {
            if (s.length() < minStr.length()) {
                minStr = s;
            }
            if (s.length() > maxStr.length()) {
                maxStr = s;
            }
        }
        return strings.indexOf(minStr) < strings.indexOf(maxStr) ? minStr : maxStr;
    }
}
