package entities;

import java.util.Objects;

public class StudentLog {
	
	private String studentId;
	private String name;
	
	public StudentLog(String studentCode, String name) {
		this.studentId = studentCode;
		this.name = name;
	}

	public String getStudentCode() {
		return studentId;
	}

	public void setStudentCode(String studentCode) {
		this.studentId = studentCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentLog other = (StudentLog) obj;
		return Objects.equals(studentId, other.studentId);
	}
}
