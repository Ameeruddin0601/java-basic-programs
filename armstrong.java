import java.lang.Math;

class armstrong{
    public static void main(String args[]){
        int temp,digits=0,last=0,sum=0;
        int n=153;

        temp=n;
        //calculate number of digits to get degree
        while(temp>0){
            temp=temp/10;
            digits++;
        }
        temp=n;
        while(temp>0){
            last = temp%10;
            sum += (Math.pow(last,digits));
            temp = temp/10;
        }
        if(sum==n){
            System.out.println(n+" is a armstrong number");
        }
    }
}