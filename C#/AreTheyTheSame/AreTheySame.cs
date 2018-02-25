using System;
using System.Linq;

namespace AreTheyTheSame
{
    public class AreTheySame
    {
        public bool comp(int[] a, int[] b)
        {
            if (a == null)
            {
                return false;
            }
            else if (b == null)
            {
                return false;
            }
            else
            {
                var newA = a.Select(element => (int)Math.Pow(element, 2)).ToArray();
                Array.Sort(b);
                Array.Sort(newA);
                return b.SequenceEqual(newA);
            }
        }
    }
}