package com.gabriel_torelo.game_list.projections;

public interface GameMinProjection {
    Long getId();
    String getTitle();
    Double getScore();
    String getImgUrl();
    Integer getPosition();
}
