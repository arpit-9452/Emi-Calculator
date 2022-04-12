import java.util.Scanner;

public class  Main{

    public static int Calculate(int loanAmt, int intrest){
        int  totalamount = loanAmt*intrest/100;
        int grandtotalAmt = totalamount+loanAmt;
        return grandtotalAmt;
    }
    public static int EmiinMonths(int grandtotalAmt, int months){
        int emiInMoth = grandtotalAmt/months;
        return emiInMoth;
    }
    public static void main(String args[]){
        System.out.println("Welcome to the Loan Calclulator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Loan Amount");
        int loanAmt = sc.nextInt();
        System.out.println("Enter your Intrest Value");
        int intrest = sc.nextInt();
        
        
        int grandtotalAmt = Calculate(loanAmt, intrest);
        System.out.println("Your Intrest Included Amount is "+grandtotalAmt);
        System.out.println("Do you want to Generate EMi on Months wise?");
        sc.nextLine();
        String condtion = sc.nextLine();
        if(condtion.equals("yes")){
        System.out.println("Choose your Months");
        int months = sc.nextInt();
        int emiInMoth = EmiinMonths(grandtotalAmt, months);
        System.out.println(emiInMoth);
    }
    }
}
