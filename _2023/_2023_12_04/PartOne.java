package _2023._2023_12_04;

import java.util.Arrays;
import java.util.List;

public class PartOne extends Super{
    public static void main(String[] args) {
        PartOne partOne = new PartOne();
                partOne.getTotalWorth();
    }

    public void getTotalWorth(){
        List<String> games = Arrays.stream(getInputPuzzle().split("\n")).toList();
        int totalWorth = 0;
        for (String game: games) totalWorth += getGameWorth(game);
        System.out.println(totalWorth);
    }

    private int getGameWorth(String game) {
        game = game.replaceAll("([A-Z])\\w+\\s*\\d+:\\s+", "");
        List<String> seperatedNumbers = List.of(game.split("\\|"));
        List<String> winningNumbers = List.of(seperatedNumbers.get(0).replaceAll("\\s+", ".").split("\\."));
        List<String> pickedNumbers = List.of(seperatedNumbers.get(1).replaceAll("\\s+", ".").split("\\."));
        int correctNumbers = 0;
        for (String pickedNumber : pickedNumbers){
            if (winningNumbers.contains(pickedNumber) && correctNumbers == 0){
                correctNumbers +=1;
            } else if (winningNumbers.contains(pickedNumber)){
                correctNumbers *=2;
            }
        }
        return correctNumbers;
    }


}
