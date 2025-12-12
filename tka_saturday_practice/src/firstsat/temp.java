package firstsat;

public class temp {
	public static void main(String args[]) {
		String str = "cheese";
		String tmp="";
		for(int i=0;i<str.length();i++) {
			Character v = str.charAt(i);
			if(v=='a'|v=='e'|v=='i'|v=='o'|v=='u'|v=='A'|v=='E'|v=='I'|v=='O'|v=='U') {
				tmp = str.substring(i, str.length())+str.substring(0, i)+"ay";
				break;
			}
		}
		System.out.println(tmp);
	}

}
