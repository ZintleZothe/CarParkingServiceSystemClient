package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Role;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RoleFactoryTest {
    @Test
    public void createRole(){
        Role role= RoleFactory.createRole("Student");
        assertNotNull(role);
        System.out.println(role);

    }

    @Test
        // checks if the string in not null or empty and then throws
        // an IllegalArgumentException
    void CreateRoleWithAnError(){
        Exception exception=assertThrows(IllegalArgumentException.class, ()->
                RoleFactory.createRole(""));
        System.out.println(exception.getMessage()+": role name");

    }
}