

// Input: str[] = "abcba"
// Output: a Yes   // "a" is palindrome
//         b No    // "ab" is not palindrome
//         c No    // "abc" is not palindrome
//         b No    // "abcb" is not palindrome
//         a Yes   // "abcba" is palindrome


public class Roughh{

    static boolean isPalindrome(String s){

        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            while(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    static void onlineAlgoCheckingPalindrome(String str, int n){



        String sum = "";
        int count = 0;

        for(int i=0; i<n; i++){
            sum = str.substring(0, i+1);
            if(isPalindrome(sum)){
                System.out.println(sum + " is palindrome ");
            }else{
                System.out.println(sum + " is not Palindrom");
            }
        }

    }

    //Driver Code
    public static void main(String[] args){

        String str = "abcba";
        int n = str.length();

        onlineAlgoCheckingPalindrome(str, n);




    }
}
