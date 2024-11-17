public class LongestCommonPrefix{
    public String longestCommonPrefix(String[] strs) {
        String smallestString = new String(strs[0]);
        for (int i = 0; i < strs.length; i++){
            String currentString = new String(strs[i]);
            if (currentString.length() < smallestString.length()){
                smallestString = strs[i];
            }
        }
        String prefix = new String(smallestString);
        boolean isDone = false;

        for (int x = 0; x < strs.length; x++){
            for (int i = 0; i < prefix.length(); i++){
                if ((strs[x].charAt(i) != prefix.charAt(i)) && (i == 0)){
                    prefix = "";
                    isDone = true;
                    break;
                } else if (strs[x].charAt(i) != prefix.charAt(i)){
                    prefix = prefix.substring(0, i);
                    break;
                }
            }
            if (isDone){
                break;
            }
        }
        return prefix;
    }
}