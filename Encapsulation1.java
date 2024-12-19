package Practice;

class Amazon
{
private String emailid="sdasd@gmail.com";

public String getEmailid() {
	return emailid;
}

public void setEmailid(String emailid) {
	this.emailid = emailid;
}

}
public class Encapsulation1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon a1=new Amazon();
		a1.setEmailid("abc@gmail.com");
		System.out.println(a1.getEmailid());

}
}
