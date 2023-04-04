package hsu.bugicare.bugicareserver.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
@Table(name = "Door")
@Entity
public class Door {

    @Id@ GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String status;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date time;
}
