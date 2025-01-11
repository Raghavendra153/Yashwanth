public class Day_8_leetcode {
 public List<String> stringMatching(String[] words ){
    List<String> result = new ArrayList<>();

    for(int i = 0; i < words.length;i++){
        String sOne = words[i];
        for(int j = 0; j < words.length;j++){
            String sTwo = words[j];
            if( i!= j&& sOne.length() < sTwo.length()){}
    
 }   
public boolean isSubstring(String sOne, String sTwo){
    for(int i = 0; i<sTwo.length() - sOne.length() ;i++){
        if(sOne.equals(sTwo.substring(i,sOne.length() + i))){
        
        
        return true;
    }
}

return false;
}
    
}
