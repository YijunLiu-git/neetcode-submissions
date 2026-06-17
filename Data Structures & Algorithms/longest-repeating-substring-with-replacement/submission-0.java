class Solution {
    public int characterReplacement(String s, int k) {
        int l =0,res=0,max=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int r=0;r<s.length();r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            max=Math.max(map.get(s.charAt(r)),max);

            while((r-l+1)-max>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }

            res = Math.max(r-l+1,res);
        }
        return res;
    }
}
