using System.Collections.Generic;
using System.Numerics;

namespace PerimeterOfSquaresInARectangle
{
    public static class SumFct
    {
        public static BigInteger perimeter(BigInteger n)
        {
            var fibSequence = new List<BigInteger> {1, 1};
            n += 1;
            BigInteger i = 2;
            while (i < n)
            {
                var n1 = (int) i - 1;
                var n2 = (int) i - 2;
                fibSequence.Add(fibSequence[n1] + fibSequence[n2]);
                i++;
            }
            BigInteger result = 0;
            foreach (var fn in fibSequence)
            {
                result += fn;
            }
            return 4 * result;
        }
    }
}