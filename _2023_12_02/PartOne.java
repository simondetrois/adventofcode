package _2023_12_02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PartOne extends Super {

    public static void main(String[] args) {
        PartOne partOne = new PartOne();
        partOne.determinePossibilities();
    }

    public void determinePossibilities() {
        List<String> games = Arrays.stream(getPuzzleInput().replaceAll("([A-Z])\\w+\\s\\d+: ", "").split("\n")).toList();

        int indexSum = 0;

        for (int i = 0 ; i < games.size(); i++) {
            String[] subGames = games.get(i).split("; ");
            boolean gameIsPossible = true;
            for (String subGame : subGames){
                if (!subGameIsPossible(subGame)) gameIsPossible = false;
            }
            if (gameIsPossible) indexSum += (i+1);
        }

        System.out.println(indexSum);

    }

    public boolean subGameIsPossible(String subGame) {
        String[] cubes = subGame.split(", ");
        for(String cube : cubes){
            for (String color: getColors()){
                if (cube.contains(color)){
                    int draws = Integer.parseInt(cube.split(" ")[0]);
                    if (draws > getColorMap().get(color)) return false;
                    else break;
                }
            }
        }
        return true;
    }
}
