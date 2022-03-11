 public static void main(String[] args) {
        String name = "nikhil is consider as a hardworking boy";

        String[] revWord = name.split(" ");

        String reverceString = "";

        for (int i = 0; i < revWord.length; i++) {
            String word = revWord[i];
            String reverceword = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reverceword = reverceword + word.charAt(j);
            }
            reverceString = reverceString + reverceword + " ";
        }
        System.out.println(reverceString);
    }
