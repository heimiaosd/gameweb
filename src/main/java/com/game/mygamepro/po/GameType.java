package com.game.mygamepro.po;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "g_gametype")
public class GameType {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer typeNum;
    @OneToMany(mappedBy = "type")
    private List<Game> games;

    public GameType() {
    }

    @Override
    public String toString() {
        return "GameType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", typeNum=" + typeNum +
                ", games=" + games +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(Integer typeNum) {
        this.typeNum = typeNum;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
