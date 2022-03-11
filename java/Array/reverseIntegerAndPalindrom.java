 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=121;
        int temp=a;
        int rev=0,rem;
        while(temp != 0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        System.out.print(rev+" ");
        if(a==rev){
            System.out.println(" palindrom ");
        }else{
            System.out.println(" not palindrom ");
        }
    }
