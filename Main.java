import java.util.Arrays; 

public class Main {
	
	static boolean areAnagram(String str1, String str2) 
    { 
       
        int n1 = str1.length(); 
        int n2 = str2.length(); 
  
       
        if (n1 != n2) 
            return false;
        
        char strArray1[] = str1.toCharArray(); 
        char strArray2[] = str2.toCharArray(); 
  
        Arrays.sort(strArray1); 
        Arrays.sort(strArray2); 
  
        for (int i = 0; i < n1; i++) 
            if (strArray1[i] != strArray2[i]) 
                return false; 
  
        return true; 
    }
	

	public static void main(String[] args) {
        if (areAnagram("bleat", "tabl6")) 
            System.out.println("Two strings are anagram"); 
        else
            System.out.println("Two strings are not anagram"); 
    } 

}
