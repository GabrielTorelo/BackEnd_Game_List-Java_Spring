package com.gabriel_torelo.game_list.dto;

public class ChangePositionDTO {
    private Integer currentIndex;
    private Integer newIndex;

    public Integer getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(Integer currentIndex) {
        this.currentIndex = currentIndex;
    }

    public Integer getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(Integer newIndex) {
        this.newIndex = newIndex;
    }
}
