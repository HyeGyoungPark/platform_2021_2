package com.fm.repository;
import com.fm.game.SearchCondition;
import com.fm.unit.Player;

import java.util.*;
import java.util.function.Predicate;

public class PlayerSearchPredicateFactory {
    public static List<Predicate<Player>> makeConditions(List<SearchCondition> searchConditions){
        List<Predicate<Player>> pl1 = new ArrayList<>();

        for(SearchCondition searchCondition : searchConditions){
            switch (searchCondition.getField()){
                case "name":
                    pl1.add((Player p1) ->
                            p1.getName().contains(searchCondition.getCondition()));
                    break;

                case "club":
                    pl1.add((Player p1) ->
                            p1.getClub().contains(searchCondition.getCondition()));
                    break;

                case "nationality":
                    pl1.add((Player p1) ->
                            p1.getNationality().contains(searchCondition.getCondition()));
                    break;

                case "position":
                    pl1.add((Player p1) ->
                            p1.getPositions().contains(searchCondition.getCondition()));
                    break;
                default:
                    break;
            }

        }

        return pl1;
    }
}
