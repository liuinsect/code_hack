
public class CpoyOnwrite {

	/**
	 * @author liukunyang
	 * @date 2013-3-4	
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "copy";
		String anthor = str;
		System.out.println( str == anthor); // true
		anthor = anthor.replace("c", "aaa");
		System.out.println( str == anthor);// false
		System.out.println( str );// copy
		System.out.println( anthor );//aaaopy
	}

}
