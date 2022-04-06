package com.wad.lab3.lab3_wad.domain;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class HealthIssue {
    @Id
    @GeneratedValue
    private Long id;
    private String type;

    public HealthIssue(String type) {
        this.type = type;
    }

}
