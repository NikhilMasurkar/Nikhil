public static void main(String[] args) {
        String str="Nikhil";
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            int count=0;
            for(int j=0; j<ch.length; j++){
                if(j<i && (ch[j]==ch[i])){
                    break;
                }
                if (ch[j]==ch[i]){
                    count++;
                }
            }
            if(count>0){
                System.out.println(ch[i]+"   -   "  +count+"   times  ");
