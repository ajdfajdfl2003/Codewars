using System.Collections.Generic;

namespace SimpleFun31_IsSubstitutionCipherTest
{
    public class SimpleSubstitutionCipher
    {
        private Dictionary<string, string> _cipherText;

        public bool IsSubstitutionCipher(string string1, string string2)
        {
            _cipherText = new Dictionary<string, string>();

            if (!CheckLength(string1))
            {
                return false;
            }
            if (!HasSameLength(string1, string2))
            {
                return false;
            }
            for (var i = 0; i < string1.Length; i++)
            {
                var str1 = string1.Substring(i, 1);
                var str2 = string2.Substring(i, 1);
                if (!_cipherText.ContainsKey(str1) && !_cipherText.ContainsValue(str2))
                {
                    _cipherText.Add(str1, str2);
                }
                if (!_cipherText.ContainsKey(str1))
                {
                    return false;
                }
                else if (!_cipherText[str1].Equals(str2))
                {
                    return false;
                }
            }
            return true;
        }

        public bool HasSameLength(string string1, string string2)
        {
            return string1.Length.Equals(string2.Length);
        }

        public bool CheckLength(string string1)
        {
            return string1.Length <= 10 && string1.Length >= 1;
        }
    }
}