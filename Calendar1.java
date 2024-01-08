public class Calendar1 
{	
    
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31;
	
	
	
	
	

	public static void main(String args[]) 
	{
		int debugDaysCounter = 0; 
		int counter=0;
		while (year<=1999) 
		{
			if (dayOfWeek==1 && dayOfMonth==1)
			{
				System.out.println(dayOfMonth + "/" + month + "/" + year+"   sunday");
				debugDaysCounter++;
			}
			else System.out.println(dayOfMonth + "/" + month + "/" + year);
			advance();
		}
		System.out.println("During the 20th century, "+debugDaysCounter+ " Sundays fell on the first day of the month");
	}

	 private static void advance() 
	{
			if(dayOfMonth<nDaysInMonth)
			{
				dayOfMonth++;
			}
			else 
			{
				dayOfMonth=1;
				month++;
				nDaysInMonth=nDaysInMonth(month, year);
			}
			if (month>12)
			{
				month=1;
				year++;
			}
			if (dayOfWeek>6)
			{
				dayOfWeek=1;
			}
			else dayOfWeek++;

	}
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) 
	{
	    if (year%4==0)
		{
			if (year%100==0)
			{
				if (year%400==0)
				{
					return true;
				}
				else return false;
			}
			else return true;
		}
		else return false;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) 
	{
		if (month==2)
		{
			if (isLeapYear(year)) 
			{
				return 29;
			}
			else return 28;
		}
		else if (month==4||month==6||month==9||month==11)
		{
			return 30;
		}
		else return 31;
		
	}
}

