package com.zhl;

public class test {
  public static void main(String[] args) {
        char[] str = {'c','p','p','j','a','v','a','p','y'};
        int offset = 25;
        rotateString(str,offset);
  }

  public static void rotateString(char[] str, int offset) {
    // write your code here
    if(offset <= 0){
      return ;
    }
    int i = 0;
    System.out.println(str.length - offset%str.length);

    while( i < (str.length - offset%str.length)){
      char m = str[0];
      for(int j = 0;j < str.length-1;j++){
        str[j] = str[j+1];
      }
      str[str.length-1] = m;
      i++;
     // System.out.print(str);
    }

  }
}
