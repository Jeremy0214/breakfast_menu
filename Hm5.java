//5. 請實作一程式，由鍵盤輸入一整數，
//若小於0，則會丟出IntegerLessThanZeroException，並印出“數字小於0之異常”
//若大於0，則會丟出IntegerGreaterThanZeroException，並印出“數字大於0之異常”
//若=0，則會丟出IntegerEqualZeroException，並印出“數字等於0之異常”
import java.util.Scanner;
public class Hm5 {
    public static void main(String[]args) throws IntegerLessThanZeroException, IntegerGreaterThanZeroException,IntegerEqualZeroException
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num<0)
            throw new IntegerLessThanZeroException("數字小於0之異常");
        else if (num>0)
            throw new IntegerGreaterThanZeroException("數字大於0之異常");
        else
            throw new IntegerEqualZeroException("數字等於0之異常");

    }
    public static class IntegerLessThanZeroException extends Exception
    {
        public  IntegerLessThanZeroException(String message)
        {
            super(message);
        }
    }
    public static class IntegerGreaterThanZeroException extends Exception
    {
        public  IntegerGreaterThanZeroException(String message)
        {
            super(message);
        }
    }
    public static class IntegerEqualZeroException extends Exception
    {
        public  IntegerEqualZeroException(String message)
        {
            super(message);
        }
    }
}
