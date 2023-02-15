package arraylist;

public class CollegeStudent {
    private String studentNum;
    private String name;
    private int age;
    private String classInfo;

    public CollegeStudent() {
    }

    public CollegeStudent(String studentNum, String name, int age, String classInfo) {
        this.studentNum = studentNum;
        this.name = name;
        this.age = age;
        this.classInfo = classInfo;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(String classInfo) {
        this.classInfo = classInfo;
    }
}
