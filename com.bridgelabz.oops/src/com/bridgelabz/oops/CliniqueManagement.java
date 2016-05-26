package com.bridgelabz.oops;
import com.bridgelabz.docs.Doctors;
import com.bridgelabz.patient.Patients;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import com.bridgelabz.util.Utility;
public class CliniqueManagement 
{
	Utility u1=new Utility();
	ArrayList<Doctors> doctorsList=new ArrayList<Doctors>();
	ArrayList<Patients> patientsList=new ArrayList<Patients>();
	CliniqueManagement clinique1=new CliniqueManagement();
	Patients ps=new Patients();
	Doctors ds=new Doctors();
	int count=0;
	public void menuDisplay()
	{
		String close;
		//Display  menu
		do{
		System.out.println("Clinic..Menu");
		System.out.println("1: Enter Doctors Detials");
		System.out.println("2: Enter Patients Detils");
		System.out.println("3: Search Patients Detils");
		System.out.println("4: Search Doctors Detils");
		System.out.println("5: Prints all Doctors Detils");
		System.out.println("6: Prints all Patient Detils");
		System.out.println("7: Take Appoientment");
		System.out.println("Enter Your Choice");
		clinique1.menuList(clinique1.u1.inputInteger());
		System.out.println("Enter E to Exit");
		close=clinique1.u1.inputString();
		}while(!close.equalsIgnoreCase("E"));
	}
	//this function call appropriate function based on user choice. 
		public void menuList(int choose)
		{
			switch(choose){
			case 1: doctorsList.add(new Doctors());
					break;
			case 2: patientsList.add(new Patients());
					break;
			case 3: searchPatientMenu();
					break;
			case 4: searchDoctorsMenu();
					break;
			case 5: System.out.println("Id   Name  Specialization   availability");
					System.out.println(doctorsList);
					break;
			case 6: System.out.println("Name Id   MobileNumber  Age");
					System.out.println(patientsList);
					break;
			case 7: takeAppoientment();
					break;
			}//end of loop
		}//end of method
		//search patient menu.
		public void searchPatientMenu()
		{
			System.out.println("Search for Patient Detail");
			System.out.println("1 :Mobile Number");
			System.out.println("2 :Id");
			System.out.println("3 :Age");
			System.out.println("Enter Your Choice");
			searchPatient(u1.inputInteger());
		}
		//patient menu.
		public void searchPatient(int choose)
		{
			switch(choose)
			{
			case 1: System.out.print("Enter the Patient Mobile Number :");
				System.out.println(ps.searchPatientMobileNumber(patientsList,u1.inputString()));
				break;
			case 2: System.out.print("Enter the Patient Id :");
				System.out.println(ps.searchPatientId(patientsList,u1.inputInteger()));
				break;
			case 3: System.out.print("Enter the Patient Age :");
				System.out.println(ps.searchPatientAge(patientsList,u1.inputInteger()));
				break;
			}//end of switch
		}//end of method
		//search patient menu.
		public void searchDoctorsMenu()
		{
			System.out.println("Search for Doctor Detail ");
			System.out.println("1 :Name");
			System.out.println("2 :Id");
			System.out.println("3 :Specialization");
			System.out.println("4 :Availability");
			System.out.println("Enter Your Choice");
			searchDoctors(u1.inputInteger());
		}
		public void searchDoctors(int choose)
		{
			System.out.println();
			switch(choose)
			{
			case 1: System.out.print("Enter the Doctor Name :");
				System.out.println(ds.searchDoctorName(doctorsList,u1.inputString()));
				break;
			case 2: System.out.print("Enter the Doctor Id :");
				System.out.println(ds.searchDoctorId(doctorsList,u1.inputInteger()));
				break;
			case 3: System.out.println("Enter the Doctor Specialization :");
				System.out.println(ds.searchDoctorSpecialization(doctorsList,u1.inputString()));
				break;
			case 4: System.out.println("Enter Availability of Doctor");
				System.out.println(ds.searchDoctorAvailability(doctorsList,u1.inputString()));
				break;
			}
		}//end of method
		//Take aAppointment with doctor.
		public void takeAppoientment()
		{
				System.out.print("Enter the doctor Id :");
				Integer docId =u1.inputInteger();
				ArrayList<Doctors> doctorId;
				doctorId=ds.searchDoctorId(doctorsList,docId);
						if((docId.equals(doctorId)==true))
			            {
							          SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
							          Calendar calendar = Calendar.getInstance();
			 				          count++;
							          System.out.println("count value is :"+count);
							          if(count <= 5)
						    	          {
							        	calendar.add(Calendar.DAY_OF_MONTH, 1);
							        	String tmrwDate = sdf.format(calendar.getTime());
							        	System.out.println("your appointment is scheduled at = "+tmrwDate);
							            }
							            else
					 		               {
			              					calendar.add(Calendar.DAY_OF_MONTH, 2);
			              					String tmrwDate2 = sdf.format(calendar.getTime());
			              					System.out.println("your appointment is scheduled at "+tmrwDate2);
							                }
			            }
		}//end of method
	public static void main(String args[])throws Exception
	{
		CliniqueManagement clinique2=new CliniqueManagement();
		clinique2.menuDisplay();
	}
}