

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	private int  rno;
	private String name;
	private String course;
	private int age;
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	Student(int rno, String name, String course, int age){
		this.rno = rno;
		this.name= name; 
		this.course = course;
		this.age = age;
	}
	
}

public class prac1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> ar = new ArrayList<Student>();
		
		for(int i= 0; i<21; i++) {
			
			
			System.out.println(" record no: " + (i+1));
			
			System.out.print("enter the rno:" );
			int r = sc.nextInt();
			System.out.println(" enter name: ");
			String n = sc.nextLine();
			sc.next();
			System.out.println("Enter the course: ");
			String c = sc.nextLine();
			sc.next();
			System.out.print("Enter the age: ");
			int a= sc.nextInt();
			
			
			Student st = new Student(r, n , c, a);
			ar.add(st);
		
		}
		
		System.out.println("Enter the roll no to search");
		int rno_search = sc.nextInt();
		
		for(Student s:ar) {
			if(s.getRno() == rno_search) {
				System.out.println(s.getName()+ " " + s.getCourse()+ " "+ s.getAge()+" " + s.getAge());
			}
		}
	}
}
