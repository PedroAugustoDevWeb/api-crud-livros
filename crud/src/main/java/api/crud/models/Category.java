package api.crud.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "category")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private String name;

    private String desc;

    @OneToOne(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Livros> livros;
}
