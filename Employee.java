import java.util.Scanner;
public class Employee
{
int eNo;
String eName;
double eSalary;
public void getdetails()
{
Scanner sc=new Scanner(System.in);
System.out.print("employee number:");
eNo=sc.nextInt();
System.out.print("name:");
sc.nextLine();
eName=sc.nextLine();
System.out.print("salary:");
eSalary=sc.nextDouble();
}
void display()
{
System.out.println("employee No:"+eNo);
System.out.println("name:"+eName);
System.out.println("salary amount:"+eSalary+"\n");
}
public static void main(String[]args)
{
System.out.println("\nenter the no.of employee's");
Scanner sc1=new Scanner(System.in);
int num=sc1.nextInt();
System.out.println("enter the employee details");
Employee arr[]=new Employee[num];
for(int i=0;i<num;i++)
{
arr[i]=new Employee();
arr[i].getdetails();
}
System.out.println("information of all the employees");
for(int i=0;i<num;i++)
arr[i].display();
boolean state=false;
System.out.println("enter the employee number to get details of a employee");
int num2=sc1.nextInt();
for(int i=0;i<num;i++)
{
if(arr[i].eNo==num2)
{
System.out.println("employee details");
arr[i].display();
}
}
}
}
