package com.codingshuttle.youtube.hospitalManagement.dto;


import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponseDto {
    String jwt;
    Long id;
}
