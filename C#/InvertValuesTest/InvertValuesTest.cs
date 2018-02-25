using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace InvertValuesTest
{
    [TestClass]
    public class InvertValuesTest
    {
        [TestMethod]
        public void TestInvertValues_0()
        {
            var target = new ArraysInversion();

            var actual = target.InvertValues(new int[] { 0 });

            var expected = new int[] { 0 };
            CollectionAssert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void TestInvertValues_Null_Array()
        {
            var target = new ArraysInversion();

            var actual = target.InvertValues(new int[] { });

            CollectionAssert.AreEqual(new int[] { }, actual);
        }

        [TestMethod]
        public void TestInvertValues_negative1_2_negative3_4_negative5()
        {
            var target = new ArraysInversion();

            var actual = target.InvertValues(new int[] { 1, -2, 3, -4, 5 });

            var expected = new int[] { -1, 2, -3, 4, -5 };
            CollectionAssert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void TestInvertValues_negative_1_to_negative_5()
        {
            //arrange
            var target = new ArraysInversion();

            //act
            var actual = target.InvertValues(new int[] { 1, 2, 3, 4, 5 });

            //assert
            var expected = new int[] { -1, -2, -3, -4, -5 };
            CollectionAssert.AreEqual(expected, actual);
        }
    }
}