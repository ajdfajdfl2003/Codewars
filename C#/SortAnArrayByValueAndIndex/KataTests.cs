using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace SortAnArrayByValueAndIndex
{
    [TestClass]
    public class KataTests
    {
        [TestMethod]
        public void SortByValueAndIndexTest_Input_5_2_4_3_1_After_Sort_Output_2_5_1_4_3()
        {
            var target = new Kata();
            var array = new int[] {5, 2, 4, 3, 1};

            var actual = target.SortByValueAndIndex(array);

            var expected = new int[] {2, 5, 1, 4, 3};
            var message = "Your result:\n" + ArrayToString(actual) + "\n\nExpected result:\n" + ArrayToString(expected);
            CollectionAssert.AreEqual(expected, actual, message);
        }

        [TestMethod]
        public void SortByValueAndIndexTest_Input_9_5_1_4_3_After_Sort_Output_1_9_5_3_4()
        {
            var target = new Kata();
            var array = new int[] {9, 5, 1, 4, 3};

            var actual = target.SortByValueAndIndex(array);

            var expected = new int[] {1, 9, 5, 3, 4};
            var message = "Your result:\n" + ArrayToString(actual) + "\n\nExpected result:\n" + ArrayToString(expected);
            CollectionAssert.AreEqual(expected, actual, message);
        }

        [TestMethod]
        public void SortByValueAndIndexTest_Input_26_2_3_4_5_After_Sort_Output_2_3_4_5_26()
        {
            var target = new Kata();
            var array = new int[] {26, 2, 3, 4, 5};

            var actual = target.SortByValueAndIndex(array);

            var expected = new int[] {2, 3, 4, 5, 26};
            var message = "Your result:\n" + ArrayToString(actual) + "\n\nExpected result:\n" + ArrayToString(expected);
            CollectionAssert.AreEqual(expected, actual, message);
        }

        [TestMethod]
        public void SortByValueAndIndexTest_Input_23_2_3_4_5_After_Sort_Output_2_3_4_23_5()
        {
            var target = new Kata();
            var array = new int[] {23, 2, 3, 4, 5};

            var actual = target.SortByValueAndIndex(array);

            var expected = new int[] {2, 3, 4, 23, 5};
            var message = "Your result:\n" + ArrayToString(actual) + "\n\nExpected result:\n" + ArrayToString(expected);
            CollectionAssert.AreEqual(expected, actual, message);
        }

        private string ArrayToString(int[] array)
        {
            return string.Join(", ", array);
        }
    }
}