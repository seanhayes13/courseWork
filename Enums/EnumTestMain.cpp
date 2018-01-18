#include <iostream>
#include "Months.h"
#include <string>

using namespace std;

string getMonth(Months);

void main() {
	for (int i = 1; i < 13; i++) {
		cout << getMonth(Months(i)) << endl;
	}
	system("pause");
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
