package org.parthinfotech.models;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.parthinfotech.constants.MatchLevel;
import org.springframework.data.annotation.Id;

public class Tournament {

	@Id
	private Long id;
	private String name;
	private Date startDate;
	private Date endDate;
	private List<Player> players;
	private Player winner;
	private Map<Player, Double> pointsTable;
	private String venue;
	private Map<MatchLevel, Match> matches;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public Player getWinner() {
		return winner;
	}

	public void setWinner(Player winner) {
		this.winner = winner;
	}

	public Map<Player, Double> getPointsTable() {
		return pointsTable;
	}

	public void setPointsTable(Map<Player, Double> pointsTable) {
		this.pointsTable = pointsTable;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public Map<MatchLevel, Match> getMatches() {
		return matches;
	}

	public void setMatches(Map<MatchLevel, Match> matches) {
		this.matches = matches;
	}

}
