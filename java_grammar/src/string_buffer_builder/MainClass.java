package string_buffer_builder;

public class MainClass {
	public static void main(String[] args) {
		//String str = "java";
		String str = new String("java");
		System.out.println(str);
		
		str = str + "_8";
		System.out.println(str);
		
		// StringBuffer
		StringBuffer str2 = new StringBuffer("java2");
		System.out.println(str2);
		
		str2.append(" world");
		System.out.println(str2);
		
		System.out.println(str2.length());
		
		str2.insert(str2.length(), "~!");
		System.out.println(str2);
		
		str2.delete(3, 7);
		System.out.println(str2);
		
		// StringBuilder
		StringBuilder str3 = new StringBuilder("java3");
		System.out.println(str3);
		
	}
}
