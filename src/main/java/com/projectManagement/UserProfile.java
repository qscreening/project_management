import javax.persistence.*;

@Entity
@Table(name = "USER_PROFILES")
public class UserProfile {
   	
	//@Id @GeneratedValue
	@OneToOne
    	@JoinColumn(name = "USER_ID")
	private User user;
	
	@Column(name = "PHONE_NUMBER")
	private int phoneNumber;

	
	
	public int getPhoneNumber() {
      		return phoneNumber;
   	}
   	
	public void setPhoneNumber( int phoneNumber ) {
      		this.phoneNumber = phoneNumber;
   	}

}
