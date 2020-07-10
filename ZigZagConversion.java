/* ZigZag Conversion
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I
*/
class  ZigZagConversion {
    public String convert(String s, int numRows) {
        
        if (numRows == 1) return s;
        
        ArrayList<StringBuffer> rows=new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
            rows.add(new StringBuffer());
        }
        boolean isGoingDown=false;
        int currow=0;
       
        for(int i=0;i<s.length();i++){
            rows.get(currow).append(s.charAt(i));
            
            if(currow==0 || currow==numRows-1)
                isGoingDown=!isGoingDown;
            
            currow+=(isGoingDown==true)?1:-1;
        
        }
        StringBuffer result=new StringBuffer();
        for(StringBuffer r:rows)
           result.append(r);
        return result.toString();
    }
}
