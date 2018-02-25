using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace CalculateStringRotation
{
    [TestClass]
    public class CalculateStringRotationTests
    {
        [TestMethod]
        public void ShiftedDiff_twoEmpty_To_oneEmpty_Return_nil()
        {
            var target = new CalculateStringRotation();
            var first = "  ";
            var second = " ";

            var actual = target.ShiftedDiff(first, second);

            Assert.AreEqual(-1, actual);
        }

        [TestMethod]
        public void ShiftedDiff_hoop_To_pooh_Return_nil()
        {
            var target = new CalculateStringRotation();
            var first = "";
            var second = "";

            var actual = target.ShiftedDiff(first, second);

            Assert.AreEqual(-1, actual);
        }

        [TestMethod]
        public void ShiftedDiff_empty_To_empty_Return_0()
        {
            var target = new CalculateStringRotation();
            var first = " ";
            var second = " ";

            var actual = target.ShiftedDiff(first, second);

            Assert.AreEqual(0, actual);
        }

        [TestMethod]
        public void ShiftedDiff_isnt_To_tisn_Return_2()
        {
            var target = new CalculateStringRotation();
            var first = "isn't";
            var second = "'tisn";

            var actual = target.ShiftedDiff(first, second);

            Assert.AreEqual(2, actual);
        }

        [TestMethod]
        public void ShiftedDiff_Moose_To_moose_Return_nil()
        {
            var target = new CalculateStringRotation();
            var first = "Moose";
            var second = "moose";

            var actual = target.ShiftedDiff(first, second);

            Assert.AreEqual(-1, actual);
        }

        [TestMethod]
        public void ShiftedDiff_Esham_To_Esham_Return_0()
        {
            var target = new CalculateStringRotation();
            var first = "Esham";
            var second = "Esham";

            var actual = target.ShiftedDiff(first, second);

            Assert.AreEqual(0, actual);
        }

        [TestMethod]
        public void ShiftedDiff_eecoff_To_coffee_Return_4()
        {
            var target = new CalculateStringRotation();
            var first = "eecoff";
            var second = "coffee";

            var actual = target.ShiftedDiff(first, second);

            Assert.AreEqual(4, actual);
        }
    }
}