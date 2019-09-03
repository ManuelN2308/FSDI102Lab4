class Example{
    public static void main(String args[]){

        Person p1 = new Person("Noah", 27);
 
        Employee e1 = new Employee(8572340,"Myk",37);
        Employee e2 = new Employee(1234560,"John",34);
        Employee e3 = new Employee(9876540,"Jane",28);

        System.out.println(p1.getName()  + " " + p1.getAge());


        System.out.println(e1.getName() + " " + e1.getAge() + " " + e1.getSalary());

        Animal a1=new Animal("Macchiatto");
        Animal a2=new Animal("Tiger");
        Animal a3=new Animal("Lion");

        a1.attack(e1);
        a2.attack(e2);
        a3.attack(e3);
    }
}