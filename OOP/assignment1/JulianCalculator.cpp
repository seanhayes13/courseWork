#include "JulianCalculator.h"

using namespace std;

int* JulianCalculator::fromJulian(int julian) {
	int result[3];
	int i = julian + 68569;
	int n = (4 * i) / 146097;
	i = i - (146097 * n + 3) / 4;
	int j = (4000 * (i + 1)) / 1461001;
	i = i - (1461 * j) / 4 + 31;
	int k = (80 * i) / 2447;
	int day = i - (2447 * k) / 80;
	i = k / 11;
	int month = k + 2 - (12 * i);
	int year = 100 * (n - 49) + j + i;
	result[0] = day;
	result[1] = month;
	result[2] = year;
	return result;
}

int JulianCalculator::toJulian(int day, int month, int year) {
	int result = (1461 * (year + 4800 + (month - 14) / 12) /
		4 + (367 * (month - 2 - 12 * ((month - 14) / 12))) / 12 -
		(3 * ((year + 4900 + (month - 14) / 12) / 100)) / 4 +
		day - 32075);
	return result;
}