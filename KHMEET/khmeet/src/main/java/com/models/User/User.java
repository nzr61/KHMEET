package com.models.User;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false, unique = true)
    private Long user_id;
    private String email;
    private Boolean is_confirmed;
    private enum role {admin,user};
    private String password;
    private String image;
    private String nickname;
    private Date birthday;
    private String about;
    private String phone;
    User(Long id)
    {
        this.user_id = id;
    }
}
