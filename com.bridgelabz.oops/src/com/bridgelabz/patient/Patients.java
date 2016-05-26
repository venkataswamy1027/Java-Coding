package com.bridgelabz.patient;
import com.bridgelabz.util.Utility;
import java.util.ArrayList;
public class Patients 
{
	public int id,age;
	public String mobileNumber,name;
	Utility u1=new Utility();
	Patients PatientsList=new Patients();
	public Patients()
	{
		System.out.println("Enter Patients Details ...");
		System.out.print("Enter Id: ");
		this.id=u1.inputInteger();
		System.out.print("Enter Mobile Number: ");
		this.mobileNumber=u1.inputString();
		System.out.print("Enter age: ");
		this.age=u1.inputInteger();
	}
	//search for Patients by mobileNumber.						
		public ArrayList<Patients> searchPatientMobileNumber(ArrayList<Patients> patientList,String mobileNumber)
		{
			ArrayList<Patients> temp=new ArrayList<Patients>();
			for(Patients patient:patientList)
			{
				if(patient.getmobileNumber().equals(mobileNumber)){
					temp.add(patient);
				}
			}
			return temp;
		}
		public String getmobileNumber()
		{
			return mobileNumber;
		}
		
	/*	//search for Patients by Name
		public ArrayList<Patients>searchPatientName(ArrayList<Patients>patientList,String name)
		{
			ArrayList<Patients> temp=new ArrayList<Patients>();
			for(Patients patient:patientList)
			{
				if(patient.getName().equals(name)){
					temp.add(patient);
				}
			}
			return temp;
		}*/
		public String getName()
		{
			return name;
		}
		//search for Patients by id.						
		public ArrayList<Patients> searchPatientId(ArrayList<Patients> patientList,int id)
		{
			ArrayList<Patients> temp=new ArrayList<Patients>();
			for(Patients patient:patientList)
			{
				if(patient.getId()==id){
					temp.add(patient);
				}
			}
			return temp;
		}
		public int getId()
		{
			return id;
		}
		//search for Patients by age.						
		public ArrayList<Patients> searchPatientAge(ArrayList<Patients> patientList,int age)
		{
			ArrayList<Patients> temp=new ArrayList<Patients>();
			for(Patients patient:patientList){
				if(patient.getAge()==age){
					temp.add(patient);
				}
			}
			return temp;
		}
		public int getAge()
		{
			return age;
		}
}
