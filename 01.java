import java.util.Scanner;
class Student{
    private int student;
    private String name;
    private int daysAttened;
    
    public Student(int student,String name,int daysAttened){
        this.name=name;
        this.student=student;
        this.daysAttened=daysAttened;
    }

    public int getStudent(){
        return student;
    }
    public String getName(){
        return name;
    }
    public int getDaysAttended(){
        return daysAttened;
    }

    public setStudent(int student){
        this.student=student;
    }
    public setName(String name){
        this.name=name;
    }
    public setDaysAttended(int daysAttened){
        this.daysAttened=daysAttened;
    }
}
class Classroom{
    Student[] studentarr=new Student[10];
    int numberofStudentAdded=studentarr.length;

    public Classroom(int student,String name,int daysAttened) {
        int i=0
        studentarr[i]=new Student(student,name,daysAttened);
        i++;
    }
    
    void Update(int student){
        Scanner sc=new Scanner(System.in)
        for (int i = 0; i < numberofStudentAdded; i++) {
       if(strings[i] = String.valueOf(student)){
        System.out.println("Input number of days attended : " );
        daysAttened=sc.nextInt();
       }
       else{
        System.out.println("Student ID not found !");
       }
    }
        
    }

    void Display(){
        System.out.println("Student Details");
        System.out.println("");
        System.out.println("ID      name    number of days attended");
        for(int i = 0; i < numberofStudentAdded; i++{
            System.out.println(studentarr[i]);
        })
    }

}

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    Classroom c1=new Classroom(101,"Alice Smith", 12);
    Classroom c2=new Classroom(102,"Bob Jons", 15);
    Classroom c3=new Classroom(103,"Carol lee", 10);

    System.out.println("Input Student id to update :");
    Update(sc.nextInt());
    Display();
}