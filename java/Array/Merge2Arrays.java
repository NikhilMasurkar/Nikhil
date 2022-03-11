 public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int []b= {6,7,8,9,10};
        int c_length=a.length+b.length;
        int []c=new int[c_length];

        for(int i=0;i< a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
