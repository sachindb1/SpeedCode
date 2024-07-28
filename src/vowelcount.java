public class vowelcount {
    public static void main(String[] args) {

        String input="Sachin Bansode";
        System.out.println("Number of vowels: " + countvowels(input));}
    public static int countvowels(String input) {
        int count = 0;
        String vowels = "AEIOUaeiou";
        for(char c: input.toCharArray()) {
            if(vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
    }

