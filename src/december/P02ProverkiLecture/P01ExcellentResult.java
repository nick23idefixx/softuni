package december.P02ProverkiLecture;

import java.util.Scanner;

public class P01ExcellentResult {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int grade = Integer.parseInt(scanner.nextLine());

        if (grade >=6) {
            System.out.println("Excellent!");
        }
    }
}
