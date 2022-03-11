 public static void main(String[] args) {
        int []a={4,5,8,6,2,1,7};
        int temp=0;
        for(int i=0;i< a.length;i++){
            temp=a[i];
            int j=i-1;
            while(j>=0 && temp<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }

    }
