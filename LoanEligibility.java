import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Customer " + i);
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter monthly income: ");
            int income = sc.nextInt();

            System.out.print("Enter credit score: ");
            int creditScore = sc.nextInt();
            if (age >= 21 && age <= 60) {
                if (income > 30000) {

                    if (creditScore > 700) {
                        System.out.println("Loan Approved");
                    } else {
                        System.out.println("Loan Rejected Low Credit Score");
                    }

                } else {
                    System.out.println("Loan Rejected Low Income");
                }

            } else {
                System.out.println("Loan Rejected Invalid Age");
            }
        }
    }
}