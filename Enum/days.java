enum Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
};

public class days {
    public static void main(String[] args)
    {
        Day day = Day.SUNDAY;

        switch(day)
        {
            case MONDAY:
                System.out.println("Weekday");
                break;
            
            case SUNDAY:
                System.out.println("Weekend");
                break;
        }
    }    
}
