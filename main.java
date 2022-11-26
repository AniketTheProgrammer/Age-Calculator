import java.util.*;
class main{
    //make function to calculate age
    static void AgeCalculate(int current_date , int current_month , int current_year , int birth_date , int birth_month , int birth_year)
    {
        int[] month =  {31, 28, 31, 30, 31, 30,31, 31, 30, 31, 30, 31 }; //days in month

        if(birth_date > current_date){
            current_date = current_date + month[birth_month-1];
            current_month = current_month - 1;
        }
        if(birth_month > current_month){
            current_year = current_year - 1;
            current_month = current_month + 12;
        }

        int calculated_date = current_date - birth_date;
        int calculated_month = current_month - birth_month;
        int calculated_year = current_year - birth_year;

        System.out.println("Your Age   Year : "+calculated_year+" Month : "+calculated_month+" Day : "+calculated_date);

        System.out.println("Thanks.........");

    }


    public static void main(String arg[]){
        Calendar calendar = Calendar.getInstance();
        int current_date = calendar.get(Calendar.DATE);
        int current_month = calendar.get(Calendar.MONTH) + 1; //month start from 0 so we add 1
        int current_year = calendar.get(Calendar.YEAR);
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\tWelcome to age calculator");
        System.out.println("Enter your birth date");
        int birth_date = sc.nextInt();
        System.out.println("Enter your birth month");
        int birth_month = sc.nextInt();
        System.out.println("Enter your birth year");
        int birth_year = sc.nextInt();

        //calling function
        AgeCalculate(current_date , current_month , current_year , birth_date , birth_month , birth_year);


    }
}