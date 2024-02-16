package uso.de.optional.asis;

import uso.de.optional.common.Comment;

public class main {


    public static void main(String[] args){

        //Usuario que no tiene comments en el blog

        User gustavo=null;

        //aca se dispara el erro de null pointer porqye
        //no existe un comment para este usuario
        gustavo.getName();


    }


}
