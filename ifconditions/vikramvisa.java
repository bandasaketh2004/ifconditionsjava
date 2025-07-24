class vvisa{
public static void main(String[]args){
  int age=21;
  boolean passport=false;
  if(age>=18 && passport == true){
    System.out.println(" valid passport, visa application is accepted");
}
else if(age>=18 && passport == false){
System.out.println("no passport, application is rejected");
}
else{
System.out.println("visa not allowed");
}
}

}