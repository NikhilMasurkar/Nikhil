 public static void main (String []args){
            Scanner sc= new Scanner(System.in);
            String words= sc.next();

            for(int i=0;i<words.length();i++){
                if(Character.isUpperCase(words.charAt(i))){
                    System.out.print(words.charAt(i));
                }
            }
