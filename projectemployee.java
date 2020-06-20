//import java.util.Scanner;
public class projectemployee{
public static void main(String[] args){
//Scanner sc=new Scanner(System.in);
int[] empid=new int[]{1001,1002,1003,1004,1005,1006,1007};
String[] empname=new String[]{"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
String[] joindate=new String[]{"01/0/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"};
String[] Designationcode=new String[]{"e","c","k","r","m","e","c"};
String[] dept=new String[]{"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
int[] basic=new int[]{20000,30000,10000,12000,50000,23000,29000};
int[] hra=new int[]{8000,12000,8000,6000,20000,9000,12000};
int[] it=new int[]{3000,9000,1000,2000,20000,4400,10000};
int i;
String des="None";
int salary=0;
for(String j:args){
if((Integer.parseInt(j)<1000)||(Integer.parseInt(j)>1007)){
System.out.println("Employee "+j+"is not there");
}
else{
for(i=0;i<7;i++){
if(empid[i]==Integer.parseInt(j)){
if(Designationcode[i]=="e"){
des="Engineer";
salary=basic[i]+hra[i]+20000-it[i];
}
else if(Designationcode[i]=="c"){
des="Consultant";
salary=basic[i]+hra[i]+32000-it[i];
}
else if(Designationcode[i]=="k"){
des="Clerk";
salary=basic[i]+hra[i]+12000-it[i];
}
else if(Designationcode[i]=="r"){
des="Receptionalist";
salary=basic[i]+hra[i]+15000-it[i];
}
else if(Designationcode[i]=="m"){
des="Manager";
salary=basic[i]+hra[i]+40000-it[i];
}
System.out.println("\n\n");
System.out.println("Emp no.    Emp Name   Department   Designation   Salary");
System.out.println("\n");
System.out.println(empid[i]+"        "+empname[i]+"      "+dept[i]+"       "+des+"     "+salary);
}}}}
}
}