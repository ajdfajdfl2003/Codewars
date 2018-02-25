using System.Collections.Generic;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace FindFileInDirectories
{
    [TestClass]
    public class SearchTest
    {
        [TestMethod]
        public void FirstTest()
        {
            var myFolder = new Folder("All",
                new List<Item>()
                {
                    new File("readme"),
                    new File("question"),
                    new Folder("Docs",
                        new List<Item>()
                        {
                            new File("info"),
                            new File("answer")
                        })
                });

            var target = new Search();

            var actual = target.FindFileInFolder(myFolder, "answer");

            var expected = $@"All\\Docs\\answer";
            Assert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void SecondTest()
        {
            var myFolder = new Folder("All",
                new List<Item>
                {
                    new File("readme"),
                    new File("question"),
                    new Folder("Docs",
                        new List<Item>
                        {
                            new File("info"),
                            new File("answer"),
                        }),
                    new Folder("Docs1",
                        new List<Item>
                        {
                            new File("info1"),
                        })
                });

            var target = new Search();

            var actual = target.FindFileInFolder(myFolder, "info1");

            var expected = $@"All\\Docs1\\info1";
            Assert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void ThirdTest()
        {
            var myFolder = new Folder("main",
                new List<Item>()
                {
                    new File("readme"),
                    new File("question"),
                    new Folder("docs",
                        new List<Item>()
                        {
                            new File("info"),
                            new Folder("pics",
                                new List<Item>()
                                {
                                    new File("summer"),
                                    new File("winter"),
                                    new Folder("all", null),
                                    new File("spring")
                                })
                        })
                });

            var target = new Search();

            var actual = target.FindFileInFolder(myFolder, "winter");

            var expected = $@"main\\docs\\pics\\winter";
            Assert.AreEqual(expected, actual);
        }
    }
}