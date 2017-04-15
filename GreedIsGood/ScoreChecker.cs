using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace GreedIsGood
{
    [TestClass]
    public class ScoreChecker
    {
        [TestMethod]
        public void ShouldValueMixedSets()
        {
            var target = new Kata();
            var throwDice = new int[] { 2, 4, 4, 5, 4 };

            var actual = target.Score(throwDice);

            var expected = 450;
            Assert.AreEqual(expected, actual, "Should be 450");
        }

        [TestMethod]
        public void Dice_11131_ShouldBe1100()
        {
            var target = new Kata();
            var throwDice = new int[] { 1, 1, 1, 3, 1 };

            var actual = target.Score(throwDice);

            var expected = 1100;
            Assert.AreEqual(expected, actual, "Should be 1100");
        }

        [TestMethod]
        public void Dice_51115511111_ShouldBe2700()
        {
            var target = new Kata();
            var throwDice = new int[] { 5, 1, 1, 1, 5, 5, 1, 1, 1, 1, 1 };

            var actual = target.Score(throwDice);

            var expected = 2700;
            Assert.AreEqual(expected, actual, "Should be 2700");
        }

        [TestMethod]
        public void ShouldBeWorthless()
        {
            var target = new Kata();
            var throwDice = new int[] { 2, 3, 4, 6, 2 };

            var actual = target.Score(throwDice);

            var expected = 0;
            Assert.AreEqual(expected, actual, "Should be 0 :-(");
        }

        [TestMethod]
        public void ShouldValueTriplets()
        {
            var target = new Kata();
            var throwDice = new int[] { 4, 4, 4, 3, 3 };

            var actual = target.Score(throwDice);

            var expected = 400;
            Assert.AreEqual(expected, actual, "Should be 400");
        }
    }
}