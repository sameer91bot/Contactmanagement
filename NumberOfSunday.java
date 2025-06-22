import java.util.*;
public class NumberOfSunday {
       public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      String startday=sc.next();
      String days[] ={ "sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
      int index=-1;
      for(int i=0;i<7;i++){
          if(days[i].equals(startday)){
              index=i;
              break;
          }
      }
      int count =0;
      for(int i=0;i<n;i++){
          int newindex =(index+i)%7;
          if(days[newindex].equals("sunday")){
              count++;
          }
      }
        System.out.print(count );   
     
      }   
}
        
       
       

       
