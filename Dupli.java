import java.util.*;
public class Dupli {
    public static void main(String args[]){
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=o.nextInt();

        int temp[]=new int[100];
        Arrays.fill(temp,0);

        for(int i=0;i<n;i++){
            temp[a[i]]++;
        }
        String res="";
        int count=0;
        for(int i=0;i<n;i++){
            if(temp[a[i]]>1){
            if(!res.contains(Integer.toString(a[i]))){
             res+=Integer.toString(a[i])+" ";
               count++;
            }

            }
        }
        System.out.println(res);
        System.out.println(count);

    }
}
