class Student{
    int marks;
    String name;
}

public class ArrayOnObj{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Saurabh";
        s1.marks = 94;

        s2.name = "pragya";
        s2.marks = 95;

        s3.name = "SP";
        s3.marks = 100;

        Student [] student = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for(Student stud : student){
            System.out.println(stud.name +", "+ stud.marks);
        }
    }
}