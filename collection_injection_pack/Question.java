package collection_injection_pack;

import java.util.List;

public class Question {
	String no;
	String question;
	List<String> al;

	public Question(String no, String question, List<String> al) {
		super();
		this.no = no;
		this.question = question;
		this.al = al;
	}

	@Override
	public String toString() {
		return "Queston [no=" + no + ", question=" + question + ", al=" + al + "]";
	}

}
