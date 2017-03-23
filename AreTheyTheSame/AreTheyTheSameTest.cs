using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace AreTheyTheSame
{
    [TestClass]
    public class AreTheyTheSameTest
    {
        [TestMethod]
        public void Input_a_cannot_be_NULL()
        {
            //arrange
            var target = new AreTheySame();
            int[] a = null;
            var b = new int[] { 11 * 11, 121 * 121, 144 * 144, 19 * 19, 161 * 161, 19 * 19, 144 * 144, 19 * 19 };

            //act
            var actual = target.comp(a, b);

            //assert
            Assert.IsFalse(actual);
        }

        [TestMethod]
        public void Input_b_cannot_be_NULL()
        {
            //arrange
            var target = new AreTheySame();
            var a = new int[] { 121, 144, 19, 161, 19, 144, 19, 11 };
            int[] b = null;

            //act
            var actual = target.comp(a, b);

            //assert
            Assert.IsFalse(actual);
        }

        [TestMethod]
        public void Input_a_And_b_ShouldNotbeTheSame()
        {
            var target = new AreTheySame();
            var a = new int[] { 121, 144, 19, 161, 19, 144, 19, 11 };
            var b = new int[] { 12 * 12, 121 * 121, 144 * 144, 19 * 19, 161 * 161, 19 * 19, 144 * 144, 19 * 19 };

            //act
            var actual = target.comp(a, b);

            //assert
            Assert.IsFalse(actual);
        }

        [TestMethod]
        public void Input_a_And_b_ShouldbeTheSame()
        {
            var target = new AreTheySame();
            var a = new int[] { 121, 144, 19, 161, 19, 144, 19, 11 };
            var b = new int[] { 11 * 11, 121 * 121, 144 * 144, 19 * 19, 161 * 161, 19 * 19, 144 * 144, 19 * 19 };

            //act
            var actual = target.comp(a, b);

            //assert
            Assert.IsTrue(actual);
        }
    }
}