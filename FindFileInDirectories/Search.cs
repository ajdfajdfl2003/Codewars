using System.Linq;

namespace FindFileInDirectories
{
    public class Search
    {
        public string FindFileInFolder(Folder folder, string fileName)
        {
            if (folder.Items
                .Select(x => x.Name)
                .Contains(fileName))
            {
                return folder.Name + $@"\\" + fileName;
            }
            return folder.Name + $@"\\" +
                   folder.Items.OfType<Folder>()
                       .Select(x => FindFileInFolder(x, fileName))
                       .FirstOrDefault(x => x.Contains(fileName));
        }
    }
}