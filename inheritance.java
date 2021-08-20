class college 
{
    student()
    {
       char name;
       int rollno;
       System.out.println("get name and roll number");
       Scanner a=new Scanner(System.in);
       Scanner b=new Scanner(System.in);
       name=a.nextString();
       rollno=b.nextInt();
       System.out.println("student name:"+name+"roll no:"+rollno);
    }
}
public class admin extends college
{
    int dob;
    System.out.println("get date of birth");
    Scanner c=new Scanner(System.in);
    dob=c.nextInt();
    System.out.println("name:"+name);
    System.out.println("roll no"+rollno);
    System.out.println("dob:"+dob);
}
 public static void main(String[] args)
  {
    
     college i=new college();
     i.student();
     admin j=new admin();
  }


