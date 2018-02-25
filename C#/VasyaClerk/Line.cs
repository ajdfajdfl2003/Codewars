using System.Collections.Generic;
using System.Linq;

namespace VasyaClerk
{
    public class Line
    {
        public string Tickets(int[] peopleInLine)
        {
            var giveChanges = peopleInLine.Select(money => money - 25).ToList();
            var inComeOrderByDescending = peopleInLine.OrderByDescending(x => x).ToList();
            giveChanges.RemoveAll(x => x.Equals(0));
            for (var i = 0; i < giveChanges.Count; i++)
            {
                var j = 0;
                var round = 0;
                do
                {
                    if (j == inComeOrderByDescending.Count)
                    {
                        j = 0;
                        round++;
                        if (round == 2)
                        {
                            break;
                        }
                    }
                    if (inComeOrderByDescending[j] != 0 && giveChanges[i] % inComeOrderByDescending[j] == 0)
                    {
                        giveChanges[i] -= inComeOrderByDescending[j];
                        inComeOrderByDescending[j] -= inComeOrderByDescending[j];
                        j = 0;
                    }
                    j++;
                } while (giveChanges[i] > 0);
                inComeOrderByDescending.RemoveAll(x => x.Equals(0));
            }
            return giveChanges.Count(x => x > 0) > 0 ? "NO" : "YES";
        }
    }
}