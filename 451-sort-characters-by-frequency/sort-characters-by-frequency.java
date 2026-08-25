class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] ch=s.toCharArray();
        for(char c:ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Character> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder ans = new StringBuilder();

        for (char a : list) {
            for (int i = 0; i < map.get(a); i++) {
                ans.append(a);
            }
        }

        return ans.toString();
    }
}