public class AsalSayilar {
    public static void main(String[] args) {
        int sum=0;
        for (int i=2;i<=100;i++){
            sum=0;
            for (int k=1;k<=i;k++){
                    if (i%k==0){
                    sum+=k;

                }

            }
            if(sum==i+1){
                System.out.print(i+" ");
            }
        }
    }
}
