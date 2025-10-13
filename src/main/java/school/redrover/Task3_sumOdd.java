package school.redrover;

public class Task3_sumOdd {
    public static void main(String[] args) {
        rowSumOddNumbersTina(2);
        rowSumOddNumbersTina(3);
        rowSumOddNumbersTina(5);

        System.out.println("\n-------Yuliya-------");
        System.out.println(rowSumOddNumbersYuliya(3));
        System.out.println(rowSumOddNumbersYuliya(5));
        System.out.println(rowSumOddNumbersYuliya(42));
    }

    //Простите, вот с этой задачей я накололась :D
    public static int rowSumOddNumbersTina(int n) {
        return n * n * n;
    }

    public static int rowSumOddNumbersYuliya(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += n * n;
        }
        return sum;
    }
}
