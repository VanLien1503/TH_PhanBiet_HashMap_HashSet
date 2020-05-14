import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",23,"HN");
        Student student2 = new Student("Hung",22,"HN");
        Student student3 = new Student("Nam",24,"HN");
        Student student4 = new Student("Phi",19,"HN");
        Student student5 = new Student("Nam",20,"HN");

        Map<Integer,Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student4);
        studentMap.put(5,student5);

        for (Map.Entry<Integer,Student>student:studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println();
        Set<Student>students=new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student5);
        for (Student student:students){
            System.out.println(student.toString());
        }
    }
}
