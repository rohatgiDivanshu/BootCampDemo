package DesignPattern;


class student {
    private String name;
    private Integer rollNo;
    private Integer marks;
    private String course;
    private String gender;
    private boolean isOptedForSubject;

    public student(studentBuilder studentBuilder) {
        name = studentBuilder.getName();
        rollNo = studentBuilder.getRollNo();
        marks = studentBuilder.getMarks();
        course = studentBuilder.getCourse();
        gender = studentBuilder.getGender();
        isOptedForSubject = studentBuilder.isOptedForSubject();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public boolean isOptedForSubject() {
        return isOptedForSubject;
    }

    public void setOptedForSubject(boolean optedForSubject) {
        isOptedForSubject = optedForSubject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ",rollNo=" + rollNo +
                ",course=" + course +
                ",marks=" + marks +
                ",gender=" + gender +
                ",isOptedForSubject=" + isOptedForSubject +
                '}';
    }

}

class studentBuilder {
    private String name;
    private Integer rollNo;
    private Integer marks;
    private String course;
    private String gender;
    private boolean isOptedForSubject;

    public studentBuilder(String name, Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getGender() {
        return gender;
    }

    public studentBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getName() {
        return name;
    }

    public studentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public studentBuilder setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public Integer getMarks() {
        return marks;
    }

    public studentBuilder setMarks(Integer marks) {
        this.marks = marks;
        return this;
    }

    public String getCourse() {
        return course;
    }

    public studentBuilder setCourse(String course) {
        this.course = course;
        return this;
    }

    public boolean isOptedForSubject() {
        return isOptedForSubject;
    }

    public studentBuilder hasOptedForSubject(boolean optedForSubject) {
        isOptedForSubject = optedForSubject;
        return this;
    }

    public student build() {
        return new student(this);
    }
}


public class Question4 {
    public static void main(String[] args) {
        student student = new studentBuilder("Divanshu", 3025)
                .hasOptedForSubject(true)
                .setCourse("MCA")
                .setMarks(90)
                .setGender("Male")
                .build();
        System.out.println(student);
    }

}
