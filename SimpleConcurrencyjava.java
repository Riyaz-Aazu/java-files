package New;

class MyTask extends Thread{
	
	private String taskname;
	
	public MyTask(String tn) {
		this.taskname = tn;
	}
	
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(taskname+ " Steps " + i);
			try {
				Thread.sleep(5000);
			}catch(Exception e) {
				
			}
		}
	}
}

public class SimpleConcurrencyjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTask t1 = new MyTask("Cooking");
		MyTask t2 = new MyTask("Washing");
		t1.start();
		t2.start();
		

	}

}
