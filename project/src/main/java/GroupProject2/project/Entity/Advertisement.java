package GroupProject2.project.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Advertisement")
public class Advertisement {
    @Id
    private String adID;
    private String description;
    private String poster;
    private String board;

    public Advertisement() {}

    public Advertisement(Advertisement ad, String board) {
        adID = ad.getAdID();
        description = ad.getDescription();
        poster = ad.getPoster();
        this.board = board;
    }

    public String getAdID() {
        return adID;
    }

    public void setAdID(String adID) {
        this.adID = adID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }




}
