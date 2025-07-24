class busticket{
 public static void main(String[]args){
   int distance=10;
   String day="Weekday"; 
    if(distance<50){
      System.out.println("50");
}
 else if(distance>50 && distance<100){
      System.out.println("100");

 
}else{
   switch(day){
     case "Weekday":System.out.println("200");break;
   case "weekend":System.out.println("300");break;
}
}

}
}