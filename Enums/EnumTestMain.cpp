#include <iostream>
#include "Months.h"
#include "DayOfWeek.h"
#include <string>

using namespace std;

string getMonth(Months);
string getDayOfWeek(DayOfWeek);

void main() {
	/*for (int i = 1; i < 13; i++) {
		cout << getMonth(Months(i)) << endl;
	}
	for (int i = 0; i < 7; i++) {
		cout << getDayOfWeek(DayOfWeek(i)) << endl;
	}*/

	int sampleJulian = 1643282;

	int test[] = { 18, 1 };
	cout << getDayOfWeek(DayOfWeek(sampleJulian%7)) << " " << getMonth(Months(test[1])) << " " << test[0] << endl;
	system("pause");
}

string getDayOfWeek(DayOfWeek d) {
	switch (d) {
	case DayOfWeek::SUNDAY: return "Sunday";
	case DayOfWeek::MONDAY: return "Monday";
	case DayOfWeek::TUESDAY: return "Tuesday";
	case DayOfWeek::WEDNESDAY: return "Wednesday";
	case DayOfWeek::THURSDAY: return "Thursday";
	case DayOfWeek::FRIDAY: return "Friday";
	case DayOfWeek::SATURDAY: return "Saturday";
	}
}

string getMonth(Months m) {
	switch (m) {
	case Months::JANUARY:
		return "January";
	case Months::FEBRUARY:
		return "February";
	case Months::MARCH:
		return "March";
	case Months::APRIL:
		return "April";
	case Months::MAY:
		return "May";
	case Months::JUNE:
		return "June";
	case Months::JULY:
		return "July";
	case Months::AUGUST:
		return "August";
	case Months::SEPTEMBER:
		return "September";
	case Months::OCTOBER:
		return "October";
	case Months::NOVEMBER:
		return "November";
	case Months::DECEMBER:
		return "December";
	}
}