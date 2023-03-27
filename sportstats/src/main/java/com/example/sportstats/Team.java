package com.example.sportstats;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity  //indicated that customer class is a JPA entity
public class Team {

    @Id  //indicated the id field is the objects ID
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Integer games;
    private Float minutesPlayed;
    private Float fieldGoals;
    private Float fieldGoalAttempts;
    private Float fieldGoalPercent;
    private Float threePointMade;
    private Float threePointAttempts;
    private Float threePointPercent;
    private Float twoPointMade;
    private Float twoPointAttempts;
    private Float twoPointPercent;
    private Float freeThrowMade;
    private Float freeThrowAttempts;
    private Float freeThrowPercent;
    private Float offensiveRebounds;
    private Float defensiveRebounds;
    private Float totalRebounds;
    private Float assists;
    private Float steals;
    private Float blocks;
    private Float turnovers;
    private Float personalFouls;
    private Float totalPoints;

    public Integer getGames() {
        return games;
    }

    public void setGames(Integer games) {
        this.games = games;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(Float minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public Float getFieldGoals() {
        return fieldGoals;
    }

    public void setFieldGoals(Float fieldGoals) {
        this.fieldGoals = fieldGoals;
    }

    public Float getFieldGoalAttempts() {
        return fieldGoalAttempts;
    }

    public void setFieldGoalAttempts(Float fieldGoalAttempts) {
        this.fieldGoalAttempts = fieldGoalAttempts;
    }

    public Float getFieldGoalPercent() {
        return fieldGoalPercent;
    }

    public void setFieldGoalPercent(Float fieldGoalPercent) {
        this.fieldGoalPercent = fieldGoalPercent;
    }

    public Float getThreePointMade() {
        return threePointMade;
    }

    public void setThreePointMade(Float threePointMade) {
        this.threePointMade = threePointMade;
    }

    public Float getThreePointAttempts() {
        return threePointAttempts;
    }

    public void setThreePointAttempts(Float threePointAttempts) {
        this.threePointAttempts = threePointAttempts;
    }

    public Float getThreePointPercent() {
        return threePointPercent;
    }

    public void setThreePointPercent(Float threePointPercent) {
        this.threePointPercent = threePointPercent;
    }

    public Float getTwoPointMade() {
        return twoPointMade;
    }

    public void setTwoPointMade(Float twoPointMade) {
        this.twoPointMade = twoPointMade;
    }

    public Float getTwoPointAttempts() {
        return twoPointAttempts;
    }

    public void setTwoPointAttempts(Float twoPointAttempts) {
        this.twoPointAttempts = twoPointAttempts;
    }

    public Float getTwoPointPercent() {
        return twoPointPercent;
    }

    public void setTwoPointPercent(Float twoPointPercent) {
        this.twoPointPercent = twoPointPercent;
    }

    public Float getFreeThrowMade() {
        return freeThrowMade;
    }

    public void setFreeThrowMade(Float freeThrowMade) {
        this.freeThrowMade = freeThrowMade;
    }

    public Float getFreeThrowAttempts() {
        return freeThrowAttempts;
    }

    public void setFreeThrowAttempts(Float freeThrowAttempts) {
        this.freeThrowAttempts = freeThrowAttempts;
    }

    public Float getFreeThrowPercent() {
        return freeThrowPercent;
    }

    public void setFreeThrowPercent(Float freeThrowPercent) {
        this.freeThrowPercent = freeThrowPercent;
    }

    public Float getOffensiveRebounds() {
        return offensiveRebounds;
    }

    public void setOffensiveRebounds(Float offensiveRebounds) {
        this.offensiveRebounds = offensiveRebounds;
    }

    public Float getDefensiveRebounds() {
        return defensiveRebounds;
    }

    public void setDefensiveRebounds(Float defensiveRebounds) {
        this.defensiveRebounds = defensiveRebounds;
    }

    public Float getTotalRebounds() {
        return totalRebounds;
    }

    public void setTotalRebounds(Float totalRebounds) {
        this.totalRebounds = totalRebounds;
    }

    public Float getAssists() {
        return assists;
    }

    public void setAssists(Float assists) {
        this.assists = assists;
    }

    public Float getSteals() {
        return steals;
    }

    public void setSteals(Float steals) {
        this.steals = steals;
    }

    public Float getBlocks() {
        return blocks;
    }

    public void setBlocks(Float blocks) {
        this.blocks = blocks;
    }

    public Float getTurnovers() {
        return turnovers;
    }

    public void setTurnovers(Float turnovers) {
        this.turnovers = turnovers;
    }

    public Float getPersonalFouls() {
        return personalFouls;
    }

    public void setPersonalFouls(Float personalFouls) {
        this.personalFouls = personalFouls;
    }

    public Float getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(Float totalPoints) {
        this.totalPoints = totalPoints;
    }




}
