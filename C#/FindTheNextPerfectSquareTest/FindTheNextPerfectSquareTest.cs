using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace FindTheNextPerfectSquareTest
{
    [TestClass]
    public class FindTheNextPerfectSquareTest
    {
        [TestMethod]
        public void TestFindNextSquare_921227816_Result_negative_1()
        {
            var target = new Kata();

            var num = 921227816;
            var actual = target.FindNextSquare(num);

            var expected = -1;
            Assert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void TestFindNextSquare_155_Result_negative_1()
        {
            var target = new Kata();

            var num = 155;
            var actual = target.FindNextSquare(num);

            var expected = -1;
            Assert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void TestFindNextSquare_15241383936_Result_15241630849()
        {
            var target = new Kata();

            var num = 15241383936;
            var actual = target.FindNextSquare(num);

            var expected = 15241630849;
            Assert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void TestFindNextSquare_319225_Result_320356()
        {
            var target = new Kata();

            var num = 319225;
            var actual = target.FindNextSquare(num);

            var expected = 320356;
            Assert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void TestFindNextSquare_625_Result_676()
        {
            var target = new Kata();

            var num = 625;
            var actual = target.FindNextSquare(num);

            var expected = 676;
            Assert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void TestFindNextSquare_121_Result_144()
        {
            var target = new Kata();

            var num = 121;
            var actual = target.FindNextSquare(num);

            var expected = 144;
            Assert.AreEqual(expected, actual);
        }
    }
}