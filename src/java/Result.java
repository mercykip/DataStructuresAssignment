import java.util.Collection;
import java.util.Iterator;

public class Result {

    //collection for storing student information
    Collection<Student> students;

    public Result(Collection<Student> students) {
        this.students = students;
    }

    public Collection<Student> getStudents() {
        return students;
    }

    public String viewDetails() {
        Iterator iterator = getStudents().iterator();
        String output = "";
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            output += student.toString();
        }
       if( output.isEmpty()){
           System.out.println("User details is empty");
       }

        return output;
    }
}
