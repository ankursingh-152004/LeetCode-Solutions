class Solution {
    public int trailingZeroes(int n) {
        int c=0;
    //First Approach
    while(n>0){
        n/=5;
        c+=n;

    }
    return c;
    }
}


// Second Appraoch        
//         int res=fact(n);
//         while(res>0){
//             if(res%10==0) {
//                 c++;
//                 res/=10;
//                 break;
//             }
//             res/=10;
//         }
//         return c;

//     }
//     public static int fact(int n){
//         int f=1;
//         if(n<=1) return 1;
//         for(int i=1;i<=n;i++){
//             f*=i;
//         }
//         return f;
//     }
// }