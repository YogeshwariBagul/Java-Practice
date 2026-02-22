
import java.util.*;

public class StringCharCount {
    public static void main(String[] args) {
        String str="international";
        Map<Character,Integer> map=new HashMap<>();

        for(char ch:str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(Character key: map.keySet()){
            System.out.println("Character with occurencce of "+ key +" "+ map.get(key));
        }
    }
}
