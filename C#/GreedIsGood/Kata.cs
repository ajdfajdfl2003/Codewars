using System.Linq;

namespace GreedIsGood
{
    public class Kata
    {
        public int Score(int[] dice)
        {
            var tripleValue = new int[] { 0, 1000, 200, 300, 400, 500, 600 };
            var singleValue = new int[] { 0, 100, 0, 0, 0, 50, 0 };

            var score = 0;
            for (var dieSide = 1; dieSide <= 6; dieSide++)
            {
                var countRolls = dice.Where(outCome => outCome.Equals(dieSide)).Count();
                score += tripleValue[dieSide] * (countRolls / 3) + singleValue[dieSide] * (countRolls % 3);
            }
            return score;
        }
    }
}