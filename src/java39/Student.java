package java39;

public class Student extends People {
    private String ClassName;
    private String SchoolName;

    public Student() {}
    public Student(String fullName, int yearOfBirth, String className, String schoolName) {
        super(fullName, yearOfBirth);
        ClassName = className;
        SchoolName = schoolName;
    }

    public void DoHomework() {
        System.out.println(".... .... ...");
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }
}
