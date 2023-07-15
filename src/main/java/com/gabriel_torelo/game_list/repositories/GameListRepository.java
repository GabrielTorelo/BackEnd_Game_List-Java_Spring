package com.gabriel_torelo.game_list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gabriel_torelo.game_list.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
