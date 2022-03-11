public class luckyAndNonlucky{
    static boolean isLucky(int n){
        boolean []arr=new boolean[10];
        for(int i=0;i<10;i++){
            arr[i]=false;
        }
        while(n>0){
           int digit=n%10;

           if(arr[digit]){
               return false;
           }else {
               arr[digit]=true;
           }
           n=n/10;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1291, 897, 4566, 1232, 80, 700};

        for(int i=0;i<arr.length;i++){
            if(isLucky(arr[i])){
                System.out.println("the number is lucky "+arr[i]);
            }else{
                System.out.println("the number is not lucky "+arr[i]);
            }
        }
    }
