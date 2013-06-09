package wait.and.notify;

public class WaitAndNotifyProcessor implements Runnable {
	
	
	private WaitAndNotifyTest w ;
	private int name;
	
	public WaitAndNotifyProcessor( WaitAndNotifyTest w  , int name){
		this.w = w;
		this.name = name;
	}
	
	@Override
	public void run() {
		
		if( name == 0){
			try {
				System.out.println("0 sleep 5s");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		w.wantTowait( name);
	}

	
	
}
