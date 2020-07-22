import java.util.Collection;
import java.util.Iterator;

public class Student {
    String name, admissionNo;
    //collection for storing subjects for student
    Collection<Subject> subjects;


    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(String admissionNo) {
        this.admissionNo = admissionNo;
    }

    public Collection<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Collection<Subject> subjects) {
        this.subjects = subjects;
    }


 //   return string


    String getSubjectsOutput() {
        String output = "";
        Iterator iterator = getSubjects().iterator();
        while (iterator.hasNext()) {
            Subject subject = (Subject) iterator.next();
            output += subject.toString() + "\n";

        }
        return output;
    }


//return a string

    @Override
    public String toString() {
        return "[" + getName() + ", " + getAdmissionNo()+ ", " +  getSubjectsOutput() +  "]";

    }
}
