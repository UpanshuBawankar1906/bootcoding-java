public class Palindrome 
{
    public boolean isPalindrome(int x) 
    {
        if (x<0) return false;
        int sum = 0;
        int num = x;
        while(num>0)
        {
            sum = sum*10 + (num%10);
            num/=10;
        }
        return sum==x;
    }
}