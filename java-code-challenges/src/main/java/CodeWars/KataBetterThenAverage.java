package CodeWars;

import java.util.Arrays;

//There was a test in your class and you passed it. Congratulations!
//
//But you're an ambitious person. You want to know if you're better than the average student in your class.
//
//You receive an array with your peers' test scores. Now calculate the average and compare your score!
//
//Return true if you're better, else false!
//
//Note:
//Your points are not included in the array of your class's points. Do not forget them when calculating the average score!
public class KataBetterThenAverage {
    public static boolean betterThenAverage(int[] classPoints, int yourPoints){
        double average = Arrays.stream(classPoints)
                .average()
                .orElseThrow(() -> new IllegalArgumentException("Array of class points cannot be empty"));
        return average < yourPoints;
    }

    public static void main(String[] args) {

        System.out.println(betterThenAverage(new int[]{3,2},5));
    }
}
