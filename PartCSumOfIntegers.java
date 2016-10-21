public class PartCSumOfIntegers
{
    public static void main(String[] args)
    {
        int number = 1;
        int newNumber = 0;
        int i = 0;
        
        while (i<=10)
        {
            for(int x=1;x<=10;x++)
            {
                newNumber += number;
                number += newNumber;
                System.out.printf("%d    ",newNumber);
            }
            i++;
        }
    }
}