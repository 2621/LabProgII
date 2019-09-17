public class CifraCesar {
    public String codCesar (String text, int n){
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)>= 'A' && text.charAt(i)<='Z'){
                int k = (int) ((text.charAt(i) - 'A') + n)%26;
                text.replace(text.charAt(i), (char) (k + 'A'));
            }

            if(text.charAt(i)>= 'a' && text.charAt(i)<='z'){
                int k = (int) ((text.charAt(i) - 'a') + n)%26;
                text.replace(text.charAt(i), (char) (k + 'a'));
            }
        }
        return text;
    }

    public String decodCesar (String text, int n){
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)>= 'A' && text.charAt(i)<='Z'){
                int k = (int) ((text.charAt(i) - 'Z') - n)%26;
                text.replace(text.charAt(i), (char) (k + 'Z'));
            }

            if(text.charAt(i)>= 'a' && text.charAt(i)<='z'){
                int k = (int) ((text.charAt(i) - 'z') - n)%26;
                text.replace(text.charAt(i), (char) (k + 'z'));
            }
        }

        return text;
    }
}
