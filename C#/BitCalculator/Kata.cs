using System;
using System.Linq;

namespace BitCalculator
{
    public class Kata
    {
        public int Calculate(string num1, string num2)
        {
            var charsOfNum1 = num1.Reverse().ToArray();
            var result = charsOfNum1.Select((t, i) => (t - '0') * (int) Math.Round(Math.Pow(2, i))).Sum();

            var charsOfNum2 = num2.Reverse().ToArray();
            result += charsOfNum2.Select((t, i) => (t - '0') * (int) Math.Round(Math.Pow(2, i))).Sum();

            return result;
        }
    }
}