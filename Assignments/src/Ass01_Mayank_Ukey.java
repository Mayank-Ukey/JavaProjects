import java.util.Scanner;

public class Ass01_Mayank_Ukey{
    static int calMax(int num1, int num2, int num3){
        if(num1>num2 && num1>num3){
            return num1;
        }
        else if(num2>num1 && num2>num3){
            return num2;
        }
        else{
            return num3;
        }
    }

    static boolean checkAlpha(char ch){
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
            return true;
        }
        return false;
    }

    static double calInterest(int depo){
        if(depo<=1000){
            return depo*0.04;
        }
        else if(depo>1000 && depo<=5000){
            return depo*0.045;
        }
        else{
            return depo*0.05;
        }
    }

    static double calTax(double gPay) {
        if(gPay<=240) {
            return 0.0;
        }
        else if(gPay>240 && gPay<=480) {
            return gPay*0.15;
        }
        else {
            return (gPay-gPay*0.15)*0.28;
        }
    }

    static boolean isPrimeNumber(int n) {
        if(n==2 || n==3 || n==5 || n==7) {
            return true;
        }
        else if(n%2==0 || n%3==0 || n%5==0 || n%7==0) {
            return false;
        }
        else {
            return true;
        }
    }

    static void printPrime(int range) {
        for(int i=2; i<=range; i++) {
            if(isPrimeNumber(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    static float calculateProfit(int attendee) {
        return (float) ((attendee*5)-(20 + attendee*0.5));
    }

    static float calculateElectricityBill(int type, int units) {
        if(type==1) {
            if(units<=100) {
                float value = 4*units;
                if(value>250) {
                    return value;
                }
                return (float) 250.0;
            }
            else if(units>100 && units<=300) {
                return (float)(units*4.50);
            }
            else if(units>300 && units<=500) {
                return (float)(units*4.75);
            }
            else {
                return (float)(units*5);
            }
        }
        else if(type==2){
            if(units<=100) {
                float value = (float)(units*4.25);
                if(value>350) {
                    return value;
                }
                return (float)(350.0);
            }
            else if(units>100 && units<=300) {
                return (float)(units*4.75);
            }
            else if(units>300 && units<=500) {
                return (float)(units*5);
            }
            else {
                return (float)(units*5.25);
            }
        }
        else {
            return (float)-1.0;
        }
    }

    static double calLoan(int chargeAmount) {
        if(chargeAmount<=500) {
            return 0.0025*chargeAmount;
        }
        else if(chargeAmount>500 && chargeAmount<=1500) {
            float charge = (float)(0.0025*500);
            return (chargeAmount-500)*0.0050 + charge;
        }
        else if(chargeAmount>1500 && chargeAmount<=2500) {
            float charge = (float)0.0025*500;
            float nextCharge = (float)(1000*0.0050);
            return (chargeAmount-1000-500)*0.0075+charge+nextCharge;
        }
        else {
            float charge = (float)0.0025*500;
            float nextCharge = (float)0.0050*1000;
            float secNextCharge = (float)0.0075*1000;
            return (chargeAmount-2500)*0.01+charge+nextCharge+secNextCharge;
        }
    }

    static void displayMultiplicationMatrix() {
        for(int i=1; i<=12; i++) {
            for(int j=1; j<=10; j++) {
                System.out.printf("%4d",i*j," ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Find maximum amongst three number: ");
            System.out.println("2. Check whether the character entered is vowel or not: ");
            System.out.println("3. Calculate yearly interest on a deposited amount: ");
            System.out.println("4. Calculate tax on a given amount: ");
            System.out.println("5. Check the number is prime or not: ");
            System.out.println("6. Print prime numbers within a range:");
            System.out.println("7. Calculate profit of the show: ");
            System.out.println("8. Calculate electricity bill: ");
            System.out.println("9. Compute the pay back amount on a charge amount: ");
            System.out.println("10. Create a multiplication table in a rectangular array: ");
            System.out.println("11. Exit");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    int num1, num2, num3;
                    System.out.println("Enter first number: ");
                    num1 = sc.nextInt();
                    System.out.println("Enter second number: ");
                    num2 = sc.nextInt();
                    System.out.println("Enter third number: ");
                    num3 = sc.nextInt();
                    int res = calMax(num1, num2, num3);
                    System.out.println("The maximum number is: "+res);
                    break;

                case 2:
                    char ch;
                    System.out.println("Enter your character: ");
                    ch = sc.next().charAt(0);
                    boolean result = checkAlpha(ch);
                    if(result){
                        System.out.println("The entered character is a vowel.");
                    }
                    else{
                        System.out.println("The entered character is not a vowel.");
                    }
                    break;

                case 3:
                    int depo;
                    System.out.println("Enter amount: ");
                    depo = sc.nextInt();
                    double res1 = calInterest(depo);
                    System.out.println("The yearly interest on the entered amount is: "+res1);
                    break;

                case 4:
                    double gPay;
                    System.out.println("Enter the gross pay amount: ");
                    gPay = sc.nextDouble();
                    double tax = calTax(gPay);
                    System.out.println("The tax owed is: "+tax);
                    break;

                case 5:
                    int n;
                    System.out.println("Enter the number: ");
                    n = sc.nextInt();
                    boolean isPrime = isPrimeNumber(n);
                    if(isPrime) {
                        System.out.println("The number is a prime number.");
                    }
                    else {
                        System.out.println("The number is not a prime number.");
                    }
                    break;

                case 6:
                    int range;
                    System.out.println("Enter the range for prime number: ");
                    range = sc.nextInt();
                    printPrime(range);
                    break;

                case 7:
                    int attendee;
                    System.out.println("Enter the number of attendees of the show: ");
                    attendee = sc.nextInt();
                    float profit = calculateProfit(attendee);
                    System.out.println("The profit of theatre per show is: "+profit);
                    break;

                case 8:
                    int type, units;
                    System.out.println("Enter your type of electricity connection: 1. Domestic 2. Commercial");
                    type = sc.nextInt();
                    System.out.println("Enter the number of units consumed: ");
                    units = sc.nextInt();
                    float bill = calculateElectricityBill(type, units);
                    if(bill==-1.0) {
                        System.out.println("Invalid input.");
                    }
                    else {
                        System.out.println("The electricity bill is: "+bill);
                    }
                    break;

                case 9:
                    int chargeAmount;
                    System.out.println("Enter the charge amount: ");
                    chargeAmount = sc.nextInt();
                    double payBack = calLoan(chargeAmount);
                    System.out.println("The payback amount is: "+payBack);
                    break;

                case 10:
                    displayMultiplicationMatrix();
                    break;
            }
        }while(choice<11);
        System.out.println("You are out of the program.");
        sc.close();
    }
}