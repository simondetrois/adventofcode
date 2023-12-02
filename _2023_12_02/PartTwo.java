package _2023_12_02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PartTwo extends Super {

    public List<String> games = Arrays.stream(getPuzzleInput().replaceAll("([A-Z])\\w+\\s\\d+: ", "").split("\n")).toList();


    public static void main(String[] args) {
        PartTwo partTwo = new PartTwo();
        partTwo.calculatePowerOfSets();
    }

    public void calculatePowerOfSets() {
        List<String> games = Arrays.stream(getPuzzleInput().replaceAll("([A-Z])\\w+\\s\\d+: ", "").split("\n")).toList();

        int powerSum = 0;

        for (String game : games) {
            String[] subGames = game.split("; ");
            int red = 0, blue = 0, green = 0;
            for (String subgame : subGames) {
                String[] cubes = subgame.split(", ");
                for (String cube : cubes) {
                    for (String color : getColors()) {
                        if (cube.contains(color)) {
                            int draws = Integer.parseInt(cube.split(" ")[0]);
                            switch (color) {
                                case "red" -> red = Math.max(draws, red);
                                case "blue" -> blue = Math.max(draws, blue);
                                case "green" -> green = Math.max(draws, green);
                            }
                        }
                    }
                }
            }
            powerSum += (red == 0 ? 1 : red) * (blue == 0 ? 1 : blue) * (green == 0 ? 1 : green);
        }

        System.out.println(powerSum);
    }

}

