import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String name;
        int id = 0;
        int salary = 0;
        Teacher teacher;


        List<Teacher> teacherList = new ArrayList<>();


        for (int i = 0; i < 2; i ++){

            System.out.print( "Nombre:");
             name = scanner.next();


            System.out.print( "Id:");
            id = scanner.nextInt();

            System.out.print( "Salario:");
            salary = scanner.nextInt();
            System.out.println();

            teacher = new Teacher(id, name, salary);
            teacherList.add(teacher);


        }

        System.out.println(teacherList.get(0).toString());
/*
       Teacher  teacher = new Teacher(id, name, salary);
        System.out.println(teacher.toString());


        /*
        Teacher Lizzy = new Teacher(1, "Lizzy",500 );
        Teacher Melissa = new Teacher(2,"Melissa", 700);
        Teacher John = new Teacher(3,"John", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Lizzy);
        teacherList.add(Melissa);
        teacherList.add(John);


        Student Mary = new Student(1,"Mary",4);
        Student Lou = new Student(2,"Lou",10);
        Student Brad = new Student(3,"Brad",6);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Mary);
        studentList.add(Lou);
        studentList.add(Brad);

        School ghs = new School(teacherList, studentList);

        Teacher Megan = new Teacher(8,"Megan", 900);
        ghs.addTeacher(Megan);


        Mary.payFees(5000);
        Lou.payFees(6000);
        System.out.println("GHS has earned $:"+ ghs.getTotalMoneyEarned());

        System.out.println("-Making GHS pay salary-");
        Lizzy.receiveSalary(Lizzy.getSalary());
        System.out.println("GHS has spent for salary to: "+Lizzy.getName()
                +"-- and now has: $ "+ghs.getTotalMoneyEarned() );

        Melissa.receiveSalary(Melissa.getSalary());
        System.out.println("GHS has spent for salary to: " + Melissa.getName()
        + "-- and now has: $ "+ghs.getTotalMoneyEarned());

        System.out.println(Lou);

        Lizzy.receiveSalary(Lizzy.getSalary());
        System.out.println(Lizzy);
*/

    }
}
