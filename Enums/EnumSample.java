package test.classWork;

public class EnumSample {
	public static void main(String[] args){
		/*
		 * Step 2: create a new variable of the Enum type. After the equal sign,
		 * type the name of the enum again, followed by a period, the list of
		 * values should now appear.
		 */
		DayOfWeek day1 = DayOfWeek.FRIDAY;
		/*
		 * When you print out the enum as a string, the whole name will be upper
		 * case. Let's clean that up, back to the DayOfWeek enum file and go to
		 * step 3.
		 */
		System.out.println(day1.toString());
		
		/*
		 * Step 5: Since in the getDayOfWeek method it is possible to get back
		 * a null value, I will show you how to check that. First, if the user provides
		 * an invalid value
		 */
		if(DayOfWeek.getDayOfWeek(8) == null){
			System.out.println("There aren't that many days in a week");
		} else {
			System.out.println(DayOfWeek.getDayOfWeek(8).toString());
		}
//		Now let's check a valid value
		if(DayOfWeek.getDayOfWeek(6) == null){
			System.out.println("There aren't that many days in a week");
		} else {
			System.out.println(DayOfWeek.getDayOfWeek(6).toString());
		}
		/*
		 * Now you just need to create a new enum for Months, have it hold the members
		 * you need, and replicate what we did here. Something to think about: To get
		 * the last day of the month, we were shown one way on Wednesday. Another way
		 * would be to create an extra variable, maybe called maxDays, and just have a
		 * check for February in leap years to add one...
		 */
	}

}
