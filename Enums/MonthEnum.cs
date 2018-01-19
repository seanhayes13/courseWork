using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace csEnumSample
{
    class MonthEnum
    {
        enum Months{
            JANUARY = 1,
            FEBRUARY = 2,
            MARCH = 3,
            APRIL = 4,
            MAY = 5,
            JUNE = 6,
            JULY = 7,
            AUGUST = 8,
            SEPTEMBER = 9,
            OCTOBER = 10,
            NOVEMBER = 11,
            DECEMBER = 12
        };
        private int monthOrdinal;
        private Months month;

        public int MonthOrdinal { get => monthOrdinal; set => monthOrdinal = value; }
        private Months Month { get => month; set => month = value; }

        public MonthEnum() { }

        public MonthEnum(int o)
        {
            MonthOrdinal = o;
            Month = (Months)o;
        }

        /*
         * Overriding the toString method to modify the enum from all uppercase,
         * to the first letter being uppercase and the rest being lower case.
         */
        public override string ToString()
        {
            string result = "";
            result = Month.ToString().Substring(0, 1).ToUpper();
            result += Month.ToString().Substring(1).ToLower();
            return result;
        }
    }
}
