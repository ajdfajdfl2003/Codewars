using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace DescendingOrder
{
    [TestClass]
    public class DescendingOrderTest
    {
        [TestMethod]
        public void TestDescendingOrder_Input_145263_Output_654321()
        {
            var target = new Kata();

            var num = 145263;
            var actual = target.DescendingOrder(num);

            var expected = 654321;
            Assert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void TestDescendingOrder_Input_21445_Output_54421()
        {
            var target = new Kata();

            var num = 21445;
            var actual = target.DescendingOrder(num);

            var expected = 54421;
            Assert.AreEqual(expected, actual);
        }
    }
}