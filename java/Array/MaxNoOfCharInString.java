public static void main(String[] args) {
        String s = "Hi this is Nikhil Masurkar ";
        int []arr=new int[256];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]=arr[s.charAt(i)]+1;
        }
        int max=-1;
        char c=' ';
        for(int i=0;i<s.length();i++){
            if(max<arr[s.charAt(i)]){
                max=arr[s.charAt(i)];
                c=s.charAt(i);
            }
        }
        System.out.println("the max repeated char is ("+c+ ") and the frequency is "+max);
    }
