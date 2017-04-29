namespace FindFileInDirectories
{
    public class Search
    {
        public string FindFileInFolder(Folder folder, string fileName)
        {
            var result = $@"{folder.Name}\\";
            foreach(var item in folder.Items)
            {
                if(item is Folder)
                {
                    result += $@"{FindFileInFolder((Folder)item,fileName)}";
                    if(result.Contains(fileName))
                    {
                        return result;
                    }
                    result = result.Replace($@"{item.Name}\\","");
                }
                if(item.Name.Equals(fileName))
                {
                    result += $@"{item.Name}";
                    return result;
                }
            }
            return result;
        }
    }
}