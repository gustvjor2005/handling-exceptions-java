package uso.de.optional.tobe;

import uso.de.optional.common.Comment;

import java.util.Optional;

public class User {

    Integer id;
    String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String mame) {
        this.name = name;
    }

}
