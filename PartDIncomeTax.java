import java.io.File;

import java.util.Scanner;

public class PartDIncomeTax
{
    public static void main(String[] args) throws Exception
    {
        String valueOfEachLine = "";
        double valueOfEachLineConverted = 0;
        double totalIncomeProcessed = 0;
        double taxCalculated = 0;
        double totalTaxCalculated = 0;
        final double FIRST_TAX_RATE = 0.1;
        final double SECOND_TAX_RATE = 0.2;
        final double THIRD_TAX_RATE = 0.3;
        final double FOURTH_TAX_RATE = 0.4;
        final double FIFTH_TAX_RATE = 0.5;
        final double SIXTH_TAX_RATE = 0.6;
        int numberOfInvalidProcessed = 0;
        int numberOfNumbersProcessed = 0;
        
        File myFile = new File("income_amounts.txt");
        Scanner fileInput = new Scanner(myFile);
        fileInput.useDelimiter(",|" + System.getProperty("line.separator"));
        
        while (fileInput.hasNext())
        {
            numberOfNumbersProcessed++;
            valueOfEachLine = fileInput.next();
            valueOfEachLineConverted = Double.parseDouble(valueOfEachLine);
            if(valueOfEachLineConverted>0 && valueOfEachLineConverted<=50000)
            {
                taxCalculated *= FIRST_TAX_RATE;
                totalTaxCalculated += taxCalculated;
                totalIncomeProcessed += valueOfEachLineConverted;
                //valueOfEachLineConverted = 0;
            }
            else if(valueOfEachLineConverted>50000 && valueOfEachLineConverted<=75000)
            {
                taxCalculated *= SECOND_TAX_RATE;
                totalTaxCalculated += taxCalculated;
                totalIncomeProcessed += valueOfEachLineConverted;
                //valueOfEachLineConverted = 0;
            }
            else if(valueOfEachLineConverted>75000 && valueOfEachLineConverted<=100000)
            {
                taxCalculated *= THIRD_TAX_RATE;
                totalTaxCalculated += taxCalculated;
                totalIncomeProcessed += valueOfEachLineConverted;
                //valueOfEachLineConverted = 0;
            }
            else if(valueOfEachLineConverted>100000 && valueOfEachLineConverted<=250000)
            {
                taxCalculated *= FOURTH_TAX_RATE;
                totalTaxCalculated += taxCalculated;
                totalIncomeProcessed += valueOfEachLineConverted;
                //valueOfEachLineConverted = 0;
            }
            else if(valueOfEachLineConverted>250000 && valueOfEachLineConverted<=500000)
            {
                taxCalculated *= FIFTH_TAX_RATE;
                totalTaxCalculated += taxCalculated;
                totalIncomeProcessed += valueOfEachLineConverted;
                //valueOfEachLineConverted = 0;
            }
            else if(valueOfEachLineConverted>500000)
            {
                taxCalculated *= SIXTH_TAX_RATE;
                totalTaxCalculated += taxCalculated;
                totalIncomeProcessed += valueOfEachLineConverted;
                //valueOfEachLineConverted = 0;
            }
            else
            {
                numberOfInvalidProcessed++;
            }
        }
        System.out.println("Number of records processed: " + numberOfNumbersProcessed);
        System.out.println("Number of invalid records: " + numberOfInvalidProcessed);
        System.out.printf("\nTotal income processed %.2f",totalIncomeProcessed);
        System.out.printf("\nTotal tax calculated %.2f",totalTaxCalculated);
    }
}