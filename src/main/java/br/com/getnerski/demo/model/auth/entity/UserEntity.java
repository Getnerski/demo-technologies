package br.com.getnerski.demo.model.auth.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "AUTH_USER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USER")
    private Long id;

    @NonNull
    @Column(name = "USER_NAME")
    private String username;

    @NonNull
    @Column(name = "PASSWORD")
    private String password;

    @NonNull
    @Column(name = "FULLNAME")
    private String fullName;

    @Column(name = "TOKEN")
    private String token;

    @Column(name = "REFRESH_TOKEN")
    private String refreshToken;

    @Column(name = "ACTIVE")
    private Boolean active = true;

    @Column(name = "DAT_CREATED")
    private LocalDateTime created;

    @Column(name = "DAT_UPDATED")
    private LocalDateTime updated;

    @PrePersist
    protected void onCreate() {
        created = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updated = LocalDateTime.now();
    }
}
