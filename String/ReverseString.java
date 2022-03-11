 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder name=new StringBuilder(sc.nextLine());
        for(int i=0;i<name.length()/2;i++){
            //first Step for reverce the string is
            //1. creat the variable for first index and last
            int front=i;
            int back=name.length()-1-i;
            //2. then put that first i  ndex charector and last index char into  new char veriable
            char frontChar=name.charAt(front);
            char backChar=name.charAt(back);
            //3. then front char with last one and last char with first one,
            name.setCharAt(front,backChar);
            name.setCharAt(back,frontChar);
        }
        // print the string in reverse way.
        System.out.println(name);
    }
