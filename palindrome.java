class palindrome{
    public static void main(String arg[]){
        int rem,sum=0,temp;
        int n=454; //check if palindrome

        temp=n;
        while(n>0){
            rem=n%10;
            sum = (sum*10) + rem;
            n=n/10;
        }
        if(temp==sum){
        System.out.println(temp+" is a palindrome Number");
        }else{
        System.out.println(temp+" is not a palindrome");
        }
        
    }
    
}