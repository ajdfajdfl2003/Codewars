using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace BitCalculator
{
    [TestClass]
    public class SolutionTest
    {
        [TestMethod]
        public void CalculateTest_10_Add_1_equal_3()
        {
            var target = new Kata();

            var actual = target.Calculate("10", "1");

            var expected = 3;
            Assert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void CalculateTest_10_Add_0_equal_2()
        {
            var target = new Kata();

            var actual = target.Calculate("10", "0");

            var expected = 2;
            Assert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void CalculateTest_10_Add_10_equal_4()
        {
            var target = new Kata();

            var actual = target.Calculate("10", "10");

            var expected = 4;
            Assert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void CalculateTest_1_Add_1_equal_2()
        {
            var target = new Kata();

            var actual = target.Calculate("1", "1");

            var expected = 2;
            Assert.AreEqual(expected, actual);
        }
    }
}