package br.com.getnerski.demo.model.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;

    private String username;

    private String fullName;

    private String token;

    private String refreshToken;

    private Boolean active;

    private LocalDateTime created;

    private LocalDateTime updated;
}
