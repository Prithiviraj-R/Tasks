package basicprogrammingtasks;

public class StudentDetails {
	private String studentName;
    private int id;
    public StudentDetails()
    {
    	System.out.println("Default constructor.");
    }
    public StudentDetails(String studentName,int id)
    {
    	this.studentName=studentName;
    	this.id=id;
    }
    public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
        return ("StudentName:"+studentName+",Id:"+id);
    }
}
