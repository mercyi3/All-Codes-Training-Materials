package oops;

class Whatsapp //parent
{
	void text()
	{
		System.out.println("Texting...");
	}
	void call()
	{
		System.out.println("Calling...");
	}
}
class UpdatedWhatsapp extends Whatsapp
{
	void videoCall()
	{
		System.out.println("Video Calling...");
		super.text();
	}
	void groupcall()
	{
		System.out.println("Group chat and call...");
		super.call();
	}	
}
public class SingleInherit 
{
	public static void main(String[] args) 
	{
		UpdatedWhatsapp u = new UpdatedWhatsapp();
//		u.call();
//		u.text();
		u.videoCall();
		u.groupcall();
	}
}
