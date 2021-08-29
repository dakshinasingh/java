package stringfunctions;
public class SplitString {

    public static void main(String[] args) {
        String temp="Banasthali Vidyapith Rajasthan";
        String arr[]=temp.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
/*output:
Banasthali
Vidyapith
Rajasthan
*/