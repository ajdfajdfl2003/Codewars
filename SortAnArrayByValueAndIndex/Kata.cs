using System.Collections.Generic;
using System.Linq;

namespace SortAnArrayByValueAndIndex
{
    public class Kata
    {
        public Kata()
        {
        }

        public int[] SortByValueAndIndex(int[] array)
        {
            var result = new List<Weights>();
            for (var i = 0; i < array.Length; i++)
            {
                var weight = new Weights() {original = array[i], weightOfSum = array[i] * (i + 1)};
                result.Add(weight);
            }
            return result.OrderBy(x => x.weightOfSum).Select(x => x.original).ToArray();
        }
    }

    public class Weights
    {
        public int original { get; set; }
        public int weightOfSum { get; set; }
    }
}