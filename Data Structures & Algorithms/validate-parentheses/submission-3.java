class Solution {
    public boolean isValid(String s) {


        Map <Character,Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')','(');
        closeToOpen.put(']','[');
        closeToOpen.put('}','{');

        Stack <Character> st=new Stack<>();

        for(char c:s.toCharArray()){

            if(closeToOpen.containsKey(c)){
                if(st.isEmpty() || st.peek()!=closeToOpen.get(c)){
                    return false;
                }
                st.pop();
            }
            else{
                st.push(c);
            }
        }

        return st.isEmpty();

        // Stack <Character> st =new Stack<>();
        // int count=0;

        
        // for(char c : s.toCharArray()){

        //     if(c == '(' || c == '{' || c == '['){
        //         st.push(c);
        //         count++;
        //     }
        //     else{

        //         if(st.isEmpty()) return false;

        //         char top= st.pop();

        //         if(c == ')' && top != '(') return false;
        //         if(c == ']' && top != '[') return false;
        //         if(c == '}' && top != '{') return false;
        //         count--;
        //     }
        // }

        // return count==0?true:false;
    }
}
