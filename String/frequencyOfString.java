 public static void main(String[] args) {
        String str = "aaacccdedffee";
        char []arr=str.toCharArray();
        Arrays.sort(arr);
        int n = str.length();
        int count = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                System.out.print(arr[i-1] + "" + (count)+" ");
                count=1;
            }
            else{
                count++;
            }
        }
        System.out.print(arr[n-1]+""+(count));
    }
