import java.util.ArrayList;

public class SquareCode {
    public static void main(String[] args)
    {
        System.out.println("Do the sq code");
        create_square_code();
    }
    private static void create_square_code()
    {
        String sentence="Itwasthebestoftimesitwastheworstoftimesitwastheageofwisdomitwastheageoffoolishnes";
        ArrayList<String> myList= new ArrayList<>();

        Integer length = sentence.length()-1;

        for(int i=0; i<= length;i+=9)
        {
            if(i<80) {
                myList.add(sentence.substring(i, i + 9));
            }
        }

       for(int i=0;i<=myList.size()-1;i++)
       {
           System.out.println(myList.get(i));
       }


    }
}
