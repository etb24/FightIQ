package com.ufc.fightiq.fighter;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fighters")
public class Fighter {

    @Id
    @Column(name = "name")
    private String name;
    private String nickname;
    private String weight_class;
    private Integer wins;
    private Integer losses;
    private Integer draws;
    private String place_of_birth;
    private String country;
    private Integer knockouts;
    private Integer submissions;
    private Integer first_round_finishes;
    private Double striking_accuracy;
    private Double takedown_accuracy;
    private Integer sig_str_landed_total;
    private Integer sig_str_attempted_total;
    private Integer takedowns_landed_total;
    private Integer takedowns_attempted_total;
    private Double sig_strikes_per_min;
    private Double takedowns_avg_per_min;
    private Double sig_str_def;
    private Double knockdown_avg;
    private Double sig_str_absorbed_per_min;
    private Double sub_avg_per_min;
    private Double takedown_def;
    private Double avg_fight_time;
    private Integer sig_strikes_while_standing;
    private Integer sig_strikes_while_clinched;
    private Integer sig_strikes_while_grounded;
    private Integer sig_strikes_head;
    private Integer sig_strikes_body;
    private Integer sig_strikes_leg;
    private Integer win_by_ko_tko;
    private Integer win_by_decision;
    private Integer win_by_submission;

    // Constructors
    public Fighter() {

    }

    public Fighter(String name, String nickname, String weight_class, Integer wins, Integer losses, Integer draws, String place_of_birth, String country, Integer knockouts, Integer submissions, Integer first_round_finishes, Double striking_accuracy, Double takedown_accuracy, Integer sig_str_landed_total, Integer sig_str_attempted_total, Integer takedowns_landed_total, Integer takedowns_attempted_total, Double sig_strikes_per_min, Double takedowns_avg_per_min, Double sig_str_def, Double knockdown_avg, Double sig_str_absorbed_per_min, Double sub_avg_per_min, Double takedown_def, Double avg_fight_time, Integer sig_strikes_while_standing, Integer sig_strikes_while_clinched, Integer sig_strikes_while_grounded, Integer sig_strikes_head, Integer sig_strikes_body, Integer sig_strikes_leg, Integer win_by_ko_tko, Integer win_by_decision, Integer win_by_submission) {
        this.name = name;
        this.nickname = nickname;
        this.weight_class = weight_class;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
        this.place_of_birth = place_of_birth;
        this.country = country;
        this.knockouts = knockouts;
        this.submissions = submissions;
        this.first_round_finishes = first_round_finishes;
        this.striking_accuracy = striking_accuracy;
        this.takedown_accuracy = takedown_accuracy;
        this.sig_str_landed_total = sig_str_landed_total;
        this.sig_str_attempted_total = sig_str_attempted_total;
        this.takedowns_landed_total = takedowns_landed_total;
        this.takedowns_attempted_total = takedowns_attempted_total;
        this.sig_strikes_per_min = sig_strikes_per_min;
        this.takedowns_avg_per_min = takedowns_avg_per_min;
        this.sig_str_def = sig_str_def;
        this.knockdown_avg = knockdown_avg;
        this.sig_str_absorbed_per_min = sig_str_absorbed_per_min;
        this.sub_avg_per_min = sub_avg_per_min;
        this.takedown_def = takedown_def;
        this.avg_fight_time = avg_fight_time;
        this.sig_strikes_while_standing = sig_strikes_while_standing;
        this.sig_strikes_while_clinched = sig_strikes_while_clinched;
        this.sig_strikes_while_grounded = sig_strikes_while_grounded;
        this.sig_strikes_head = sig_strikes_head;
        this.sig_strikes_body = sig_strikes_body;
        this.sig_strikes_leg = sig_strikes_leg;
        this.win_by_ko_tko = win_by_ko_tko;
        this.win_by_decision = win_by_decision;
        this.win_by_submission = win_by_submission;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getWeight_class() {
        return weight_class;
    }

    public Integer getWins() {
        return wins;
    }

    public Integer getLosses() {
        return losses;
    }

    public Integer getDraws() {
        return draws;
    }

    public String getPlace_of_birth() {
        return place_of_birth;
    }

    public String getCountry() {
        return country;
    }

    public Integer getKnockouts() {
        return knockouts;
    }

    public Integer getSubmissions() {
        return submissions;
    }

    public Integer getFirst_round_finishes() {
        return first_round_finishes;
    }

    public Double getStriking_accuracy() {
        return striking_accuracy;
    }

    public Double getTakedown_accuracy() {
        return takedown_accuracy;
    }

    public Integer getSig_str_landed_total() {
        return sig_str_landed_total;
    }

    public Integer getSig_str_attempted_total() {
        return sig_str_attempted_total;
    }

    public Integer getTakedowns_landed_total() {
        return takedowns_landed_total;
    }

    public Integer getTakedowns_attempted_total() {
        return takedowns_attempted_total;
    }

    public Double getSig_strikes_per_min() {
        return sig_strikes_per_min;
    }

    public Double getTakedowns_avg_per_min() {
        return takedowns_avg_per_min;
    }

    public Double getSig_str_def() {
        return sig_str_def;
    }

    public Double getKnockdown_avg() {
        return knockdown_avg;
    }

    public Double getSig_str_absorbed_per_min() {
        return sig_str_absorbed_per_min;
    }

    public Double getSub_avg_per_min() {
        return sub_avg_per_min;
    }

    public Double getTakedown_def() {
        return takedown_def;
    }

    public Double getAvg_fight_time() {
        return avg_fight_time;
    }

    public Integer getSig_strikes_while_standing() {
        return sig_strikes_while_standing;
    }

    public Integer getSig_strikes_while_clinched() {
        return sig_strikes_while_clinched;
    }

    public Integer getSig_strikes_while_grounded() {
        return sig_strikes_while_grounded;
    }

    public Integer getSig_strikes_head() {
        return sig_strikes_head;
    }

    public Integer getSig_strikes_body() {
        return sig_strikes_body;
    }

    public Integer getSig_strikes_leg() {
        return sig_strikes_leg;
    }

    public Integer getWin_by_ko_tko() {
        return win_by_ko_tko;
    }

    public Integer getWin_by_decision() {
        return win_by_decision;
    }

    public Integer getWin_by_submission() {
        return win_by_submission;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setWeight_class(String weight_class) {
        this.weight_class = weight_class;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public void setDraws(Integer draws) {
        this.draws = draws;
    }

    public void setPlace_of_birth(String place_of_birth) {
        this.place_of_birth = place_of_birth;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setKnockouts(Integer knockouts) {
        this.knockouts = knockouts;
    }

    public void setSubmissions(Integer submissions) {
        this.submissions = submissions;
    }

    public void setFirst_round_finishes(Integer first_round_finishes) {
        this.first_round_finishes = first_round_finishes;
    }

    public void setStriking_accuracy(Double striking_accuracy) {
        this.striking_accuracy = striking_accuracy;
    }

    public void setTakedown_accuracy(Double takedown_accuracy) {
        this.takedown_accuracy = takedown_accuracy;
    }

    public void setSig_str_landed_total(Integer sig_str_landed_total) {
        this.sig_str_landed_total = sig_str_landed_total;
    }

    public void setSig_str_attempted_total(Integer sig_str_attempted_total) {
        this.sig_str_attempted_total = sig_str_attempted_total;
    }

    public void setTakedowns_landed_total(Integer takedowns_landed_total) {
        this.takedowns_landed_total = takedowns_landed_total;
    }

    public void setTakedowns_attempted_total(Integer takedowns_attempted_total) {
        this.takedowns_attempted_total = takedowns_attempted_total;
    }

    public void setSig_strikes_per_min(Double sig_strikes_per_min) {
        this.sig_strikes_per_min = sig_strikes_per_min;
    }

    public void setTakedowns_avg_per_min(Double takedowns_avg_per_min) {
        this.takedowns_avg_per_min = takedowns_avg_per_min;
    }

    public void setSig_str_def(Double sig_str_def) {
        this.sig_str_def = sig_str_def;
    }

    public void setKnockdown_avg(Double knockdown_avg) {
        this.knockdown_avg = knockdown_avg;
    }

    public void setSig_str_absorbed_per_min(Double sig_str_absorbed_per_min) {
        this.sig_str_absorbed_per_min = sig_str_absorbed_per_min;
    }

    public void setSub_avg_per_min(Double sub_avg_per_min) {
        this.sub_avg_per_min = sub_avg_per_min;
    }

    public void setTakedown_def(Double takedown_def) {
        this.takedown_def = takedown_def;
    }

    public void setAvg_fight_time(Double avg_fight_time) {
        this.avg_fight_time = avg_fight_time;
    }

    public void setSig_strikes_while_standing(Integer sig_strikes_while_standing) {
        this.sig_strikes_while_standing = sig_strikes_while_standing;
    }

    public void setSig_strikes_while_clinched(Integer sig_strikes_while_clinched) {
        this.sig_strikes_while_clinched = sig_strikes_while_clinched;
    }

    public void setSig_strikes_while_grounded(Integer sig_strikes_while_grounded) {
        this.sig_strikes_while_grounded = sig_strikes_while_grounded;
    }

    public void setSig_strikes_head(Integer sig_strikes_head) {
        this.sig_strikes_head = sig_strikes_head;
    }

    public void setSig_strikes_body(Integer sig_strikes_body) {
        this.sig_strikes_body = sig_strikes_body;
    }

    public void setSig_strikes_leg(Integer sig_strikes_leg) {
        this.sig_strikes_leg = sig_strikes_leg;
    }

    public void setWin_by_ko_tko(Integer win_by_ko_tko) {
        this.win_by_ko_tko = win_by_ko_tko;
    }

    public void setWin_by_decision(Integer win_by_decision) {
        this.win_by_decision = win_by_decision;
    }

    public void setWin_by_submission(Integer win_by_submission) {
        this.win_by_submission = win_by_submission;
    }


}
