package database;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class mainmethod {

	static List<studentdatabase> li=new LinkedList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		char ch='y';
		do {
			System.out.println("who are you?");
			System.out.println("enter 1 for teacher");
			System.out.println("enter 2 for student");
			int n=sc.nextInt();
			if(n==1) {
				System.out.println("Do you want to add or update in student database");
				System.out.println("enter 1 to add");
				System.out.println("enter 2 to update");
				int n1=sc.nextInt();
				if(n1==1) {
					System.out.println("how many students do you want to add?");
					int noofstudents=sc.nextInt();
					for(int i=0;i<noofstudents;i++) {
						System.out.println("enter id,name,age,gender,branch and mark");
						int id=sc.nextInt();
						String name=sc.next();
						int age=sc.nextInt();
						String gender=sc.next();
						String branch=sc.next();
						int mark=sc.nextInt();
						studentdatabase s=new studentdatabase(id,name,age,gender,branch,mark);
						li.add(s);
					}
				}
				if(n1==2) {
					System.out.println("Enter student id whose data you want to update");
					int id=sc.nextInt();
					int check=getIndex(id);
					if(check==-1) 
						System.out.println("No student with this id is present in the database");
				    else {
					   System.out.println("how many updations you want to make on student id:"+id);
					   int upd=sc.nextInt();
					   for(int i=0;i<upd;i++) {
						   System.out.println("Enter 1 to update student name:");
						   System.out.println("enter 2 to update student age");
						   System.out.println("Enter 3 to update student gender");
						   System.out.println("Enter 4 to update student branch");
						   System.out.println("enter 5 to update student mark");
						   int choice=sc.nextInt();
						   switch(choice) {
						   case 1:
							   System.out.println("enter updated name");
							   String name=sc.next();
							   li.get(check).setName(name);
							   break;
						   case 2:
							   System.out.println("enter updated age");
							   int age=sc.nextInt();
							   li.get(check).setAge(age);
							   break;
						   case 3:
							   System.out.println("enter updated gender");
							   String gender=sc.next();
							   li.get(check).setGender(gender);
							   break;
						   case 4:
							   System.out.println("enter updated branch");
							   String branch=sc.next();
							   li.get(check).setBranch(branch);
							   break;
						   case 5:
							   System.out.println("enter updated mark");
							   int mark=sc.nextInt();
							   li.get(check).setMark(mark);
							   break;
							 default :
								 System.out.println("Wrong input");
						   }
					   }
					   System.out.println("Updation Sucessful");
				   }
					
			  }
			}
			if(n==2) {
					System.out.println("ENTER ID");
					int id=sc.nextInt();
					System.out.println("ENTER PASSWORD");
					String pw=sc.next();
					int check=getIndex(id);
					String str="";
					if(check!=-1) {
						str=li.get(check).getName();
						str=str.substring(0, 4);
					String reg="^"+str+"[0-9]{4}$";
					Pattern p=Pattern.compile(reg);
					Matcher m=p.matcher(pw);
						
					if(m.matches()) {
						System.out.println("Student Id:"+li.get(getIndex(id)).getId());
						System.out.println("Name:"+li.get(getIndex(id)).getName());
						System.out.println("Age:"+li.get(getIndex(id)).getAge());
						System.out.println("Gender:"+li.get(getIndex(id)).getGender());
						System.out.println("Branch:"+li.get(getIndex(id)).getBranch());
						System.out.println("Mark:"+li.get(getIndex(id)).getMark());
					 }
					else 
						System.out.println("you are not authorized to acess the database!");
					
				   }
					else
						System.out.println("you are not authorized to acess the database!");
					
			}
			System.out.println("Enter 'y' to continue");
			ch=sc.next().charAt(0);
			
		}while(ch=='y');
		
	
	}
	static int getIndex(int id) {
		for(int i=0;i<li.size();i++) {
			if(li.get(i).getId()==id)
			{
				return i;
			}
		}
		
		return -1;
  	}
}

