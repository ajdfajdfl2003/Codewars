using System.Collections.Generic;
using System.Linq;

namespace SortAnArrayByValueAndIndex
{
    public class Kata
    {
        public int[] SortByValueAndIndex(int[] array)
        {
            var i = 1;
            return array.OrderBy(x => x * i++).ToArray();
        }
    }
}