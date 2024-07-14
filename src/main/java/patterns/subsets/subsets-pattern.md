### Subsets Pattern

The subsets pattern is a way to generate all possible subsets of a given array. Here's a step-by-step explanation of how it works:

1. **Pick the First Element:**
    - Start by picking the first element in the array.

2. **Recursively Generate Combinations:**
    - Recursively go and add all the combinations that include the first element.

3. **Move to the Next Element:**
    - Repeat the same process with the next element in the array. For each recursion that includes the second element, ignore all the elements before it.

4. **Continue Until the End:**
    - Continue this process until you reach the end of the array.

5. **Ignore Previous Elements:**
    - For each element, ensure that in all subsequent recursions, you ignore the elements that come before the current element.

By following these steps, you generate all possible subsets of the array.

**Example:**

Consider the array `[1, 2, 3]`.

1. Start with the first element `1`.
2. Add combinations with `1`: `[1]`, `[1, 2]`, `[1, 3]`, `[1, 2, 3]`.
3. Move to the second element `2`, ignoring the first element: `[2]`, `[2, 3]`.
4. Move to the third element `3`, ignoring the first and second elements: `[3]`.
5. Combine all subsets: `[]`, `[1]`, `[2]`, `[3]`, `[1, 2]`, `[1, 3]`, `[2, 3]`, `[1, 2, 3]`.

This process ensures that all possible subsets are generated.
