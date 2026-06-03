class Solution {
    public boolean isValid(String s) {

        Stack <Character> st =new Stack<>();
        int count=0;

        
        for(char c : s.toCharArray()){

            if(c == '(' || c == '{' || c == '['){
                st.push(c);
                count++;
            }
            else{

                if(st.isEmpty()) return false;

                char top= st.pop();

                if(c == ')' && top != '(') return false;
                if(c == ']' && top != '[') return false;
                if(c == '}' && top != '{') return false;
                count--;
            }
        }

        return count==0?true:false;
    }
}
