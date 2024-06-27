import java.util.*;
public class Dis {
    public static void main(String args[]){
        Scanner o=new Scanner(System.in);
        int a[]={2,3,4};
        int n=a.length;
        Arrays.sort(a);
        int count=0;
        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){
                if(j+1!=n){
                    if(a[i]+a[j]==a[j+1]){
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}
