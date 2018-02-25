using System.Linq;
using static System.Int32;

namespace DescendingOrder
{
    public class Kata
    {
        public Kata()
        {
        }

        public int DescendingOrder(int num)
        {
            var result = Parse(num.ToString().ToCharArray().OrderByDescending(x => x).Select(x => x.ToString()).Aggregate((prev, next) => prev + next));
            return result;
        }
    }
}