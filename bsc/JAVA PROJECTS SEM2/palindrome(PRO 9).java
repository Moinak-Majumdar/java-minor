import java.util.Scanner;

class pali_str {

    static boolean isPalindrome(String str)
    {
    	int i = 0, j = str.length() - 1;
    	while (i < j)
    	{
    			if (str.charAt(i) != str.charAt(j))
                return false;

    			i++;
    			j--;
        }
    			return true;
    }


}
class palindrome {

	public static void main(String[] args)
	{
		pali_str obj= new pali_str();
		String str;

		System.out.println("Enter a string==>");
		Scanner sc = new Scanner(System.in);
		str=sc.nextLine();

		if (obj.isPalindrome(str))
	            System.out.print(str +" Is PALINDROME");
	    else
	            System.out.print(str +" Is NOT PALINDROME !!");
	}

}
