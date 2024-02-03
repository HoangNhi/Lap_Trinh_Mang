package java37;

public class Classroom {
    private String ClassName, Faculty;
    public Classroom() {}
    public Classroom(String ClassName, String Faculty){
        this.ClassName = ClassName;
        this.Faculty = Faculty;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }
}
