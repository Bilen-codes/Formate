/*            Pseudo code
* 1, Loop through the input and store the character of the string
* 2, Read and the character at 0 and 1 index for the month.
* 3, Concatenate the two character to be one string
* 4, Convert them to being a string and save it into a variable.
* 5, Do the same for month and year.
* 6, display the final output.
* */

/*converts mm/dd/yyyy date format to  full date format.*/
import java.util.Scanner;
public class Formate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String date1 = "";
        String date2 = "";
        String date = "";
        String m1 = "";
        String m2 = "";
        String month = "";
        int mNum = 0;
        String year1 = "";
        String year2 = "";
        String year3 = "";
        String year4 = "";
        String year = "";
        int yNum = 0;

        System.out.println("Enter a date (mm/dd/yyyy)");
        String wd = sc.nextLine();
        char c = ' ';

        //date
        //convert the string character into character and put into array
        Character[] arr = new Character[wd.length()];
        for (i = 0; i < wd.length(); i++) {
            c = wd.charAt(i);
            arr[i] = c;
        }

        date1 = arr[0].toString();
        date2 = arr[1].toString();
        System.out.println(date1);
        if (date1.equals("0")) {
            date = date2;
        } else {
            date = date1 + date2;
        }
        System.out.println("the date " + date);

        //reading the month
        m1 = arr[3].toString();
        m2 = arr[4].toString();

        if (m1.equals("0")) {
            month = m2;
        } else {
            month = m1 + m2;
        }
        System.out.println("the month" + month);
        mNum = Integer.parseInt(month);

        //exit out if month is wrong
        if (mNum > 12){
            System.out.println("Sorry wrong month");
            System.exit(0);
        }
        switch (mNum) {
            case 1:
                month = "January";
                break;
            case 2:
                month = " February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = " August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = " October";
                break;
            case 11:
                month = " November";
                break;
            case 12:
                month = "December";
                break;
            default:
                System.out.println("Invalid number");
        }

        // read the year
        year1 = arr[6].toString();
        year2 = arr[7].toString();
        year3 = arr[8].toString();
        year4 = arr[9].toString();
        year = year1+year2+year3+year4;
                 System.out.println("The date is: ");
                 System.out.printf("%s %s, %s", month, date, year);
    }

}