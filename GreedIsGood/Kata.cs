using System.Collections.Generic;
using System.Linq;

namespace GreedIsGood
{
    public class Kata
    {
        private readonly Dictionary<string, int> _scoreTable = new Dictionary<string, int>
            {
                {"111", 1000},
                {"666", 600},
                {"555", 500},
                {"444", 400},
                {"333", 300},
                {"222", 200},
                {"1", 100},
                {"5", 50}
            };

        public int Score(int[] throwDice)
        {
            var orderThrowDice = throwDice.OrderBy(x => x).Select(x => x).ToArray();
            var stringDice = orderThrowDice.Aggregate("", (current, dice) => current + dice);
            var score = 0;
            for (var i = 0; i < stringDice.Length;)
            {
                var countOfDice = stringDice.Count(x => x.Equals(stringDice[i]));
                var dice = "";
                if (countOfDice / 3 > 0)
                {
                    dice = stringDice.Substring(0, 3);
                    stringDice = stringDice.Remove(0, 3);
                }
                else
                {
                    dice = stringDice.Substring(0, 1);
                    stringDice = stringDice.Remove(0, 1);
                }
                if (this._scoreTable.ContainsKey(dice))
                {
                    score += this._scoreTable[dice];
                }
            }
            return score;
        }
    }
}