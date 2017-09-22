import java.util.Scanner;
/* Jeff Moretz Fall 2017    CSC 151 680c */
public class InvoiceApp {
    public static void main(String[] args)
    {
      //testMethodArgs("Hello", 34);  
        // R, C and T
        String custType;
        double subTotal;
        String out;
        double rtn;
        
        /*
            Test 1: Customer Type R
        */
        out = "Type R: ----------------------------------------------------\n";
        System.out.println(out);
        
        // sub-test 1
        custType = "R";
        subTotal = 249;
        out = "Passing value less than 250: expected return 0.0";
        System.out.println(out);
        rtn = getDiscountPercent(custType, subTotal);
        out = String.format("Actual: %f", rtn);
        System.out.println(rtn);
        
        // sub-test 2
        subTotal = 250;
        out = "Passing value equal to 250: expected return 0.25";
        System.out.println(out);
        rtn = getDiscountPercent(custType, subTotal);
        out = String.format("Actual: %f", rtn);
        System.out.println(rtn);
        
        // sub-test 3
        subTotal = 500;
        out = "Passing value greater than or equal to 500: expected return 0.30";
        System.out.println(out);
        rtn = getDiscountPercent(custType, subTotal);
        out = String.format("Actual: %f", rtn);
        System.out.println(rtn);
        
        System.out.println("");
        /*
            Test 2: Customer Type C
        */
        out = "Type C: ----------------------------------------------------\n";
        System.out.println(out);
        
        //sub-test 1
        custType = "C";
        subTotal = 500;
        out = "Passing arbitrary value: expected return 0.20";
        System.out.println(out);
        rtn = getDiscountPercent(custType, subTotal);
        out = String.format("Actual: %f", rtn);
        System.out.println(rtn);
        
        System.out.println("");
    }
    
    public static double getDiscountPercent(String type, double subtotal) {
        double totalDiscount = 0.0;
        
        if(type == "R") {
            if (subtotal >= 250 && subtotal < 500) {
               totalDiscount = 0.25;  
            } else if (subtotal >= 500) {
                totalDiscount = .30;
            }    
        } else if(type == "C") {
            totalDiscount = .20;
        }
        
        return totalDiscount;
    }
    
    public static void testMethodArgs(String str, int num) {
        int tmp = 5;
        System.out.println("testMethodArgs");
        System.out.println(str);
        System.out.println(tmp + num);
    }
}

/*
// welcome the user to the program
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        Scanner sc = new Scanner(System.in);
        
        // declare numberInvoice,averageInvoice and averageDiscount
        
        double       numberInvoice = 0.0;
        double       averageInvoice = 0.0;
        double       averageDiscount = 0.0;        
        double       totalInvoiceAmt = 0.0;
        double       totalDiscount = 0.0;
        double       averageDiscountAmt = 0.0;
        

        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (!choice.equalsIgnoreCase("n"))
        {
            // get the invoice subtotal from the user
            System.out.print("Enter subtotal:   ");
            double subtotal = sc.nextDouble();

            // calculate the discount amount and total
            double discountPercent= 0.0;
            if (subtotal >= 500)
                discountPercent = 0.25;
            else if (subtotal >= 100)
                discountPercent = .1;
            else
                discountPercent = 0.0;
            
            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;
            
            
             //calculate numberInvoice, averageInvoice and averageDiscount
            
                   numberInvoice = numberInvoice + 1;
                   totalInvoiceAmt = subtotal + totalInvoiceAmt;
                   averageInvoice =  totalInvoiceAmt / numberInvoice;
                   totalDiscount = discountAmount + numberInvoice; 
                   averageDiscount = totalDiscount * numberInvoice;
            
             //display the discount amount and total
           
            String message = "Discount percent: " + discountPercent + "\n"
                           + "Discount amount:  " + discountAmount + "\n"
                           + "Invoice total:    " + total + "\n";
            
            System.out.println(message);

           
            
            
            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        String message2 = "Number Of Invoices: " + numberInvoice + "\n"
                           + "Average Invoice: " + averageInvoice + "\n"
                           + "Average Discount: " + averageDiscount + "\n";
            
        
        System.out.println(message2);
*/