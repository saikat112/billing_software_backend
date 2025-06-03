package billing.billingsoftware.service;

import billing.billingsoftware.io.UserRequest;
import billing.billingsoftware.io.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse createUser(UserRequest request);
    String getUserRole(String email);
    List<UserResponse> readUsers();
    void deleteUser(String id);

}
