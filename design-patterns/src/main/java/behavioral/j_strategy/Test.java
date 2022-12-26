package behavioral.j_strategy;

public class Test {
	public static void main(String[] args) {
		//ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 10,
		//		TimeUnit.SECONDS, new SynchronousQueue<>(),  //这里不给排队
		//		new ThreadPoolExecutor.DiscardOldestPolicy());   //当线程池无法再继续创建新任务时，我们可以自由决定使用什么拒绝策略
		//
		//Runnable runnable = () -> {
		//	try {
		//		TimeUnit.SECONDS.sleep(60);
		//	} catch (InterruptedException e) {
		//		throw new RuntimeException(e);
		//	}
		//};
		//
		//executor.execute(runnable);   //连续提交两次任务，肯定塞不下，这时就得走拒绝了
		//executor.execute(runnable);
		//Main1.ss = "123";
		//Main1.ss = "111";
		System.out.println(Main1.ss);
	}
}
