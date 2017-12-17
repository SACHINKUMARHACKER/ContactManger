
/**
 * Write a description of class Solution here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.*;
public class Solution
{
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        HashMap<String,String> mp = new HashMap<String,String>();
        for(int i = 0; i<t;i++){
        String name = scan.next();
        int phone = scan.nextInt();
        mp.put(name,Integer.toString(phone));
        }
        while(scan.hasNext()){
        String s = scan.next();
        if(mp.containsKey(s)){
        System.out.println(s+"="+mp.get(s));
        }
        else{
        System.out.println("Not found");
        }
        }
    
    }
}
