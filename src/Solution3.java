import java.util.Scanner;
/*�����ַ������һ�����ʵĳ��ȣ������Կո������*/
/*public class Solution3 {
	public static void main(String[] args) {
		System.out.println("������һ��Ӣ�ģ����Կո������");
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
		System.out.println("������һ��Ӣ�ģ����Կո������");
		Scanner sc=new Scanner(System.in);
		System.out.println(getLength(sc.nextLine()));
	}
}

