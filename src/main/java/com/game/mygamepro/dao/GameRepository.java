package com.game.mygamepro.dao;

import com.game.mygamepro.po.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
    Game findByName(String name);
}
