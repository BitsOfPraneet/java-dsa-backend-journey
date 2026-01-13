**Task A- Coding**



import java.util.HashMap;



class AnagramChecker{

&nbsp;   static boolean isAnagram(String a,String b){

&nbsp;       if(a.length()!=b.length()) return false;

&nbsp;       else{

&nbsp;           HashMap<Character,Integer> map = new HashMap<>();

&nbsp;           for(int i=0;i<a.length();i++){

&nbsp;               if(map.containsKey(a.charAt(i))) map.put(a.charAt(i),map.get(a.charAt(i))+1);

&nbsp;               else map.put(a.charAt(i),1);

&nbsp;           }

&nbsp;           for(int j=0;j<b.length();j++){

&nbsp;               if(map.containsKey(b.charAt(j))){

&nbsp;                   if(map.get(b.charAt(j))>-1) map.put(b.charAt(j),map.get(b.charAt(j))-1;

&nbsp;                   else return false;

&nbsp;               }

&nbsp;               else return false;

&nbsp;           }

&nbsp;           return true;

&nbsp;       }

&nbsp;   }

&nbsp;   public static void main(String\[] args) {

&nbsp;       String a="rat";

&nbsp;       String b="art";

&nbsp;       System.out.println("Are a and b anagram? "+isAnagram(a, b));

&nbsp;   }

}



Task B- Reasoning



1. How many times a character has been encountered
2. Frequency of characters in the string, as a character is passed through string t frequency decreases by 1.
3. because its best case is O(1) if length of s and t are not equal and worst case O(n) because it traverse through both the strings.





Task C - Pattern Recognition



In all these, while traversing a state is detected and updated if needed.



Task D- Reflection



1. I thought for more than 7-8 minutes, day 1 and day 2 under 2 minutes.
2. Natural
3. More of hashmap.





**Corrected Code:-**



**static boolean isAnagram(String a, String b) {**

    **if (a.length() != b.length()) return false;**



    **HashMap<Character, Integer> map = new HashMap<>();**



    **for (int i = 0; i < a.length(); i++) {**

        **char ch = a.charAt(i);**

        **map.put(ch, map.getOrDefault(ch, 0) + 1);**

    **}**



    **for (int j = 0; j < b.length(); j++) {**

        **char ch = b.charAt(j);**



        **if (!map.containsKey(ch)) return false;**



        **map.put(ch, map.get(ch) - 1);**



        **if (map.get(ch) < 0) return false;**

    **}**



    **return true;**

**}**



