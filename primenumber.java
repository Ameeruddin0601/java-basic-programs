// public class primenumber{
//     public static void main(String args[]){
//         int i,m=0,flag=0;
//         int n=67; //check if 3 is prime number
//         m=n/2;
//         if(n==0 || n==1){
//             System.out.println(n+" is not a prime number");
//         }else{
//             for(i=2;i<=m;i++){
//                 if(n%i==0){
//                     System.out.println(n+ " is not a prime number");
//                     flag = 1;
//                     break;
//                 }
//             }
//             if(flag==0){
//                 System.out.println(n+" is a prime number");
//             }
//         }
//     }
// }


//using methods
public class primenumber{
    static void checkprime(int n){
        int i,m=0,flag=0;
        m = n/2;
        if(n==0 || n==1){
            System.out.println(n + " is not a prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not a prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(n+" is a prime number");
            }
        }
    }

    public static void main(String args[]){
        checkprime(1);
        checkprime(3);
        checkprime(67);
    }
}
