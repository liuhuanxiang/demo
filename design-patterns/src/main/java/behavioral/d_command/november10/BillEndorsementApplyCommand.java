package behavioral.d_command.november10;

public class BillEndorsementApplyCommand implements Command<BillEndorsementApplyDTO>{
	
	/**
	 * 执行背书申请操作
	 */
	@Override
	public void execute(BillEndorsementApplyDTO dto) {
		System.out.println("背书申请成功！！！");
	}
	
	/**
	 * 背书申请撤回操作
	 */
	@Override
	public void undo(BillEndorsementApplyDTO dto) {
		System.out.println("背书申请撤回成功！！！");
	}
	
}
