package org.cydeo;

import java.util.HashMap;
import java.util.Map;

public class StringService {

    public static boolean palidtomeValidation(String s){
        // 1. convert to lower case
        s=s.toLowerCase();
        // 2. remove spaces
        s=s.replaceAll("\\s","");
        // 3. compare front to back characters
        char[] chS = s.toCharArray();
        for(int i=0; i< chS.length/2; i++){
            if (chS[i] != chS[chS.length-i-1]) return false;
        }
        return true;
    }
    public static boolean anagramValidate(String s, String t){

        if (s.length()!=t.length() || s.isEmpty()) return false;

        Map<Character, Integer> chMap = new HashMap<>();
        int count;

        //load chMap with s
        for (Character ch : s.toCharArray()){
            if (chMap.containsKey(ch)){
                count = chMap.get(ch)+1;
                chMap.put(ch, count);
            }else {
                chMap.put(ch, 1);
            }
        }


        //validate characters with t
        for (Character ch : t.toCharArray()){
            if (chMap.containsKey(ch)){
                count=chMap.get(ch)-1;
                if (count>-1)
                    chMap.put(ch, count);
                else
                    return false;
            }else
                return false;
        }
        return true;



    }

 }
