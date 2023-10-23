package com.tms.security.domain;

import com.tms.domain.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity(name = "security_credentials")
@Data
public class SecurityCredentials {
    @Id
    @SequenceGenerator(name = "security_person", sequenceName = "security_person_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "security_person_person", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "person_login")
    private String personLogin;

    @Column(name = "person_password")
    private String personPassword;

    @Column(name = "person_role")
    @Enumerated(EnumType.STRING) // из строки в enum
    private Role role;
    @Column(name = "person_id")
    private Long personId;
}
