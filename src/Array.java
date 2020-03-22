import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int size;
        int[] demoArray;
        boolean isValid = false;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Invalid! Size does not exceed 20!");
            } else {
                isValid = true;
            }
        } while (!isValid);

        demoArray = new int[size];
        int index = 0;
        while (index < demoArray.length) {
            System.out.printf("Enter element %d: ", (index + 1));
            demoArray[index] = scanner.nextInt();
            index++;
        }

        System.out.printf("%-20s ", "Elements in array: ");
        for (index = 0; index < demoArray.length; index++) {
            System.out.print(demoArray[index] + "\t");
        }
        for (index = 0; index < demoArray.length / 2; index++) {
            int temp = demoArray[index];
            demoArray[index] = demoArray[demoArray.length - 1 - index];
            demoArray[demoArray.length - 1 - index] = temp;
        }

        System.out.println();
        System.out.println("Swap element!");
        System.out.printf("%-20s ", "Elements in array after swap: ");
        for (index = 0; index < demoArray.length; index++) {
            System.out.print(demoArray[index] + "\t");
        }
    }
}
