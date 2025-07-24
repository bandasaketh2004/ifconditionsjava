class car{
  public static void main(String[]args){
     int carkm=3000;
  if(carkm >20000){
    System.out.println("it needs full service");
}
else if(carkm >10000 && carkm<20000){
  System.out.println("it needs semi-service");
}
else{
System.out.println("only general checkup needed");
}
}
}