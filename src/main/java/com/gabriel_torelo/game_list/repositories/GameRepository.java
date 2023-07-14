package com.gabriel_torelo.game_list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gabriel_torelo.game_list.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
