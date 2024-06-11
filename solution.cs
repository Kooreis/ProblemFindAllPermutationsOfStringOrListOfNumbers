Here is a simple console application in C# that finds all permutations of a string or list of numbers:

```C#
using System;
using System.Collections.Generic;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter a string or list of numbers:");
        string input = Console.ReadLine();
        var permutations = GetPermutations(input);
        foreach (var permutation in permutations)
        {
            Console.WriteLine(permutation);
        }
    }

    static List<string> GetPermutations(string input)
    {
        var permutations = new List<string>();
        if (input.Length == 1)
        {
            permutations.Add(input);
        }
        else
        {
            for (int i = 0; i < input.Length; i++)
            {
                string charAtI = input[i].ToString();
                string remaining = input.Substring(0, i) + input.Substring(i + 1);
                foreach (var permutation in GetPermutations(remaining))
                {
                    permutations.Add(charAtI + permutation);
                }
            }
        }
        return permutations;
    }
}
```

This program prompts the user to enter a string or list of numbers. It then calculates all permutations of the input and prints them to the console. The `GetPermutations` method uses a recursive approach to generate all permutations.