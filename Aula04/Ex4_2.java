package Aula04;
public class Ex4_2 {
    public static void main(String[] args){
        String frase = "  2  9 ua 22   mari  a";
        String frase1 = "rever";

        System.out.printf("A frase tem %d digitos \n",countDigit(frase));
        System.out.printf("A frase tem %d espaços \n",countSpaces(frase));
        System.out.printf("A frase só tem minúsculas? %b \n",minusculas(frase));
        System.out.printf("A frase sem espaços fica %s\n",onlyaSpace(frase));
        System.out.printf("A frase é um palindrome? %b \n",isPalindrome(frase1));
    }

    public static int countDigit(String frase){
        int digitos = 0;
        for (int i = 0; i <frase.length(); i++){
            if(Character.isDigit(frase.charAt(i))){digitos++;}
        }
        return digitos;
    }

    public static int countSpaces(String frase){
        int espaços = 0;
        for(int i= 0; i <frase.length(); i++){
            char letra = frase.charAt(i);
            if(letra == ' '){  espaços++;}
        }
        return espaços;
    }

    public static boolean minusculas(String frase){
        int i=0;
        boolean minusculas = true;
        while(i <frase.length()){
            if(Character.isUpperCase(frase.charAt(i))){
                minusculas = false;
                break;                
            }
            i++;
        }
        return minusculas;
    }

    public static String onlyaSpace(String frase){
        frase = frase.replaceAll("\\s+", " ");
        return frase;
    }

    public static boolean isPalindrome(String frase){
        int total = (int)frase.length()/2;
        boolean palindrome = true;
        int j = frase.length() -1;
        for(int i=0; i<total; i++){
            char inicio  = frase.charAt(i);
            char fim = frase.charAt(j);
            if(inicio != fim){
                palindrome = false;
                break;
            }
            j--;
        }
        return palindrome;
    }
}
