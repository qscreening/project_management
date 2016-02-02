@Entity
@Table(name = "PROJECTS")
public class Project {
   	
	@Id @GeneratedValue
  	
	@Column(name = "PROJECT_ID")
  	private int projectId;	
	
	@Column(name = "PROJECT_NAME")
	private String projectName;
	
	@Column(name = "OWNER")
	private int owner;
	@OneToOne
    	@JoinColumn(name = "USER_ID")
	private User user;

	public int getProjectId() {
      		return projectId;
   	}
   	
	public void setProjectId( int projectId ) {
      		this.projectId = projectId;
   	}
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
