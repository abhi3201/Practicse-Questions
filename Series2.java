package Mentee;

public class Series2 {
    public static void main(String[] args) {
        System.out.println(series(4));
    }
    static double series(int n){
        int i=1;
        double num=1,den=3;
        double sum=num/den;
        while(i<n){
            num=Math.pow(3,i);
            den=Math.pow(num,2);
            if(i%2==0){
                sum=sum-(num/den);
            }
            else{
                sum=sum+(num/den);
            }
            i++;
        }
        return sum;
    }
}
