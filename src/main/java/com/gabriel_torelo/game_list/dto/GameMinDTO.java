package com.gabriel_torelo.game_list.dto;

import com.gabriel_torelo.game_list.entities.Game;
import com.gabriel_torelo.game_list.projections.GameMinProjection;

public class GameMinDTO {
    private Long id;
    private String title;
    private Double score;
    private String imgUrl;
    private Integer position;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        score = entity.getScore();
        imgUrl = entity.getImgUrl();
    }

    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        score = projection.getScore();
        imgUrl = projection.getImgUrl();
        position = projection.getPosition();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Double getScore() {
        return score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
