import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        // Input size
        do {
            System.out.println("Enter size:");
            size = sc.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        //input array
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element:" + (i) + ":");
            array[i] = sc.nextInt();
        }
        //display list
        int count =0;
        System.out.print("List of marth:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if(array[j]>=5 && array[j]<=10){
                count++;
            }
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
