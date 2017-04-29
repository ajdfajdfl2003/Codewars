using System.Collections.Generic;

namespace FindFileInDirectories
{
    public class Folder : Item
    {
        public Folder(string name, List<Item> items)
        {
            Name = name;
            Items = items;
        }

        public List<Item> Items { get; set; }
    }
}