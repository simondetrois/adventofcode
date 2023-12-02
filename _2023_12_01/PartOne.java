package _2023_12_01;

import java.util.*;

public class PartOne extends Super {

    public static void main(String[] args) {
        PartOne main = new PartOne();
        main.calibrate();
    }

    private void calibrate() {
        List<String> lines = Arrays.stream(getInput().split("\n")).toList();

        int sum = 0;

        for (String line : lines) sum += getlineNumber(line);

        System.out.println(sum);
    }

    private int getlineNumber(String line) {
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

}
