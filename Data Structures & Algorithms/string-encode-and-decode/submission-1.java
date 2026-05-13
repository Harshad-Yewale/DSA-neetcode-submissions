class Solution {
        String encode(List<String> strs){

            StringBuilder encodedString= new StringBuilder();

            for(String str : strs){
                int length= str.length();
                encodedString.append(length)
                .append('#')
                .append(str);
            }
            return encodedString.toString();
        }

        List<String> decode(String str){

            List<String> decodedString=new ArrayList<>();
            int i=0;

            while(i<str.length()){
                int j=i;

                while(str.charAt(j)!='#'){
                    j++;
                }
                int len=Integer.parseInt(str.substring(i,j));
                j++;
                String subString=str.substring(j,j+len);
                decodedString.add(subString);
                i=j+len;
            }

            return decodedString;
        }
   
    }

