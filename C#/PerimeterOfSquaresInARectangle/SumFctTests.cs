using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Numerics;

namespace PerimeterOfSquaresInARectangle
{
    [TestClass]
    public class SumFctTests
    {
        [TestMethod]
        public void PerimeterTest_Input_7_Result_216()
        {
            Assert.AreEqual(new BigInteger(216), SumFct.perimeter(new BigInteger(7)));
        }

        [TestMethod]
        public void PerimeterTest_Input_5_Result_80()
        {
            Assert.AreEqual(new BigInteger(80), SumFct.perimeter(new BigInteger(5)));
        }
    }
}