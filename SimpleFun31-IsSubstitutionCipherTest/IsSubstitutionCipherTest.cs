using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace SimpleFun31_IsSubstitutionCipherTest
{
    [TestClass]
    public class IsSubstitutionCipherTest
    {
        [TestMethod]
        public void string1_And_string2_Has_Same_Length()
        {
            //arrange
            string string1 = "abc";
            string string2 = "aaa";
            var target = new SimpleSubstitutionCipher();

            //act
            bool actual = target.HasSameLength(string1, string2);

            //assert
            Assert.IsTrue(actual);
        }

        [TestMethod]
        public void StringLength_is_LargerEqual_than_1_and_LessEqual_than_10()
        {
            string string1 = "a";
            var target = new SimpleSubstitutionCipher();

            //act
            bool actual = target.CheckLength(string1);

            //assert
            Assert.IsTrue(actual);
        }

        [TestMethod]
        public void StringLength_isnot_LargerEqual_than_1_and_LessEqual_than_10()
        {
            string string1 = "aaaaaaaaaaa";
            var target = new SimpleSubstitutionCipher();

            //act
            var actual = target.CheckLength(string1);

            //assert
            Assert.IsFalse(actual);
        }

        [TestMethod]
        public void aacb_And_aabc_Is_SubstitutionCipher()
        {
            //arrange
            var target = new SimpleSubstitutionCipher();
            var string1 = "aacb";
            var string2 = "aabc";

            //act
            var actual = target.IsSubstitutionCipher(string1, string2);

            //assert
            Assert.AreEqual(true, actual);
        }

        [TestMethod]
        public void aa_And_bc_Is_Not_SubstitutionCipher()
        {
            //arrange
            var target = new SimpleSubstitutionCipher();
            var str1 = "aa";
            var str2 = "bc";

            //act
            var actual = target.IsSubstitutionCipher(str1, str2);

            //assert
            Assert.IsFalse(actual);
        }

        [TestMethod]
        public void aaxxaaz_And_aazzaay_IsSubstitutionCipher()
        {
            //arrange
            var target = new SimpleSubstitutionCipher();
            var str1 = "aaxxaaz";
            var str2 = "aazzaay";

            //act
            var actual = target.IsSubstitutionCipher(str1, str2);

            //assert
            Assert.IsTrue(actual);
        }

        [TestMethod]
        public void aaxyaa_And_aazzaa_IsNotSubstitutionCipher()
        {
            //arrange
            var target = new SimpleSubstitutionCipher();
            var str1 = "aaxyaa";
            var str2 = "aazzaa";

            //act
            var actual = target.IsSubstitutionCipher(str1, str2);

            //assert
            Assert.IsFalse(actual);
        }

        [TestMethod]
        public void aabc_And_aacb_IsSubstitutinoCipher()
        {
            var target = new SimpleSubstitutionCipher();
            var str1 = "aabc";
            var str2 = "aacb";

            var actual = target.IsSubstitutionCipher(str1, str2);

            Assert.IsTrue(actual);
        }

        [TestMethod]
        public void dccd_And_zzxx_IsNotSubstitutionCipher()
        {
            var  target = new SimpleSubstitutionCipher();
            var str1 = "dccd";
            var str2 = "zzxx";

            var actual = target.IsSubstitutionCipher(str1, str2);
            
            Assert.IsFalse(actual);
        }
    }
}