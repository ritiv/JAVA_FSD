package syncdemo;

public class DisplayMessage {

	public void SayHellow(String name)
{
	
		String tname = Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			System.out.println(tname + ":" + i + "How are you" + name);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
}
