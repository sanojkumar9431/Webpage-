
import java.util.List;
public class Person1 {
	private String name;
	private String email;
	private String password;
	private String age;
	private String bio;
	private String job;
	private List<String> interest;
	
	public Person1()
	{
		super();
	}
	public Person1(String name, String email,String password,String age,String bio, String job,
	List<String>interest) {
		super();
		this.name=name;
		this.email=email;
		this.password=password;
		this.age=age;
		this.bio=bio;
		this.job=job;
		this.interest=interest;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name= name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail() {
		this.email= email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword() {
		this.password= password;
	}
	public String getAge() {
		return age;
	}
	public void setAge() {
		this.age= age;
	}
	public String getBio() {
		return bio;
	}
	public void setBio() {
		this.bio= bio;
	}
	public String getJob() {
		return job;
	}
	public void setJob() {
		this.job= job;
	}
	public List<String> getInterest(){
		return interest;
	}
	public void setInterest(List<String>interest) {
		this.interest=interest;
	}
    
}
