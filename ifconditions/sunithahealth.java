class sunithahealth{
public static void main(String[]main){
 int age=15;
 boolean certificate=true;
 if(age>18 && age<45 && certificate == true){
  System.out.println("she can participate.");

}
else if(age<18 || age>45){
 System.out.println("participation not allowed.");
}
else if(certificate=false){
 System.out.println("participation denied.");
}
else{
 System.out.println("participation denied");
}
}
}