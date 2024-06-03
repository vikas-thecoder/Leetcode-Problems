/*

 Letter Combinations of a Phone Number

 
*/
class Combination {
    List<String> res = new ArrayList<>();
    
    char[][] map = new char[8][];
    {
    map[0] = "abc".toCharArray();
    map[1] = "def".toCharArray();
    map[2] = "ghi".toCharArray();
    map[3] = "jkl".toCharArray();
    map[4] = "mno".toCharArray();
    map[5] = "pqrs".toCharArray();
    map[6] = "tuv".toCharArray();
    map[7] = "wxyz".toCharArray();}
    
    public void backtrack(String ans, String next_digits){
        if(next_digits.length() == 0) {
           res.add(ans); 
        }
        else {
            int digit = Integer.parseInt(next_digits.substring(0,1));
            char[] letters = map[digit - 2];
            for(char c :letters ){
                backtrack(ans + c, next_digits.substring(1));
            }
        }
    }
    public List<String> letterCombinations(String digits) {
        if( digits.length() != 0)
            backtrack("", digits);
        return res;
    }
}
