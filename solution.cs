static List<string> GetPermutations(string input)
    {
        var permutations = new List<string>();
        if (input.Length == 1)
        {
            permutations.Add(input);
        }
    }