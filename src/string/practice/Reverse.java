package string.practice;
class Reverse {

    public static void reverseWords(String sd) {

        // Your code here
       System.out.println(sd);
        String str[] = sd.split("\\.");
        int left = 0;
        int right = str.length - 1;
        
        while(left <= right) {
            String temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            
            left++;
            right--;
        }
        String resString = "";
        for(String st: str) {
            resString += st;
            System.out.println(st);
        }
       System.out.print(resString);
    }
    
    public static void main(String []args) {
    	
    	reverseWords("i.like.very.much");
    	
    }
}