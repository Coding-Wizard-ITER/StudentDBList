package database;

import java.util.Collection;
import java.util.Iterator;

public class studentdatabase  {
	    int ID;
	    String name;
	    int age;
	    String gender;
	    String branch;
	    int mark;
	    public studentdatabase(int Id,String name,int age,String gender,String branch,int mark) {
	    	this.ID=Id;
	    	this.name=name;
	    	this.age=age;
	    	this.gender=gender;
	    	this.branch=branch;
	    	this.mark=mark;
	    }
	    
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getBranch() {
			return branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}

		public int getMark() {
			return mark;
		}

		public void setMark(int mark) {
			this.mark = mark;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
        public int getId() {
        	return ID;
        }
        public void setId(int id) {
        	this.ID=id;
        }
}
