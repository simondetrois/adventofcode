package _2023_12_01;

import java.util.*;

public class PartTwo extends Super  {

    public static void main(String[] args) {
        PartTwo main = new PartTwo();
        main.calibrate();
    }

    private void calibrate() {
        List<String> lines = new ArrayList<>(Arrays.stream(getInput().split("\n")).toList());

        int sum = 0;

        transformLines(lines);

        for (String line : lines) sum += getlineNumber(line);

        System.out.println(sum);
    }

    private void transformLines( List<String> lines) {
        for (int i = 0; i < lines.size() - 1; i++) {
            for (String numberValue : getStringValues) {
                if (lines.get(i).contains(numberValue)) {
                    lines.set(i, lines.get(i).replace(numberValue, numberValue.charAt(0) +getNumberMap.get(numberValue) + numberValue.charAt(numberValue.length() - 1)));
                }
            }
        }
    }

    private int getlineNumber(String line){
        int a = 0, b = line.length() - 1;

        char aChar = 'a', bChar = 'b';

        while (a <= b) {
            if (Character.isDigit(line.charAt(a))) aChar = line.charAt(a);
            if (Character.isDigit(line.charAt(b))) bChar = line.charAt(b);
            if (!(Character.isDigit(aChar))) a++;
            if (!(Character.isDigit(bChar))) b--;
            if (Character.isDigit(aChar) && Character.isDigit(bChar)) break;
        }

        return Integer.parseInt("" + aChar + bChar);
    }

    private final Map<String, String> getNumberMap = new HashMap<>() {{
        put("zero", "0");
        put("one", "1");
        put("two", "2");
        put("three", "3");
        put("four", "4");
        put("five", "5");
        put("six", "6");
        put("seven", "7");
        put("eight", "8");
        put("nine", "9");
    }};

    private final List<String> getStringValues = getNumberMap.keySet().stream().toList();



}
