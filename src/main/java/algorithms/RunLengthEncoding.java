package algorithms;

public class RunLengthEncoding {
    public static void main(String[] args) {
        String test = "AAAAAAAAAAAAABBCCCCDD"; //expect 9A4A2B4C2D
        System.out.println(runLengthEncoding(test));
    }

    public static String runLengthEncoding(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = string.toCharArray();
        int counter = 1;

        for (int i = 0; i < chars.length; i++) {
            if (counter == 9 || i == chars.length - 1 || chars[i + 1] != chars[i]) {
                stringBuilder.append(counter).append(chars[i]);
                counter = 1;
            } else {
                counter++;
            }
        }

        return stringBuilder.toString();
    }
}
