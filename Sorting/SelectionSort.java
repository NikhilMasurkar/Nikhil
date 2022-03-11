  public static void main(String[] args) {
      //  Scanner sc=new Scanner(System.in);
        // Selection sort for interger array
            int [] num= {38,52,9,18,6,62,13};
        int smallest; int temp;
        for(int i=0;i<num.length;i++){
            smallest=i;
            for(int j=i+1;j<num.length;j++){
                if(num[j] < num[smallest]){
                    smallest = j;
                }
            }
            temp=num[i];
            num[i]=num[smallest];
            num[smallest]=temp;
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        // Selection sort for string array
           /* String[]num={"sandeep","raju","senorita","nikhil","amit","bhushan",};
            int smallest; String temp="";
            for(int i=0;i<num.length;i++){
                smallest=i;
                for(int j=i+1;j<num.length;j++){
                    if(num[j].compareTo(num[smallest])<0){
                        smallest = j;
                    }
                }
                temp=num[i];
                num[i]=num[smallest];
                num[smallest]=temp;
            }
            for(int i=0;i<num.length;i++){
                System.out.print(num[i]+" ");*/
            }
