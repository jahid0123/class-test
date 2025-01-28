public class Student {

    private int stdID;
    private String stdName;
    private String stdClass;
    private int stdAge;
    private String classTeacher;
    private Double mark;


    public Student(int stdID, String stdName, String stdClass, int stdAge, String classTeacher, Double mark){

        this.stdID = stdID;
        this.stdName = stdName;
        this.stdClass= stdClass;
        this.stdAge = stdAge;
        this.classTeacher=classTeacher;
        this.mark=mark;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdClass() {
        return stdClass;
    }

    public void setStdClass(String stdClass) {
        this.stdClass = stdClass;
    }

    public int getStdID() {
        return stdID;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public int getStdAge() {
        return stdAge;
    }

    public void setStdAge(int stdAge) {
        this.stdAge = stdAge;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "============Student Information===============\n" +
                "ID = " + stdID +
                "\nName = " + stdName +
                "\nClass = " + stdClass +
                "\nAge=" + stdAge +
                "\nClass Teacher= " + classTeacher +
                "\nmark= " + mark;
    }

    public void display(){

        System.out.println("ID: "+ stdID);
        System.out.println("Name: "+stdName);
        System.out.println("Class: "+stdClass);
        System.out.println("Age: "+stdAge);
        System.out.println("Class Teacher: "+classTeacher);
        System.out.println("Marks: "+mark);
        System.out.println("=====================================");
    }
}

