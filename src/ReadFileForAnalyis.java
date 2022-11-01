import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFileForAnalyis {
    public static void  main(String[] args)
    {
        //file path is /Users/vishalgupta/qcdatafiles/votedata.txt

        Scanner myScanner = new Scanner(System.in);
        System.out.println("please input path and filename");
        String fullFileName = myScanner.next();
        //Read and display the file
        try {
            //read file and display data
            readDatafromFile(fullFileName);
            System.out.println("==========================================================");

            //compute each candidates total and pct of all candidates total
            System.out.println("==========================================================");
            candidatesTotalandPct(fullFileName);
            System.out.println("==========================================================");

            //Alternate
            System.out.println("==========================================================");
            AlternatecandidatesTotalandPct(fullFileName);
            System.out.println("==========================================================");

        }
        catch (FileNotFoundException ex)
        {
            System.out.println("File not found at " + fullFileName);
        }
    }
    private static void readDatafromFile(String filePath) throws FileNotFoundException
    {
        System.out.println("File name with path is " +  filePath);
        //read the file
        File textFile = new File(filePath);
        Scanner in = new Scanner(textFile);
        String rowString = in.nextLine();
        System.out.println(rowString);

        while(in.hasNextLine())
        {
            String line = in.nextLine();
            System.out.println( line);

        }
        in.close();
        System.out.println("completed reading the file");

    }

    private static void candidatesTotalandPct(String  filePath) throws FileNotFoundException
    {
        System.out.println("File name with pathX is " +  filePath);
        Integer[][] votes= {
                                {1,192,48,206,37},
                                {2,147,90,312,21},
                                {3,186,12,121,38},
                                {4,114,21,408,39},
                                {5,267,13,382,29}
                            };
        Integer counter=0;
        Integer candidate1=0;
        Integer candidate2=0;
        Integer candidate3=0;
        Integer candidate4=0;

        int rows = votes.length-1;
        int cols = votes[0].length-1;

        Integer totalVotes=0;
        for(int i=0; i<= rows; i++)
        {
            candidate1= candidate1 + votes[i][1];
            candidate2=candidate2+ votes[i][2];
            candidate3=candidate3+ votes[i][3];
            candidate4=candidate4+ votes[i][4];

        }
        totalVotes = candidate1 + candidate2 + candidate3 + candidate4;
        System.out.println("Total Votes are " + totalVotes);

        Integer candidate1pct = candidate1*100/totalVotes;
        Integer candidate2pct = candidate2*100/totalVotes;
        Integer candidate3pct = candidate3*100/totalVotes;
        Integer candidate4pct = candidate4*100/totalVotes;

        System.out.println("total votes for Candidate 1 is " + candidate1
                                + " pct is " + ((candidate1*100/totalVotes)));

        System.out.println("total votes for Candidate 2 is " + candidate2
                + " pct is " + ((candidate2*100/totalVotes)));

        System.out.println("total votes for Candidate 3 is " + candidate3
                + " pct is " + ((candidate3*100/totalVotes)));

        System.out.println("total votes for Candidate 4 is " + candidate4
                + " pct is " + ((candidate4*100/totalVotes)));

        if(candidate1pct>50)
        {
            System.out.println("The winner is Candidate1!!!");
        }
        else if(candidate2pct > 50)
        {
            System.out.println("The winner is Candidate 2 !!!");
        }
        else if(candidate3pct > 50)
        {
            System.out.println("The winner is Candidate 3 !!!");
        } else if(candidate4pct > 50)
        {
            System.out.println("The winner is Candidate2!!!");
        }
        else
        {
            System.out.println("No winners");
        }

    }
    private static void AlternatecandidatesTotalandPct(String  filePath) throws FileNotFoundException
    {
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("ALTERNATE VOTE COUNTS " +  filePath);
        System.out.println("\n");


        Integer[][] votes= {
                {1,192,48,206,37},
                {2,147,90,312,21},
                {3,186,12,121,38},
                {4,114,21,108,39},
                {5,267,13,382,29}
        };
        Integer counter=0;
        Integer candidate1=0;
        Integer candidate2=0;
        Integer candidate3=0;
        Integer candidate4=0;

        int rows = votes.length-1;
        int cols = votes[0].length-1;

        Integer totalVotes=0;
        for(int i=0; i<= rows; i++)
        {
            candidate1= candidate1 + votes[i][1];
            candidate2=candidate2+ votes[i][2];
            candidate3=candidate3+ votes[i][3];
            candidate4=candidate4+ votes[i][4];

        }
        totalVotes = candidate1 + candidate2 + candidate3 + candidate4;
        System.out.println("Total Votes are " + totalVotes);

        Integer candidate1pct = candidate1*100/totalVotes;
        Integer candidate2pct = candidate2*100/totalVotes;
        Integer candidate3pct = candidate3*100/totalVotes;
        Integer candidate4pct = candidate4*100/totalVotes;

        System.out.println("total votes for Candidate 1 is " + candidate1
                + " pct is " + ((candidate1*100/totalVotes)));

        System.out.println("total votes for Candidate 2 is " + candidate2
                + " pct is " + ((candidate2*100/totalVotes)));

        System.out.println("total votes for Candidate 3 is " + candidate3
                + " pct is " + ((candidate3*100/totalVotes)));

        System.out.println("total votes for Candidate 4 is " + candidate4
                + " pct is " + ((candidate4*100/totalVotes)));

        if(candidate1pct>50)
        {
            System.out.println("The winner is Candidate1!!!");
        }
        else if(candidate2pct > 50)
        {
            System.out.println("The winner is Candidate 2 !!!");
        }
        else if(candidate3pct > 50)
        {
            System.out.println("The winner is Candidate 3 !!!");
        } else if(candidate4pct > 50)
        {
            System.out.println("The winner is Candidate2!!!");
        }
        else
        {
            System.out.println("No winners");
        }

    }
}
