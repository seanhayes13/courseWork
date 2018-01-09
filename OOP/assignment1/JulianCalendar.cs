using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace JulianCalendar
{
    class Program
    {
        static void Main(string[] args)
        {
            JulianConverter jc = new JulianConverter();
            int y = 2018;
            int m = 1;
            int d = 5;
            int j = jc.dateToJulian(m, d, y);
            Console.WriteLine(j);

            int[] newDate = jc.julianToDate(j);
            String bcad = "AD";
            if (newDate[2] < 0)
            {
                bcad = "BC";
                newDate[2] = newDate[2] * (-1);
            }
            Console.WriteLine(newDate[0] + " - " + newDate[1] + " - " + newDate[2] + " " + bcad);
        }
    }
}
