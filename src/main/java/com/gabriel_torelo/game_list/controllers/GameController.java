package com.gabriel_torelo.game_list.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gabriel_torelo.game_list.dto.GameMinDTO;
import com.gabriel_torelo.game_list.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> readAll() {
        return gameService.readAll();
    }
}
