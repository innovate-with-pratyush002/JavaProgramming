import java.util.Arrays;
public class arrayreturn{
    public static int[] returnIndex(int[] arr,int target){
        int[] ind= new int[2];
       for(int i=0;i<arr.length;i++){
             int currEle= arr[i];
             for(int j=i+1;j<arr.length;j++){
                if(currEle+arr[j]==target){
                    ind[0]=i;
                    ind[1]=j;
                    return ind;
                }
             }
       }
       return null;
    }
    public static void main(String[] args){
        int[] arr={2,4,6,3,6};
        int target=9;
        System.out.println(Arrays.toString(returnIndex(arr,target)));
    }
}