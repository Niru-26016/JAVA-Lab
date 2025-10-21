public class main{
    public static void main(String[] args) {
        student stu1=new student("Niru",3,'B');
        student stu2=new student("Gagan",2,'A');
        student stu3=new student("Yojith",1,'C');
        student[] students={stu1,stu2,stu3};
    for(student i:students ){
        System.out.printf("%s is %d class and got %c grade\n",i.Name,i.Class,i.Grade);
    }
    }
}