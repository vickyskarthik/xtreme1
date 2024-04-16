package ai.basic.x1.adapter.api.annotation.user;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author andy
 */
@Target({ElementType.PARAMETER})    // Specifies that this annotation can only be applied to method parameters.
@Retention(RetentionPolicy.RUNTIME) // Specifies that this annotation will be available at runtime for reflection.
public @interface LoggedUser {
     /**
     * Defines whether the logged-in user information is required by default.
     * If true, the method where this is applied will expect a user to be authenticated.
     * If false, the method can be executed even without user authentication.
     *
     * @return true if the user details are required, false otherwise.
     */
    boolean required() default true;
}

