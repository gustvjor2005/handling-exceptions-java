package uso.de.optional.tobe;

import uso.de.optional.common.Comment;

import java.util.Optional;

public class main {

    public static void main(String[] args){

    User gustavo  = null;

    Optional<User> optGustavo = Optional.ofNullable(gustavo);
    Optional<String> name =  optGustavo.map(User::getName);

    if (name.equals("gustavo")) {

            System.out.println("sss");
    }


    if(name.isPresent()){

        System.out.println("nombre no es nullo");
    }

    }
}
