namespace CalculateStringRotation
{
    public class CalculateStringRotation
    {
        public int ShiftedDiff(string first, string second)
        {
            var count = 0;
            while (count < first.Length)
            {
                if (first == second)
                {
                    return count;
                }
                first = first.Substring(first.Length - 1, 1) + first.Remove(first.Length - 1, 1);
                count++;
            }
            return -1;
        }
    }
}