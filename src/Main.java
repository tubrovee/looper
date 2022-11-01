import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int inputNumber=0;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number between 0-100");

        //loop until right number is entered
        while(true)
        {
            inputNumber = myObj.nextInt();
            if(inputNumber>=0 && inputNumber <=100) {
                System.out.println("Dude you entered ->" + inputNumber);
                break; //right input received. exit loop now
            }
            else {
                //keep doing it. no escape for fools who cant read the
                //instructions
                System.out.println("Try again ");
            }
        }
    }

    /*

     */
    public static void Anya() {
        int[][] myNumbers =
                     {{34, 21, 32, 41, 25},
                        {14, 42, 43, 14, 31},
                        {54, 45, 52, 42, 23},
                        {33, 15, 51, 31, 35},
                        {21, 52, 33, 13, 23}};

        int numInCurrentCell = myNumbers[0][0];
        System.out.println(myNumbers[0][0]);

        int row = myNumbers[0][0] / 10;
        int column = (numInCurrentCell) % 10;
        System.out.println("Row->" + row + " Column " + column);

        while (true ) {
            if(numInCurrentCell != myNumbers[row][column])
            {
                numInCurrentCell = myNumbers[row-1][column-1];
                System.out.println("No. in current cell " + numInCurrentCell);

                row = numInCurrentCell/10;System.out.println(row);
                column = numInCurrentCell%10;System.out.println(column);
                numInCurrentCell = myNumbers[row-1][column-1];
                row=row-1;
                column=column-1;
                System.out.println("No. in current cell " + numInCurrentCell);

            }
            else
            {
                System.out.println("nu");
                break;
            }
        }
    }

    public static void traverseArray()
    {
        Integer[][] map=  {
                {34, 21, 32, 41, 25},
                {14, 42, 43, 14, 31},
                {54, 45, 52, 42, 23},
                {33, 15, 51, 31, 35},
                {21, 52, 33, 13, 23}
        };

        //since the solution will be found in one of the cells
        //lets cap the loop by array size;

        int size = map.length * map[0].length;

        //find the value in the first row.col and
        //and split the value to find the next row/col
        //this is our start
        Integer row=map[0][0]/10;
        Integer col = map[0][0]%10;

        //above is the row column where we need to get the value based
        //on the number we read from the 2D array.

        for (int i=0; i<=size; i++)
        {
            //lets go the row and column that we read from the first spot
            String ValueAtLocationIs = map[row-1][col-1].toString();
            String arrayLocationIS = row.toString()+col.toString() ;
            System.out.println(ValueAtLocationIs
                        + " is the value at coordinates->map[" + row +"][" +  col + "]");
            if(ValueAtLocationIs.toString().equals(arrayLocationIS))
            {
                System.out.println("solution found in " + i + " tries" );

                break;
            }
            else
            {
                row=Integer.parseInt(ValueAtLocationIs.substring(0,1));
                col=Integer.parseInt(ValueAtLocationIs.substring(1));

            }
        }

    }
    public static void saddle_point()
    {
            Integer[][] map=  {
                    {34, 21, 32, 41, 25},
                    {14, 42, 43, 14, 31},
                    {54, 45, 52, 42, 23},
                    {33, 15, 51, 31, 35 },
                    {21, 52, 33, 13, 23 }
            };

            //since the solution will be found in one of the cells
            //lets cap the loop by array size;

            Integer rows = map.length ;
            Integer cols = map[0].length;

            System.out.println("I am rows "+rows);
            System.out.println("I am cols "+cols);
            //reprint the array
            Integer[] testArray={0,0,0,0,0};
            for (int i=0; i <=rows-1; i++)
            {
                //test cols
                for(int j=0; j<= cols-1; j++) {
                    testArray[j] = map[i][j];
                }
                //isSaddle(testArray,"g" );

            }
    }


}
