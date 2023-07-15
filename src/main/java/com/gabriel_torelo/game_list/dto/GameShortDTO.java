package com.gabriel_torelo.game_list.dto;

import com.gabriel_torelo.game_list.entities.Game;

public class GameShortDTO {
    private GameMinDTO gameMinDTO = new GameMinDTO();
    private String shortDescription;

    public GameShortDTO() {
    }

    public GameShortDTO(Game entity) {
        gameMinDTO.setId(entity.getId());
        gameMinDTO.setTitle(entity.getTitle());
        gameMinDTO.setScore(entity.getScore());
        gameMinDTO.setImgUrl(entity.getImgUrl());
        shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return gameMinDTO.getId();
    }

    public String getTitle() {
        return gameMinDTO.getTitle();
    }

    public Double getScore() {
        return gameMinDTO.getScore();
    }

    public String getImgUrl() {
        return gameMinDTO.getImgUrl();
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
