Here is a Python console application that finds all permutations of a string or list of numbers:

```python
from itertools import permutations

def get_permutations(input_data):
    if isinstance(input_data, str):
        return [''.join(p) for p in permutations(input_data)]
    elif isinstance(input_data, list) and all(isinstance(i, int) for i in input_data):
        return [list(p) for p in permutations(input_data)]
    else:
        return "Invalid input. Please enter a string or a list of integers."

def main():
    user_input = input("Enter a string or a list of numbers (separated by comma): ")
    try:
        user_input = [int(i) for i in user_input.split(',')]
    except ValueError:
        pass
    print(get_permutations(user_input))

if __name__ == "__main__":
    main()
```

To run this application, simply run the script and enter a string or a list of numbers when prompted. The application will print all permutations of the input. If the input is neither a string nor a list of numbers, the application will print an error message.