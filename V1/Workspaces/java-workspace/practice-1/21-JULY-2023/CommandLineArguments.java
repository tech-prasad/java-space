

public class CommandLineArguments {
	public static void main(String[] args){
		
		String arg1 = args[0];
		String arg2 = args[2];
		
		System.out.println(arg1);
		System.out.println(arg2);
		
		for(String s : args){
			System.out.println(s);			
		}		
	}
}