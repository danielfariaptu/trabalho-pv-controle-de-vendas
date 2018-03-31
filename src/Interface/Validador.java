package Interface;


public class Validador {
 
    public static boolean isCharNumber(char c){
        String num = "0123456789";
        return num.contains(c + "");
    }
    
    public static boolean isNumber(String num){
        char[] aux = num.toCharArray();
        boolean result = true;
        
        for (int i = 0; i< aux.length; i++){
            if(!(aux[i] >= '0' && aux[i] <='9')){
                result = false;
                break;
            }
        }
        return result;
    }
}
