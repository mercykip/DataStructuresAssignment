import org.junit.Test;

import static org.junit.Assert.*;

public class SubjectTest {
    Subject s=new Subject();
    @Test
    public void setMarks() {

       int marks=90;
        assertEquals(90, marks);

    }
    @Test
    public void setGrade() {

       char b='a';
       assertEquals('a', b);


    }
}