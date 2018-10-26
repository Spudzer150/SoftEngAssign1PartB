package ie.nuigalway.berry.StudentSysDriver;

import ie.nuigalway.berry.studentRegSys.*;
import org.joda.time.*;


public class Driver {
	
	
	public static void main(String args[]){
		
		Course CS = new Course("CS&IT", LocalDate.parse("2018-9-1"), LocalDate.parse("2019-5-30"));
		
		Module programming = new Module("Programming", 63);
		Module networking = new Module("Networks", 79);
		Module maths = new Module("Maths", 04);
		
		CS.setModules(programming);
		CS.setModules(networking);
		CS.setModules(maths);
		
		Student James = new Student("James Smyth", 29, LocalDate.parse("1990-07-12"), 9446, CS);
		Student Alan = new Student("Alan Turing", 19, LocalDate.parse("1999-12-19"), 8764, CS);
		Student Hannah =  new Student("Hannah Long", 24, LocalDate.parse("1996-04-10"), 1002, CS);
		
		CS.setStudents(James);
		CS.setStudents(Alan);
		CS.setStudents(Hannah);
		
		programming.setCourse(CS);
		networking.setCourse(CS);
		maths.setCourse(CS);
		
		programming.setStudent(James);
		
		networking.setStudent(Alan);
		networking.setStudent(Hannah);
		
		maths.setStudent(James);
		maths.setStudent(Hannah);
		
		James.setModule(maths);
		James.setModule(programming);
		
		Hannah.setModule(networking);
		Hannah.setModule(maths);
		
		Alan.setModule(networking);
		
		System.out.println(CS + "\n\n");
		System.out.println(programming + "\n\n");
		System.out.println(maths + "\n\n");
		System.out.println(networking + "\n\n");
		System.out.println(James + "\n\n");
		System.out.println(Alan + "\n\n");
		System.out.println(Hannah + "\n\n");
		
		
		
		
	}



}
