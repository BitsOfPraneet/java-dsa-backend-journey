import java.util.HashMap;

class AnagramChecker{
    static boolean isAnagram(String a,String b){
        if(a.length()!=b.length()) return false;
        else{
            HashMap<Character,Integer> map = new HashMap<>();
            for(int i=0;i<a.length();i++){
                if(map.containsKey(a.charAt(i))) map.put(a.charAt(i),map.get(a.charAt(i))+1);
                else map.put(a.charAt(i),1);
            }
            for(int j=0;j<b.length();j++){
                if(map.containsKey(b.charAt(j))){
                    if(map.get(b.charAt(j))>-1) map.put(b.charAt(j),map.get(b.charAt(j))+1);
                    else return false;
                }
                else return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        String a="rat";
        String b="art";
        System.out.println("Are a and b anagram? "+isAnagram(a, b));
    }
}