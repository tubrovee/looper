
import java.util.*;

public class CountInstances {

    public static void main(String[] args)
    {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter low no ");
        Integer low = myScanner.nextInt();

        System.out.println("enter high no ");
        Integer high = myScanner.nextInt();

        Random rn = new Random();
        Integer[] numList = new Integer[50];
        //generate 50 random numbers between 0 and 100
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<50;i++)
        {
            Integer temp=rn.nextInt(high - low + 1) + low;
            numList[i]=(temp);
            sb.append(temp +",");
        }
        System.out.println(sb.toString());
        Instcount(numList);

    }
    private static void Instcount(Integer[] numList)
    {
        Integer matchedCnt=0;

        Integer numcount = numList.length-1;
        for ( int i=0; i<=numcount;i++)
        {
             Integer currNo = numList[i];
            for ( int j=0;j<=numcount;j++)
            {
                Integer matchedNo = numList[j];
                if( currNo.equals(matchedNo))
                {
                    matchedCnt = matchedCnt +1;
                }
            }
            System.out.println("Matched count for " + currNo + " is " + matchedCnt);
            matchedCnt=0;
        }
    }
}
