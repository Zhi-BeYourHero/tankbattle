/*
 * Copyright (c) 2011-2025 PiChen.
 */

package cn.edu.hdu.tankbattle.dto;

import java.util.Vector;

import cn.edu.hdu.tankbattle.model.Bomb;
import cn.edu.hdu.tankbattle.model.EnemyTank;
import cn.edu.hdu.tankbattle.model.MyTank;
import cn.edu.hdu.tankbattle.model.map.Map;

/**
 * GameResource...
 *
 * @author chenpi
 * @since 2011-02-10 19:29
 */

public class GameResource {
    /**
     * 我的坦克容量
     */
    private Vector<MyTank> myTanks = new Vector<>();
    /**
     * 敌人坦克容量
     */
    private Vector<EnemyTank> enemies = new Vector<>();
    /**
     * 炸弹容量
     */
    private Vector<Bomb> bombs = new Vector<>();
    /**
     * 坦克游戏地图对象
     */
    private Map map;

    /**
     * reset TODO @Title: reset @Description: TODO @param @return void @throws
     */
    public void reset() {
        myTanks.clear();
        enemies.clear();
        bombs.clear();
        map = null;
    }

    public Vector<MyTank> getMyTanks() {
        return myTanks;
    }

    public void setMyTanks(Vector<MyTank> myTanks) {
        this.myTanks = myTanks;
    }

    public Vector<EnemyTank> getEnemies() {
        return enemies;
    }

    public void setEnemies(Vector<EnemyTank> enemies) {
        this.enemies = enemies;
    }

    public Vector<Bomb> getBombs() {
        return bombs;
    }

    public void setBombs(Vector<Bomb> bombs) {
        this.bombs = bombs;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}
