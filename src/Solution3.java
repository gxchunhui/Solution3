import java.util.Scanner;
/*计算字符串最后一个单词的长度，单词以空格隔开。*/
/*public class Solution3 {
	public static void main(String[] args) {
		System.out.println("请输入一行英文，并以空格隔开：");
		Scanner sc=new Scanner(System.in);
		String[] str=sc.nextLine().split(" ");
		System.out.println(str[str.length-1].length());
	}
}*/

public class Solution3
{

	public static int getLength(String str)
	{
		String[] string=str.split(" ");
		return string[string.length-1].length();
	}
	
	
	public static void main(String[] args) {
		//Solution s=new Solution();
		System.out.println("请输入一行英文，并以空格隔开：");
		Scanner sc=new Scanner(System.in);
		System.out.println(getLength(sc.nextLine()));
	}
}

