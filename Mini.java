import java.util.*;
public class Mini {
    public static void main(String args[]){
        Scanner o=new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        int a[]={30,5,20,9};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(i+1!=a.length){
            int t=a[i+1]-a[i];

            if(t<min){
                min=t;
            }
        }
        }
        System.out.println(min);

    }
}
