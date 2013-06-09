package wait.and.notify;

/**
 * 多线程阻塞在一个信号量上，
 * 通过发送notify信号量 依次唤醒其他线程
* @Package wait.and.notify 
* @author liukunyang
* @date 2013-6-9 上午09:59:53 
* @version V1.0
 */
public class WaitAndNotifyTest {
	
	public synchronized void wantTowait(int i ){
		try {
			System.out.println( i + "  ready to wait ");
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(  i +"  wait finsh");
	}
	
	public synchronized void wantToNotify(){
		System.out.println( "ready to Notify ");
		this.notify();
		System.out.println( "Notify finsh");
	}
	
	public synchronized void wantToNotifyAll(){
		System.out.println( "ready to NotifyAll ");
		this.notifyAll();
		System.out.println( "NotifyAll finsh");
	}
	
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		final WaitAndNotifyTest w = new WaitAndNotifyTest();
		Thread t1 = null;				
		for(int i = 0 ; i < 10 ; i ++){
			 t1 = new Thread( new WaitAndNotifyProcessor( w , i ) );
			 t1.start();
						
		}
		
		t1.interrupt();
//		
//		Thread.sleep(2000);
//		w.wantToNotify();
//		Thread.sleep(2000);
//		w.wantToNotify();
//		Thread.sleep(2000);
//		w.wantToNotify();
//		Thread.sleep(2000);
//		w.wantToNotify();
//		Thread.sleep(2000);
//		w.wantToNotify();
//		
//		
//		Thread.sleep(2000);
//		w.wantToNotifyAll();
	
	}

}



