package comm.example;

public class App {
	private char[] arr=new char[10];

	public char[] createArray()
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)('A'+i);
		}
		return arr;
	}

	public static void main(String[] args) {
		
		char[] str = new App().createArray();
		for(char arr:str)
		{
			System.out.println(arr);
		}
		System.out.println("=============================================");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	}
	

}
