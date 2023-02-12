public class Main {
    public static void main(String[] args) {
        String[] names = {"Alibek", "Almaz", "Nursultan", "Madiyar", "Madiyar2", "Dauren", "Dauren2", "Batyr", "Nailya", "Dayana", "Yersultan", "Saltanat", "Aizhan", "Aizhan2", "Arai", "Dana"};
        int[] times = {347, 361, 423, 351, 383, 354, 356, 350, 419, 451, 349, 424, 439, 444, 440, 430};

        int fastestIndex = findFastestStudent(names, times);

        System.out.println("The fastest student is: " + names[fastestIndex] + " with a time of " + times[fastestIndex] + " seconds.");
    }

    public static int findFastestStudent(String[] names, int[] times) {
        for (int i = 0; i < times.length; i++) {
            for (int j = i + 1; j < times.length; j++) {
                if (times[i] > times[j]) {
                    int temp = times[i];
                    times[i] = times[j];
                    times[j] = temp;

                    String nameTemp = names[i];
                    names[i] = names[j];
                    names[j] = nameTemp;
                }
            }
        }

        return 0;
    }
}
