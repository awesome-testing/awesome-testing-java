package com.github.awesometesting.resttemplate;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import com.github.awesometesting.resttemplate.model.User;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestingGetMethods {

  private TestClient testClient;

  @BeforeEach
  void setup() {
    testClient = new TestClient(new TestClientConfiguration());
  }

  @Test
  void usersListShouldContainExpectedElements() {
    List<User> actualUsersList = testClient.users().list();

    List<User> expectedList = Collections.singletonList(new User(1, "Adam", "Testowy"));
    assertAll("users list",
        () -> assertEquals(actualUsersList.size(), 1, "Users list has wrong size."),
        () -> assertIterableEquals(expectedList, actualUsersList, "Users list has wrong contents."));
  }

}
