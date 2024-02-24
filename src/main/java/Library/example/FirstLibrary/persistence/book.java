package Library.example.FirstLibrary.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
public class book {
    @Id
    private int bookId;
    private String bookName;
    private Date publicationDate;
    @Enumerated(EnumType.STRING)
    private type type;

    public book(String bookName, Date publicationDate,
                Library.example.FirstLibrary.persistence.type type) {
        this.bookName = bookName;
        this.publicationDate = publicationDate;
        this.type = type;
    }
}
