def get_permutations(input_data):
    if isinstance(input_data, str):
        return [''.join(p) for p in permutations(input_data)]
    elif isinstance(input_data, list) and all(isinstance(i, int) for i in input_data):
        return [list(p) for p in permutations(input_data)]
    else:
        return "Invalid input. Please enter a string or a list of integers."