/*
20. Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
Example 4:

Input: s = "([)]"
Output: false
Example 5:

Input: s = "{[]}"
Output: true
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/
class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> temp = new Stack<>();
        Map<Character,Character> set = Map.of('{','}','[',']','(',')');
        for(int i = 0; i < s.length(); i++){
            if( set.containsKey(s.charAt(i)))
               temp.push(s.charAt(i));
            else {
                if(temp.empty())
                    return false;
                char c = temp.pop();
                if(set.get(c) != s.charAt(i))
                    return false;
                }    
        }
        return temp.empty();
        
    }
}
