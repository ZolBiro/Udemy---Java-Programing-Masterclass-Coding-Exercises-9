public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays (long  minutes){
        if (minutes <0) {
            System.out.println("Invalid Value");
        }else {

            long day = minutes / (60*24);
            long year = day / 365;
            long rday = day % 365;
            System.out.println(minutes + " min = " + year + " y and " + rday + " d");
        }
    }
}
