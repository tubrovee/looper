import java.util.*;

public class Histogram {
    public static void main(String[] args) {

        //generate random number between any 2 numbers
        try {
            genHistogram(generateNumbers());
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    /*
        Method to generate histogram
        Takes Integer[] as argument
     */
    private static void genHistogram(Integer[] valueList) {
        Integer[] histogram = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        TreeMap<String,Integer> MapHistogram = new TreeMap();

        Integer size = valueList.length;


        for (Integer testValue : valueList) {
            //Long if block
            if (testValue >= 0 && testValue <= 10) {
                histogram[0]++;
                MapHistogram.put("1-10  ", histogram[0]);
            } else if (testValue >= 11 && testValue <= 20) {
                histogram[1]++;
                MapHistogram.put("11-20 ", histogram[1]);
            } else if (testValue >= 21 && testValue <= 30) {
                histogram[2]++;
                MapHistogram.put("21-30 ", histogram[2]);
            } else if (testValue >= 31 && testValue <= 40) {
                histogram[3]++;
                MapHistogram.put("31-40 ", histogram[3]);
            } else if (testValue >= 41 && testValue <= 50) {
                histogram[4]++;
                MapHistogram.put("41-50 ", histogram[4]);
            } else if (testValue >= 51 && testValue <= 60) {
                histogram[5]++;
                MapHistogram.put("51-60 ", histogram[5]);
            } else if (testValue >= 61 && testValue <= 70) {
                histogram[6]++;
                MapHistogram.put("61-70 ", histogram[6]);
            } else if (testValue >= 71 && testValue <= 80) {
                histogram[7]++;
                MapHistogram.put("71-80 ", histogram[7]);
            } else if (testValue >= 81 && testValue <= 90) {
                histogram[8]++;
                MapHistogram.put("81-90 ", histogram[8]);
            } else if (testValue >= 91 && testValue <= 100) {
                histogram[9]++;
                MapHistogram.put("91-100", histogram[9]);

                
            }

        }

        System.out.println("============================================");
        for (Object objectName : MapHistogram.keySet()) {

            System.out.println(objectName
                            + " : "
                            + convertToStars(Integer.parseInt( MapHistogram.get(objectName).toString()))
            );
        }
        System.out.println("============================================");
    }

    //Helper method to generate random numbers
    //prompts user for low and high number
    //prompts user for how many random numbers to generate
    private static Integer[] generateNumbers() {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter low no ");
        Integer low = myScanner.nextInt();

        System.out.println("enter high no ");
        Integer high = myScanner.nextInt();

        System.out.println("enter how many numbers ");
        Integer count = myScanner.nextInt();


        Random rn = new Random();
        Integer[] numList = new Integer[count];
        //generate 50 random numbers between 0 and 100
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < count; i++) {
            Integer temp = rn.nextInt(high - low + 1) + low;
            numList[i] = (temp);
            sb.append(temp + ",");
        }
        System.out.println(sb.toString());
        return numList;
    }

    // Utility method to convert int number to star
    // for example 2 will be displayed as **
    //TODO:move to static class of library functions

    private static String convertToStars(int num) {
        StringBuilder builder = new StringBuilder();
        builder.append("*".repeat(Math.max(0, num)));
        return builder.toString();
    }
}
