package behavioral.command.demo1;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	
	List<Action> actionList = new ArrayList<>();
	
	void addAction(Action action){
		actionList.add(action);
	}
	
	void execute(Action action) {
		action.execute();
	}
	
	void execute(){
		for (Action action : actionList) {
			action.execute();
		}
		actionList.clear();
	}
	
}
