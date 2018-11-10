package map_collection_injection_pack;

import java.util.List;
import java.util.Map;

public class Question {
	String no;
	String question;
	Map<String ,String> al;
	public Question(String no, String question, Map<String, String> al) {
		super();
		this.no = no;
		this.question = question;
		this.al = al;
	}
	@Override
	public String toString() {
		return "Question [no=" + no + ", question=" + question + ", al=" + al + "]";
	}

	

}
