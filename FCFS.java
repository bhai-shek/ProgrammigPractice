
import java.util.Scanner;

public class FCFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] bt = new int[n];
        int[] wt = new int[n];
        int[] tat = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter burst time of P" + (i + 1) + ": ");
            bt[i] = sc.nextInt();
        }

        wt[0] = 0;

        for (int i = 1; i < n; i++) {
            wt[i] = wt[i - 1] + bt[i - 1];
        }

        double totalWT = 0;
        double totalTAT = 0;

        System.out.println("\nProcess\tBT\tWT\tTAT");

        for (int i = 0; i < n; i++) {
            tat[i] = wt[i] + bt[i];
            totalWT += wt[i];
            totalTAT += tat[i];

            System.out.println("P" + (i + 1) + "\t"
                    + bt[i] + "\t"
                    + wt[i] + "\t"
                    + tat[i]);
        }

        System.out.println("Average Waiting Time: " + totalWT / n);
        System.out.println("Average Turnaround Time: " + totalTAT / n);

        sc.close();
    }
}
