import java.util.Scanner;

class LearningSystem{

    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Type the name: ");
       String n=sc.nextLine();
       String g=sc.nextLine();
       String id=sc.nextLine();
       int a=sc.nextInt();

        Student student1= new Student(n,a,id,g);
        //Student student2 = new Student("Noah",27,"89759","Male");

        student1.printinfo();
        //student2.printinfo();
    
    }
}