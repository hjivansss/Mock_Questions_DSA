import java.lang.String;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your string");
        String s=in.nextLine();
        removeFunction(s);
    }

    public static void removeFunction(String s){
        int n = s.length();
        int k=0;
        char[] arr=new char[n];//Array to copy the characters of the String s
        for(int j=0;j<n;j++){//Copy
            arr[j]=s.charAt(j);
        }
        int scharCount=0;
        for(int i=0;i<n;i++){//Shifting the characters(with no special characters to its left)to the right side of the array
            if(arr[i]!='*'&& arr[i]!= '#' && arr[i] != '$' && arr[i]!=' ' ){
                           if (scharCount<=0)
                           { arr[k]=arr[i];
                               k=k+1;
                               }else{
                               scharCount--;
                               }
            } else if(arr[i]== ' '){
                arr[k]=' ';
                k++;
            }else{
                scharCount = scharCount + 1;
            }
        }
        char[] arr_new=new char[k];//Array to copy the required shifted characters from the above array
        for(int i=0;i<k;i++){
            arr_new[i]=arr[i];
        }
        String str1=String.valueOf(arr_new);//Converting the required array to string
        System.out.println("Required String:"+str1);
    }
}