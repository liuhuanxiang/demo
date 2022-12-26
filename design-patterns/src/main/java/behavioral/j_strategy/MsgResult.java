package behavioral.j_strategy;

public class MsgResult {
	
	private String code;
	private Object data;
	private String msg;
	
	public MsgResult(String code, Object data, String msg) {
		this.code = code;
		this.data = data;
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return "MsgResult{" + "code='" + code + '\'' + ", data=" + data + ", msg='" + msg + '\'' + '}';
	}
}
