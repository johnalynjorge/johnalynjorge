public class LabExer1A
{
	public static void main (String[] args) 
{
	int faveNumber = 4;
	String faveCartChar = "Sandy";
	char mi = 'M';
	char[] nickNameArray = new char[5];
	nickNameArray[0] = 'J';
	nickNameArray[1] = 'o';
	nickNameArray[2] = 'h';
	nickNameArray[3] = 'n';
	nickNameArray[4] = 'a';
	
	
	System.out.println(faveNumber + " is my favorite number.");
	System.out.println("I love "+faveCartChar);
	System.out.println("My name is Johnalyn " +  mi + ". Jorge.");
	System.out.print("You can call me ");
	 for (int ctr = 0; ctr < nickNameArray.length; ctr++)
	 {
	 	System.out.print(nickNameArray[ctr]);
	 }
	
}
}