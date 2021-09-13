package hashtable;

public class HashRepet {


    public static String repeatedWord (String hashString){

        String[] repeatWord = hashString.split(" ");

        for(int i = 0; i<repeatWord.length; i++){
            for(int h= 0; h<i; h++){

                if (repeatWord[i].equals(repeatWord[h].toLowerCase()))
                    return repeatWord[i].toLowerCase();
            }
        }

        return " No Repeat Word";
    }

}
