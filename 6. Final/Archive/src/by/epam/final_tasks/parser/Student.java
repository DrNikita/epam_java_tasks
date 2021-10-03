package by.epam.final_tasks.parser;

public class Student {
	private String name;
	private String gender;
	private String age;
	private String adress;
	private String mobilePhone;

	public Student(String name, String gender, String age, String adress, String mobilePhone) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.adress = adress;
		this.mobilePhone = mobilePhone;
		new Archive().setStudet(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\nGender: " + gender + "\nAge: " + age + "\nAdress: " + adress + "\nMobile phone: "
				+ mobilePhone;
	}

}
