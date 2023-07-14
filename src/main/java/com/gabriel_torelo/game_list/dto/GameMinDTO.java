package com.gabriel_torelo.game_list.dto;

import com.gabriel_torelo.game_list.entities.Game;

public class GameMinDTO {
    private Long id;
    private String title;
    private Double score;
    private String imgUrl;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        score = entity.getScore();
        imgUrl = entity.getImgUrl();
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
}
