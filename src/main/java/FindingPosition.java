public class FindingPosition {

    public static int getPosition(int limit) {
        /*
        pos_1 = 1; stage_1 = 1 [Take one step forward (+1 step)]
        pos_2 = -1; stage_2 = -2 [Take two step backward (-2 steps)]

        stage_n = stage_n-1 - stage_n-2
        pos_n = pos_n-1 + stage_n
         */

        int position = -1;
        int ultimate = -2; // stage_n-1
        int penultimate = 1; // stage_n-2

        for (int i = 3; i <= limit; i++) {
            int currentStage = ultimate - penultimate;
            position += currentStage;

            penultimate = ultimate;
            ultimate = currentStage;
        }

        return position;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("The dancer's postion at step " + n + " is " + getPosition(n));
    }
}
