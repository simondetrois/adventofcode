package _2023._2023_12_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartTwo extends Super {

    public static void main(String[] args) {
        PartTwo partTwo = new PartTwo();
        partTwo.getSum();
    }

    private void getSum() {
        char[][] matrix = getMatrix();
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (isGear(matrix[i][j])) {
                    List<Integer> numberList = new ArrayList<>();
                    if (i > 0) {
                        if (j > 0 && isNumber(matrix[i - 1][j - 1])) numberList.add(getNumber(matrix[i - 1], j - 1));

                        if (isNumber(matrix[i - 1][j])) numberList.add(getNumber(matrix[i - 1], j));

                        if (j < matrix[i - 1].length - 1 && isNumber(matrix[i - 1][j + 1])) numberList.add(getNumber(matrix[i - 1], j + 1));
                    }

                    if (j > 0 && isNumber(matrix[i][j - 1])) numberList.add(getNumber(matrix[i], j - 1));

                    if (j < matrix[i].length - 1 && isNumber(matrix[i][j + 1])) numberList.add(getNumber(matrix[i], j + 1));

                    if (i < matrix.length - 1) {
                        if (j > 0 && isNumber(matrix[i + 1][j - 1])) numberList.add(getNumber(matrix[i + 1], j - 1));

                        if (isNumber(matrix[i + 1][j])) numberList.add(getNumber(matrix[i + 1], j));

                        if (j < matrix[i + 1].length - 1 && isNumber(matrix[i + 1][j + 1])) numberList.add(getNumber(matrix[i + 1], j + 1));

                    }
                    if (numberList.size() == 2 ){
                        sum += numberList.get(0) * numberList.get(1);
                    }
                }
            }
        }
        System.out.println(sum);
    }


    private int getNumber(char[] line, int row) {
        String s = "";
        while (row > 0 && Character.isDigit(line[row - 1])) {
            row--;
        }
        while (row < 140 && Character.isDigit(line[row])) {
            s += line[row];
            line[row++] = '.';
        }
        return Integer.parseInt(s);
    }

    private boolean isNumber(char currentChar) {
        return Character.isDigit(currentChar);
    }

    private boolean isGear(char currentChar) {
        return currentChar == '*';
    }

    private char[][] getMatrix() {
        List<String> lines = Arrays.stream(getPuzzleInput().split("\n")).toList();
        char[][] matrix = new char[lines.size()][lines.get(0).length()];
        for (int i = 0; i < lines.size(); i++) {
            matrix[i] = lines.get(i).toCharArray();
        }
        return matrix;
    }
}

