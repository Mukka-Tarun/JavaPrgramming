import java.util.Scanner;
import java.io.*;
class VowelsFinder{
    public static void main(String args[]) throws Exception{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a vowel");
        char c = s.next().charAt(0);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        //String str = s.nextLine();
        String str = br.readLine();
        int l = str.length();
        int t = 0;
        if(c=='a'|c=='e'|c=='i'|c=='o'|c=='u'|c=='A'|c=='E'|c=='I'|c=='O'|c=='U'){
            for(int i=0;i<l;i++){
                if(str.charAt(i)==c)
                t=t+1;
            }
            System.out.println("No of times "+ c +" Ocurred in the given string is "+t);
        }else
        System.out.println("Not Applicable");
    }
}