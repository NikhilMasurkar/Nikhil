 public static void main(String[] args) {
        int[]name={2,5,4,6,8,7};
        //min no and the max no prb//
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int element:name){
            if(element>max){
                max=element;
            }
            if(element<min){
                min=element;
            }
        }
        System.out.println("max number is "+ max);
        System.out.println("min no is "+min);

    }
