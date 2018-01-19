using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace csEnumSample
{
    class Program
    {
        static void Main(string[] args)
        {
            DayEnum d = null;
            for (int i = 0; i < 7; i++)
            {
                d = new DayEnum(i);
                Console.WriteLine(d.ToString());
            }

            int sampleJulian = 1643282;

            int[] test = { 18, 1 };

            Console.WriteLine(new DayEnum((sampleJulian % 7)) + " " + new MonthEnum(test[1]) + " " + test[0]);
        }
    }
}
