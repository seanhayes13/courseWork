package test.classWork;

public enum DayOfWeek {
	/*
	 * Step 1: create the list of values. These all need to be upper case to work.
	 * Go to EnumSample for next step.
	 */
//	SUNDAY,
//	MONDAY,
//	TUESDAY,
//	WEDNESDAY,
//	THURSDAY,
//	FRIDAY,
//	SATURDAY;
	
	/*
	 * Step 3: In Java, enums can have several member variables and methods. To do
	 * this, you need to provide a constructor, and include those extra members when
	 * we declare the list of possible values. Let's add in a friendly string version
	 * of the day (only the first letter is capitalized) and a numerical value for the
	 * day.
	 */
	SUNDAY("Sunday",0),
	MONDAY("Monday",1),
	TUESDAY("Tuesday",2),
	WEDNESDAY("Wednesday",3),
	THURSDAY("Thursday",4),
	FRIDAY("Friday",5),
	SATURDAY("Saturday",6);
	
//	Add two variables to hold those two values
	private String dayName;
	private int ordinal;
//	Now for the constructor
	DayOfWeek(String d, int o){
		dayName = d;
		ordinal = o;
	}
	/*
	 * In order to access the new dayName, we need to override the toString method to
	 * return dayName
	 */
	@Override
	public String toString(){
		return dayName;
	}
	/*
	 * After making these changes, when you run the program, instead of seeing the day in
	 * all upper case, you should now see that the new version is appearing.
	 * 
	 * Step 4: Part of the assignment is to get a day of the week by taking the modulus of
	 * the Julian Number and 7 to get a number between 0 and 6. How does that translate here?
	 * I'll show you. Notice that when we assigned the ordinal we only used 0-6? There is a
	 * lot going on with this method so I will break it down
	 */
	// Start by declaring a method that returns a DayOfWeek variable and takes an int as a 
	// parameter
	public static DayOfWeek getDayOfWeek(int o){
		/*
		 * Now create a DayOfWeek variable to return when we are done. Two options here:
		 * 	1. Use null and have a way to check for a null variable. I'm going with this one
		 * 	2. Use a default like SUNDAY in case something outside the range is passed in,
		 * 		like 42 
		 */
		DayOfWeek result = null;
		/*
		 * Now we are going to use an enhanced for loop to go over all of the values within
		 * the DayOfWeek enum and check if the ordinal matches the parameter. If it matches,
		 * we update result to be the new DayOfWeek value.
		 */
		for(DayOfWeek d : DayOfWeek.values()){
			if(d.ordinal == o){
				result = d;
			}
		}
		/*
		 * Finally, we return the value we found.
		 */
		return result;
	}
//	Now let's go to EnumSample for step 5

}
