package _2023._2023_12_03;

import java.util.Arrays;
import java.util.List;

public class PartOne extends Super {

    public static void main(String[] args) {
        PartOne partOne = new PartOne();
        partOne.getSum();
    }

    private void getSum (){
        char [][] matrix = getMatrix();
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (isSymbol(matrix[i][j])){
                    if (i > 0){
                        if (j > 0 && isNumber(matrix[i-1][j-1])){
                            int number = getNumber(matrix[i-1], j-1);
                            sum +=number;
                        }
                        if (isNumber(matrix[i-1][j])){
                            int number = getNumber(matrix[i-1], j);
                            sum +=number;
                        }
                        if ( j < matrix[i-1].length - 1 && isNumber(matrix[i-1][j+1])){
                            int number = getNumber(matrix[i-1], j+1);
                            sum +=number;
                        }
                    }
                    if (j > 0 && isNumber(matrix[i][j-1])){
                        int number = getNumber(matrix[i], j-1);
                        sum +=number;
                    }
                    if (j < matrix[i-1].length - 1 && isNumber(matrix[i][j+1])){
                        int number = getNumber(matrix[i], j+1);
                        sum +=number;
                    }
                    if (i < matrix.length -1){
                        if (j > 0 && isNumber(matrix[i+1][j-1])){
                            int number = getNumber(matrix[i+1], j-1);
                            sum +=number;
                        }
                        if (isNumber(matrix[i+1][j])){
                            int number = getNumber(matrix[i+1], j);
                            sum +=number;
                        }
                        if (j < matrix[i-1].length - 1 && isNumber(matrix[i+1][j+1])){
                            int number = getNumber(matrix[i+1], j+1);
                            sum +=number;
                        }
                    }

                }
            }
        }
        System.out.println(sum);
    }


    private int getNumber(char[] line, int row){
        String s = "";
        while(row > 0 && Character.isDigit(line[row-1])){
            row --;
        }
        while(row < 140 && Character.isDigit(line[row])){
            s += line[row];
            line[row++] = '.';
        }
        return Integer.parseInt(s);
    }

    private boolean isNumber(char currentChar){
        return Character.isDigit(currentChar);
    }

    private boolean isSymbol (char currentChar){
        return !isNumber(currentChar) && currentChar != '.';
    }

    private char[][] getMatrix() {
        List<String> lines = Arrays.stream(getPuzzleInput().split("\n")).toList();
        char [][] matrix = new char[lines.size()][lines.get(0).length()];
        for (int i = 0; i < lines.size(); i++) {
            matrix[i] = lines.get(i).toCharArray();
        }
        return matrix;
    }
}
