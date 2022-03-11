public class mergesort {
    int [] array;
    int [] tempMeargeArray;
    int length;
    public static void main(String[] args) {
        int [] a= {48,36,13,52,19,94,21};
        mergesort ms=new mergesort();
        ms.sort(a);
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
    public void sort(int a []){
                    this.array=a;
                    this.length=a.length;
                    this.tempMeargeArray=new int[length];
                    dividearray(0,length-1);
    }
    public void dividearray(int lowerIndex,int higherIndex){
        if(lowerIndex<higherIndex){
            int middle=lowerIndex+(higherIndex-lowerIndex)/2;

            //recursion for array which is sort the array from lowerindex to the middle
            dividearray(lowerIndex,middle);

            //recursion for array which is sort the array from middle+1 to higherIndex
            dividearray(middle+1,higherIndex);

            mergeArrayInSorted(lowerIndex,middle,higherIndex);
        }
    }
    public void mergeArrayInSorted(int lowerIndex,int Middle,int HigherIndex){
        //now we put our array in to temp merge array;

        for(int i=lowerIndex;i<=HigherIndex;i++){
            tempMeargeArray[i]=array[i];
        }
        int i=lowerIndex;
        int j=Middle+1;
        int k=lowerIndex;

        while(i<=Middle && j<=HigherIndex){
            if(tempMeargeArray[i]<=tempMeargeArray[j]){
                array[k]=tempMeargeArray[i];
                i++;
            }else{
                array[k]=tempMeargeArray[j];
                j++;
            }
            k++;
        }
        while(i<=Middle){
            array[k]=tempMeargeArray[i];
            k++;
            i++;
        }
    }
