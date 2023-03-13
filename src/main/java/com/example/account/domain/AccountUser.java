package com.example.account.domain;

import lombok.*;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class AccountUser {
    @Id
    @GeneratedValue
    private Long id;



    private String name;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
