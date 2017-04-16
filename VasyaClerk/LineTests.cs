using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace VasyaClerk
{
    [TestClass]
    public class LineTests
    {
        [TestMethod]
        public void peoopleInLine_255025100252525100252550100252550100252525100_Return_Yes()
        {
            var target = new Line();
            var peopleInLine = new int[] { 25, 50, 25, 100, 25, 25, 25, 100, 25, 25, 50, 100, 25, 25, 50, 100, 25, 25, 25, 100 };

            var actual = target.Tickets(peopleInLine);
            Assert.AreEqual("YES", actual);
        }

        [TestMethod]
        public void peopleInLine_25_25_50_100_return_No()
        {
            var target = new Line();
            var peopleInLine = new int[] { 25, 25, 50, 100 };

            var actual = target.Tickets(peopleInLine);
            Assert.AreEqual("YES", actual);
        }

        [TestMethod]
        public void peopleInLine_25_100_return_No()
        {
            var target = new Line();
            var peopleInLine = new int[] { 25, 100 };

            var actual = target.Tickets(peopleInLine);
            Assert.AreEqual("NO", actual);
        }

        [TestMethod]
        public void peopleInLine_25_25_50_50_return_Yes()
        {
            var target = new Line();
            var peopleInLine = new int[] { 25, 25, 50, 50 };

            var actual = target.Tickets(peopleInLine);
            Assert.AreEqual("YES", actual);
        }
    }
}