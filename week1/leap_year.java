public class leap_year 
{
    public static void main(String[] args)
    {
        int year = Integer.parseInt(args[0]);
        boolean is_leap_year;
        
        // divisible by 4 but not 100
        is_leap_year = (year % 4 == 0) && (year % 100 != 0);

        // divisible by 400
        is_leap_year = is_leap_year || (year % 400 == 0);

        // print them out
        System.out.println(is_leap_year);
    }
}
