package com.game.mygamepro.dao;

import com.game.mygamepro.po.GameType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameTypeRepository extends JpaRepository<GameType,Long> {
}
