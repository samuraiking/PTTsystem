package teachingRequirment;

public class Requirement {
	int requirementID;
	int requiredStaffNumber;
	Training training;
	public Requirement(int ID,int number,Training training) {
		this.requirementID=ID;
		this.requiredStaffNumber=number;
		this.training=training;
	}

}
