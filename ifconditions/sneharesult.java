class sneha{
public static void main(String[]args){
     int m1=75;
	int m2=95;
    int m3=35;
   int m4=64;
   int m5=31;
int avg=((m1+m2+m3+m4+m5)/5);
 System.out.println(avg);
if(avg>=90){
 System.out.println("Outstanding");

}
else if(avg>=75){

     System.out.println("Distinction");
}else if (avg>=60){
System.out.println("First Class");
}else if(avg>=35){
System.out.println("pass");
}else{
System.out.println("Fail");
}

}

}