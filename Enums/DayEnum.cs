using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace csEnumSample
{
    class DayEnum
    {
        /*
         * Create your list of days like we did before. This time, we are going to
         * add to it by specifying a number to each day, starting with 0 for Sunday.
         */ 
        enum DayOfWeek
        {
            SUNDAY = 0,
            MONDAY = 1,
            TUESDAY = 2,
            WEDNESDAY = 3,
            THURSDAY = 4,
            FRIDAY = 5,
            SATURDAY = 6
        };

        /*
         * Now build out the rest of the class as normal. Create two variables, one
         * to hold the ordinal for the day, one to hold an instance of the enum
         */
        private int dayOrdinal;
        private DayOfWeek day;

        /*
         * These may look odd, but they are simplified get and set methods used in C#
         */ 
        public int DayOrdinal { get => dayOrdinal; set => dayOrdinal = value; }
        private DayOfWeek Day { get => day; set => day = value; }

        //Default constructor
        public DayEnum() { }

        //Constructor designed to take an int, day gets set within
        public DayEnum(int o)
        {
            DayOrdinal = o;
            Day = (DayOfWeek)o;
        }

        /*
         * Overriding the toString method to modify the enum from all uppercase,
         * to the first letter being uppercase and the rest being lower case.
         */ 
        public override string ToString()
        {
            string result = "";
            result = Day.ToString().Substring(0, 1).ToUpper();
            result += Day.ToString().Substring(1).ToLower();
            return result;
        }

    }
}
