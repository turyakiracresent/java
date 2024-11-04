import java.util.*;
public class loan {
    public static void main(String[] args){
       Scanner loan = new Scanner(System.in);
        double lA,iR,lP, sI,mT,tP;
  System.out.println("Enter loan amount: ");
       lA=loan.nextDouble(); 
        System.out.println("Enter interset rate: ");
       iR=loan.nextDouble();
        System.out.println("Enter loan peroid: ");
       lP=loan.nextDouble();
        sI=(lA*iR*lP)/100;
        mT=sI*30;
        System.out.println("Monthly installments with interest is: "+mT);
        tP=lA+mT;
        System.out.print("Total Amount to pay is: " + tP);
    }
}