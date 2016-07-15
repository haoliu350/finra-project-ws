package com.fitch.rest.util;

import java.util.ArrayList;

public class Solution {
    private char[][] map={
                     {},{},{'a','b','c'},
                     {'d','e','f'},{'g','h','i'},{'j','k','l'},
                     {'m','n','o'}, {'p','q','s','r'}, {'t','u','v'},
                     {'w','x','y','z'}     
                    };
    public ArrayList<String> letterCombinations(String digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
                    
       ArrayList<String> result=new ArrayList<String>();
       
       StringBuffer sb=new StringBuffer();
       
       combine(digits,0,sb,result);
       
       return result;
    }
    
    private void combine(String digits, int i, StringBuffer sb, ArrayList<String> result){
        
        if (i==digits.length()){
            result.add(sb.toString());
        }
        else{
            int index=digits.charAt(i)-'0';
            int len=map[index].length;
            
            for (int j=0; j<len; j++){
                sb.append(map[index][j]);
                combine(digits, i+1, sb, result);
                sb.deleteCharAt(sb.length()-1);
            }
            
        }
    }
}