
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//
  //Program to manage,students, teachers and results
            //1. get subjects to be done and add in collection(LinkedList)
        Scanner in=new Scanner(System.in);
            System.out.println("Enter number of subjects");
            int numSubjects = in.nextInt();
            LinkedList<Subject> subjects = new LinkedList<>();
            for (int i = 0; i < numSubjects; i++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter subject title");
                String title = scanner.nextLine();
                System.out.println("Enter subject teacher");
                String teacher = scanner.nextLine();
                //set the subject title and name of the teacher to subject object
                Subject subject = new Subject();
                subject.setSubjectName(title);
                subject.setTeacherName(teacher);
                // add to collection
                subjects.add(subject);
            }


        //2 .Enter number of students to register loop registration till required number is achieved
        // Get students name and registration number
        //create a collection  of students to help us print result using object of Result
        LinkedList<Student> students=new LinkedList<>();
        System.out.println("Enter number of students");
        int numStudents=in.nextInt();
        for (int i = 0; i < numStudents; i++) {
            Scanner sc = new Scanner(System.in);
            //enter student details
            System.out.println("Enter Student name");
            String name = sc.nextLine();
            System.out.println("Enter Student admission number");
            String adm = sc.nextLine();

           //we set the values to student object and add it to our collection(students)
            Student student = new Student();
            student.setName(name);
            student.setAdmissionNo(adm);

            // 3.we enter the student and marks in the respective subjects by looping
            // the collection of subjects
            //Create collection(subjects1) to store student subject with respective score and grade
            LinkedList<Subject> subjects1=new LinkedList<>();
            for (int j = 0; j < subjects.size(); j++) {
                Subject subject=subjects.get(j);
                Scanner scanner=new Scanner(System.in);
                System.out.println("Enter Student "+subject.getSubjectName()+"marks:");
                int marks = scanner.nextInt();
                char grade;
                //check grade
                if (marks >= 80 && marks <= 100) {
                    grade = 'A';
                } else if (marks >= 60 && marks <= 79) {
                    grade = 'B';
                } else if (marks >= 40 && marks <= 59) {
                    grade = 'C';
                } else if (marks >= 20 && marks <= 39) {
                    grade = 'D';
                } else {
                    grade = 'E';
                }

                // swap values
                Subject mySubject=new Subject();
                mySubject.setSubjectName(subject.getSubjectName());
                mySubject.setTeacherName(subject.getTeacherName());
                mySubject.setMarks(marks);
                mySubject.setGrade(grade);
                subjects1.add(mySubject);
            }

            student.setSubjects(subjects1);

            //push the student to a collection
            students.add(student);
        }


        //4. printing in Result class we stored in our collection
        Result result=new Result(students);
        System.out.println(result.viewDetails());
        /* Remove subject from a position 1*/
        subjects.remove(1);



    }
}
