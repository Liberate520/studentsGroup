package students;

import students.studentGroup.StudyGroup;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.addStudent("Маша", 18);
        service.addStudent("Паша", 20);
        service.addStudent("Даша", 19);
        service.addStudent("Саша", 22);

        System.out.println(service.getInfo());

        service.sortByName();
        System.out.println(service.getInfo());

        service.sortByAge();
        System.out.println(service.getInfo());

        StudyGroup<Teacher> studyGroup = new StudyGroup<>();
    }
}
