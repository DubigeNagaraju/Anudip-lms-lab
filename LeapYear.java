class LeapYear
{
    public static void main(String[] args)
    {
        int Year=2004;

        if(Year%4==0)
        {
          if(Year%100==0)
          {
             if(Year%400==0)
             {
                 System.out.println(Year+ " It is a leap year");
             }
             else
             {
                 System.out.println(Year+ " It is not a leap year");
             }
          }
          else
          {
              System.out.println(Year+ " It is a leap year");
          }
        }
        else
        {
            System.out.println(Year+ " It is not a leap year");
        }
    }
}