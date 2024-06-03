package org.example;
import java.util.*;

public class Main{
    static HashMap<Character,String> map = new HashMap<>() {{
        put('2',"abc");
        put('3',"def");
        put('4',"ghi");
        put('5',"jkl");
        put('6',"mno");
        put('8',"tuv");
        put('7',"pqrs");
        put('9',"wxyz");
    }
    };
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String digits = sc.nextLine();
            List<String> res = new ArrayList<>();
            res = letterCombines(digits,res);
            System.out.println(res);
        }
    }
    public static List<String> letterCombines(String digits,List<String> res){
        if (digits.length() == 0){
            return res;
        }
        iterStr(digits,new StringBuilder(),0,res);
        return res;
    }
    public static void iterStr(String digits,StringBuilder letter,int index,List<String> res) {
        if (index == digits.length()){
            res.add(letter.toString());
            return;
        }
        char a = digits.charAt(index);
        String map_string = map.get(a);
        for (int i = 0;i < map_string.length();i++){
            letter.append(map_string.charAt(i));
            iterStr(digits,letter,index+1,res);
            letter.deleteCharAt(letter.length()-1);
        }
    }
}
