package String;

public class countVowel {
    static void countVowelandConsonant(String str){
        int vowel = 0;
        int consonant = 0;
        for(char i : str.toCharArray()){
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' ||
                    i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U' ){
                vowel++;
            } else{
                consonant++;
            }
        }
        System.out.println("Vowels = " + vowel);
        System.out.println("consonant = " + consonant);
    }
    public static void main(String[] args){
        String str = "UmeshGayakwad";
        countVowelandConsonant(str);
    }
}
