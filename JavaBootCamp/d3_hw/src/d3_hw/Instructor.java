package d3_hw;

public class Instructor extends User {
	
	private String[] courses;
	private String branch;
	private String detail;
	
	public Instructor() {
		
	}
	
	public Instructor(int id,String firstName,String lastName,String email,String[] courses, String branch,String detail) {
		super(id,firstName,lastName,email);
		this.courses = courses;
		this.branch = branch;
		this.detail = detail;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public String getDetail() {
		return detail;
	}
	
	public void setDetail(String detail) {
		this.detail = detail;
	}

}
