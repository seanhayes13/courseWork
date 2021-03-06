// ICT4315JulianCalendarCalculator.cpp : Defines the entry point for the console application.
//

#include "JulianCalculator.h"
#include <iostream>

using namespace std;

void main()
{
	JulianCalculator jc = JulianCalculator();
	int test = jc.toJulian(3, 1, 2018);
	cout << test << endl;

	int* newDate = jc.fromJulian(test);
	cout << newDate[0] << " " << newDate[1] << " " << newDate[2] << endl;

	if (jc.toJulian(5, 1, 50) == 1739327) {
		cout << "Success" << endl;
	}
	else {
		cout << "Fail: got - " << jc.toJulian(5, 1, 50) << endl;
	}
	system("pause");
}

