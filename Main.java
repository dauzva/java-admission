import java.util.Scanner;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int fromYear, toYear;

        fromYear = cin.nextInt();
        toYear = cin.nextInt();
        cin.close();
        
        printBonusDatesBetween(fromYear, toYear);
    }

    public static void printBonusDatesBetween(int fromYear, int toYear)
    {
        LocalDate startDate = LocalDate.of(fromYear,1, 1);
        LocalDate endDate = LocalDate.of(toYear,12, 31);

        for(LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1))
        {
            String dateString = date.toString(); // date to string
            dateString = dateString.replaceAll("-", ""); //remove '-'
            String dateStringReversed = new StringBuilder(dateString).reverse().toString(); //reverse

            if(new String(dateString).equals(dateStringReversed)) //compare
            {
                System.out.println(date);
            }
        }
        
    }
    
}