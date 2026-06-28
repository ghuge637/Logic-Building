class Solution {
    public boolean isValid(String s) {
        Stack<Character>  sk = new Stack();
        
        if(s.length()<2) return false;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch=='(' || ch=='[' || ch=='{'){
                sk.push(ch);
            }else{
                 if (sk.isEmpty()) return false;

                char top = sk.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return sk.isEmpty();
   }
}