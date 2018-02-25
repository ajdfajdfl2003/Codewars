using System;

namespace FindTheNextPerfectSquareTest
{
    public class Kata
    {
        public long FindNextSquare(long num)
        {
            if (Math.Round(Math.Sqrt(num)) != Math.Sqrt(num))
            {
                return -1;
            }
            else
            {
                var nextRoot = Math.Sqrt(num) + 1;
                return (long)Math.Pow(nextRoot, 2);
            }
        }
    }
}