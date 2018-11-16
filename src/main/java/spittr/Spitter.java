package spittr;

import org.springframework.context.annotation.Bean;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Size;

/**
 * @author TanYf.
 * @project
 * @illu
 * @date 2018/11/14
 */
public class Spitter {
    private Long id;
    @NonNull
    @Size(min = 2, max =16, message = "{firstName.size}")
    private String firstName;
    @NonNull
    @Size(min = 5, max =25)
    private String lastName;
    @NonNull
    @Size(min = 2, max =30)
    private String userName;
    @NonNull
    @Size(min = 6, max =25)
    private String password;

    public Spitter() {
    }

    public Spitter(String firstName, String lastName, String userName, String password) {
        this.id = null;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    public Spitter(Long id, String firstName, String lastName, String userName, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
