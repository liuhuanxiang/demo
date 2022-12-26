package behavioral.temp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Engine {
	
	private String name;
	private String code;
	
	public static void main(String[] args) {
		//new Engine().method1((x) -> {
		//	if (x.equals("123")) {
		//		return;
		//	}
		//});
		//System.out.println(111);
		//Boolean b = null;
		//int i = b ? 1 : 0;
		//System.out.println(i);
		
		Engine engine = new Engine();
		engine.setName("fffb");
		Engine engine1 = new Engine();
		engine1.setName("fffa");
		List<Engine> list1 = new ArrayList<>();
		List<Engine> list2 = new ArrayList<>();
		list1.add(engine);
		list2.add(engine1);
		List<Engine> allList = new ArrayList<>();
		allList.addAll(list1);
		allList.addAll(list2);
		method1(x -> allList.add(x));
		System.out.println(allList);
		//Iterator<Engine> iterator = allList.iterator();
		//while (iterator.hasNext()) {
		//	Engine next = iterator.next();
		//	next.setCode("123");
		//	if (next.getName().equals("fffb")) {
		//		iterator.remove();
		//	}
		//}
		//for (Engine e : allList) {
		//	e.setCode("123");
		//	if (e.getName().equals("fffb")) {
		//		iterator
		//	}
		//}
		//LocalDateTime localDateTime = LocalDate.now().atStartOfDay();
		//LocalDateTime now = LocalDateTime.now();
		//
		//System.out.println(now);
		//System.out.println(localDateTime);
		//System.out.println(list1);
		//System.out.println(list2);
		//System.out.println(allList);
		//allList.clear();
		//allList.sort(Comparator.comparing(Engine::getName).reversed());
		//System.out.println(allList);
		//Set<String> collect = list.stream().map(Engine::getName).collect(Collectors.toSet());
		
		//System.out.println(collect);
		
		//for (Engine x : list) {
		//
		//	System.out.println(x.getName());
		//	if (x.getName().equals("fff")) {
		//		return;
		//	}
		//
		//}
	}
	
	public static void method1(Consumer<Engine> consumer){
		//Optional.ofNullable()
		
		consumer.accept(null);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	@Override
	public String toString() {
		return "Engine{" + "name='" + name + '\'' + ", code='" + code + '\'' + '}';
	}
}