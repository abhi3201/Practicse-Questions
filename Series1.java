package Mentee;

public class Series1 {
    public static void main(String[] args) {
        System.out.println(series(4));

    }
    static int series(int n){
        int i=1;
        int sum=-1;
        int item=1;
        while(i<n){
            item=4*item-1;
            if(i%2==0){
                sum=sum-item;
            }
            else{
                sum=sum+item;
            }
            i++;
        }
        return sum;
    }
}
