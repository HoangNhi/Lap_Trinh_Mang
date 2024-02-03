package java37;

public class Student {
    private String StudentCode, Name;
    private Date Birthday;
    private double GPA;
    private Classroom Classroom;

    public Student() {}
    public Student(String studentCode, String name, Date birthday, double GPA, Classroom aClassroom) {
        StudentCode = studentCode;
        Name = name;
        Birthday = birthday;
        this.GPA = GPA;
        Classroom = aClassroom;
    }

    public String getStudentCode() {
        return StudentCode;
    }

    public void setStudentCode(String studentCode) {
        StudentCode = studentCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public java37.Classroom getClassroom() {
        return Classroom;
    }

    public void setClassroom(java37.Classroom classroom) {
        Classroom = classroom;
    }

    public String layTenKhoa(){
        return getClassroom().getFaculty();
    }

    public boolean kiemTraThiDat(){
        return getGPA()>=5;
    }

    public boolean kiemTraCungNgaySinh(Student OtherStudent){
        return getBirthday().equals(OtherStudent.Birthday);
    }
}
