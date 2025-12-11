package RomanToInteger;

public class RomanToInteger {
    public int romanToInt(String s) {
        int sum = 0;
      for(int i =0;i<s.length();i++){
          int currentValue = switcher(s,i);
          if (i+1<s.length()){
int nextValue=switcher(s,i+1);
if(currentValue<nextValue){
    sum-=currentValue;
}else {
    sum+=currentValue;
}
          }else {
              sum+=currentValue;

          }
      }
          return sum;
    }
 public static int switcher(String s,int value){
     switch (s.charAt(value)) {
         case 'I': return 1;
         case 'V': return 5;
         case 'X': return 10;
         case 'L': return 50;
         case 'C': return 100;
         case 'D': return 500;
         case 'M': return 1000;
         default: return 0;
     }
 }
}