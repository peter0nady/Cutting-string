/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuttingString;
import java.util.StringTokenizer;
public class CuttingString 
{
    public static void Tokenizer()
    {
         StringTokenizer str=new StringTokenizer("10.5.30.1");
        while (str.hasMoreTokens()) 
        {
         System.out.println(str.nextToken("."));
       }
    }
   public  static void split()
    {
       String  str= "10,30,2,40";
       String[] x= str.split(","); 
       System.out.print("the length of string ");
       System.out.println(x.length);
        for(int i=0 ; i<x.length;i++)
        {
            System.out.println(x[i]);
        }  
    }
    public static void main(String[] args) 
    {
        // split(); 
         Tokenizer();

       

     
        
        
        
    }
    
}
