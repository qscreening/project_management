import javax.persistence.*;

@Entity
@Table(name = "PROJECT_MEMBERS")
public class ProjectMember {
   	
	@Id @GeneratedValue
  	@Column(name = "ID")
  	private int id;	
	
	@Column(name = "MEMBER_ID")
	private int memberId;
	@OneToOne
    	@JoinColumn(name = "USER_ID")
	private User user;
	
	@OneToMany
    	@JoinColumn(name = "PROJECT_ID")
	private Project project;	
	/*@Column(name = "PROJECT_ID")
	private int projectId;*/
	
	@Column(name = "OWNER")
	private boolean owner;

	
	public int getId() {
      		return id;
   	}

   	public void setId( int id ) {
      		this.id = id;
   	}
	
	public boolean getOwner() {
      		return owner;
   	}

   	public void setOwner( int owner ) {
      		this.owner = owner;
   	}
	

}
