import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
        Scanner ch=new Scanner(System.in);
        String str1=ch.nextLine();
        int length=0;
        for(char charr:str1.toCharArray()){
            length++;
        }
        for(int i=0;i<length;){
            char str2=str1.charAt(i);
            if(i==0)
            {
                if(str2>='a'&&str2<='z'){
                System.out.print((char)(str2-32));
               }else{
                   System.out.print((char)(str2)); 
                }
                i++;
            }
            else if(str2-32 ==0){
                if(str1.charAt(i+1)>='a'&& str1.charAt(i+1)<='z'){
                    System.out.print((char)(str1.charAt(i+1)-32));
                }else{
                    System.out.print((char)(str1.charAt(i+1)));
                }
                i=i+2;;
               }
            else{
                System.out.print((char)(str2)); 
                i++;
            }
            
        }
    }
}
