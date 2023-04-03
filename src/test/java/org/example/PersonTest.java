package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonTest {

    private Person person;
    @BeforeEach
    public void setup(){
        String name = "Riya";
        int age = 30;
        String email = "Riya@test.com";
        person = new Person(name, age, email);
    }

    @Test
    @DisplayName("Test getName() with not-null value")
    void testGetNameWithNonNullValue() {
        person.setName("Riya Sharma");
        Assertions.assertEquals("Riya Sharma", person.getName());
    }

    @Test
    @DisplayName("Test getName() with null value")
    void testGetNameWithNullValue() {
        person.setName(null);
        Assertions.assertNull(person.getName());
    }

    @Test
    @DisplayName("Test getAge() with not-null value")
    void testGetAgeWithNonNullValue() {
        person.setAge(25);
        Assertions.assertEquals(25, person.getAge());
    }

    @Test
    @DisplayName("Test getAge() with null value")
    void testGetAgeWithNullValue() {
        person.setAge(0);
        Assertions.assertEquals(0, person.getAge());
    }

    @Test
    @DisplayName("Test getEmail() with not-null value")
    void testGetEmailWithNonNullValue() {
        person.setEmail("Riya.Sharma@test.com");
        Assertions.assertEquals("Riya.Sharma@test.com", person.getEmail());
    }

    @Test
    @DisplayName("Test getEmail() with null value")
    void testGetEmailWithNullValue() {
        person.setEmail(null);
        Assertions.assertNull(person.getEmail());
    }

    @Test
    @DisplayName("Test setAge() with positive integer")
    void testSetAgeWithPositiveInteger() {
        person.setAge(30);
        Assertions.assertEquals(30, person.getAge());
    }
    @Test
    @DisplayName("Test setAge() with negative integer")
    void testSetAgeWithNegativeInteger() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> person.setAge(-30));
        //The assertion checks whether the expected exception is thrown when the code inside the lambda expression (() -> person.setAge(-5)) is executed.
    }

    @Test
    public void testSetAgeWithZero() {
        int age = 0;
        person.setAge(age);
        Assertions.assertEquals(age, person.getAge());
    }




    }
