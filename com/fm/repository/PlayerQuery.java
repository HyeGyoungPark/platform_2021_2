package com.fm.repository;

import com.fm.unit.Player;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PlayerQuery {
    boolean test;
    public static List<Player> query(List<Player> players, List<Predicate<Player>> conditions){
        return players.stream().filter(conditions.stream().reduce(x->true,Predicate::and)).collect(Collectors.toList());
    }
}