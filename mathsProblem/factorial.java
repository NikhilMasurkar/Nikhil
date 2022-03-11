 public static void main(String[] args) {
            int n=4;
             fact(n);

    }
    public static int fact(int a){
        int factorial=1;
        for(int i=1;i<=a;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return factorial;
    }
