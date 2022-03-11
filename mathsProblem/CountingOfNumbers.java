public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int positive=0,negative=0,zero=0;
        System.out.println("Enter 1 continue or enter 0 to end ");
        int a=sc.nextInt();

        while(a == 1){
            System.out.println("Enter the number:- ");
            int number=sc.nextInt();
            if(number>0){
                positive++;
            }else if (number<0){
                negative++;
            }else{
                zero++;
            }
            System.out.println("Enter 1 continue or enter 0 to end");
            a =sc.nextInt();
        }
        System.out.println("positive: "+positive);
        System.out.println("Negative: "+negative);
        System.out.println("zero: "+zero);
