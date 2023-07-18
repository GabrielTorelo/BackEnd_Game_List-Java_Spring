package com.gabriel_torelo.game_list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.gabriel_torelo.game_list.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
    @Modifying
    @Query(nativeQuery = true, value = """
        UPDATE tb_belonging 
        SET position = :newIndex 
        WHERE list_id = :listID 
        AND game_id = :gameID
            """)
    void moveGameInList(Long listID, Long gameID, Integer newIndex);
}
