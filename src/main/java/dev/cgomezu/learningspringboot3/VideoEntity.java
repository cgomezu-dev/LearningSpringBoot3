package dev.cgomezu.learningspringboot3;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class VideoEntity {
    
    private @Id @GeneratedValue Long id;
    private String name;
    private String description;

    protected VideoEntity() {
        this(null, null);
    }

    public VideoEntity(String name, String description) {
        this.id = null;
        this.name = name;
        this.description = description;
    }

}
