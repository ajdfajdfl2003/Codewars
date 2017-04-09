namespace InvertValuesTest
{
    public class ArraysInversion
    {
        public ArraysInversion()
        {
        }

        public int[] InvertValues(int[] input)
        {
            for (var i = 0; i < input.Length; i++)
            {
                input[i] *= -1;
            }
            return input;
        }
    }
}