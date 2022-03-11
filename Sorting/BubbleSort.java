 public static void main(String[] args) {
        int []num={39,20,50,30,1,5,2};
        int temp;

        for(int i=0;i<num.length;i++) {

            for (int j = 0; j < num.length - 1 - i; j++) {
                /*we use length-1-i its givs us same result but we want efficient and fast result thats why we use that -i
                 and we have a lots of element to sort and sorting complete before loop excicution we use one flag logic for it...

                int flag=0;*/
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    // flag =1;
                }
            }
            /*if (flag==0){
                break;
              }*/
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
