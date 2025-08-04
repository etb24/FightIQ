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
    @Column(name = "nickname")
    private String nickname;

    @Column(name = "weight_class") //necessary for service functions
    private String weightClass; //weightClass caused bug

    @Column(name = "wins")
    private Integer wins;

    @Column(name = "losses")
    private Integer losses;
    @Column(name = "draws")
    private Integer draws;

    @Column(name = "place_of_birth")
    private String place_of_birth;
    @Column(name = "country")
    private String country;

    @Column(name = "knockouts")
    private Integer knockouts;

    @Column(name = "submissions")
    private Integer submissions;

    @Column(name = "first_round_finishes")
    private Integer firstRoundFinishes;

    @Column(name = "striking_accuracy")
    private Double strikingAccuracy;
    @Column(name = "takedown_accuracy")
    private Double takedownAccuracy;

    @Column(name = "sig_str_landed_total")
    private Integer sigStrLandedTotal;
    @Column(name = "sig_str_attempted_total")
    private Integer sigStrAttemptedTotal;
    @Column(name = "takedowns_landed_total")
    private Integer takedownsLandedTotal;
    @Column(name = "takedowns_attempted_total")
    private Integer takedownsAttemptedTotal;

    @Column(name = "sig_strikes_per_min")
    private Double sigStrikesPerMin;
    @Column(name = "takedowns_avg_per_min")
    private Double takedownsAvgPerMin;

    @Column(name = "sig_str_def")
    private Double sigStrDef;
    @Column(name = "knockdown_avg")
    private Double knockdownAvg;
    @Column(name = "sig_str_absorbed_per_min")
    private Double sigStrAbsorbedPerMin;
    @Column(name = "sub_avg_per_min")
    private Double subAvgPerMin;
    @Column(name = "takedown_def")
    private Double takedownDef;
    @Column(name = "avg_fight_time")
    private Double avgFightTime;

    @Column(name = "sig_strikes_while_standing")
    private Integer sigStrikesWhileStanding;
    @Column(name = "sig_strikes_while_clinched")
    private Integer sigStrikesWhileClinched;
    @Column(name = "sig_strikes_while_grounded")
    private Integer sigStrikesWhileGrounded;
    @Column(name = "sig_strikes_head")
    private Integer sigStrikesHead;
    @Column(name = "sig_strikes_body")
    private Integer sigStrikesBody;
    @Column(name = "sig_strikes_leg")
    private Integer sigStrikesLeg;

    @Column(name = "win_by_ko_tko")
    private Integer winByKoTko;
    @Column(name = "win_by_decision")
    private Integer winByDecision;
    @Column(name = "win_by_submission")
    private Integer winBySubmission;

    // Constructors
    public Fighter() {

    }

    public Fighter(String name, String nickname, String weightClass, Integer wins, Integer losses, Integer draws, String place_of_birth, String country, Integer knockouts, Integer submissions, Integer firstRoundFinishes, Double strikingAccuracy, Double takedownAccuracy, Integer sigStrLandedTotal, Integer sigStrAttemptedTotal, Integer takedownsLandedTotal, Integer takedownsAttemptedTotal, Double sigStrikesPerMin, Double takedownsAvgPerMin, Double sigStrDef, Double knockdownAvg, Double sigStrAbsorbedPerMin, Double subAvgPerMin, Double takedownDef, Double avgFightTime, Integer sigStrikesWhileStanding, Integer sigStrikesWhileClinched, Integer sigStrikesWhileGrounded, Integer sigStrikesHead, Integer sigStrikesBody, Integer sigStrikesLeg, Integer winByKoTko, Integer winByDecision, Integer winBySubmission) {
        this.name = name;
        this.nickname = nickname;
        this.weightClass = weightClass;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
        this.place_of_birth = place_of_birth;
        this.country = country;
        this.knockouts = knockouts;
        this.submissions = submissions;
        this.firstRoundFinishes = firstRoundFinishes;
        this.strikingAccuracy = strikingAccuracy;
        this.takedownAccuracy = takedownAccuracy;
        this.sigStrLandedTotal = sigStrLandedTotal;
        this.sigStrAttemptedTotal = sigStrAttemptedTotal;
        this.takedownsLandedTotal = takedownsLandedTotal;
        this.takedownsAttemptedTotal = takedownsAttemptedTotal;
        this.sigStrikesPerMin = sigStrikesPerMin;
        this.takedownsAvgPerMin = takedownsAvgPerMin;
        this.sigStrDef = sigStrDef;
        this.knockdownAvg = knockdownAvg;
        this.sigStrAbsorbedPerMin = sigStrAbsorbedPerMin;
        this.subAvgPerMin = subAvgPerMin;
        this.takedownDef = takedownDef;
        this.avgFightTime = avgFightTime;
        this.sigStrikesWhileStanding = sigStrikesWhileStanding;
        this.sigStrikesWhileClinched = sigStrikesWhileClinched;
        this.sigStrikesWhileGrounded = sigStrikesWhileGrounded;
        this.sigStrikesHead = sigStrikesHead;
        this.sigStrikesBody = sigStrikesBody;
        this.sigStrikesLeg = sigStrikesLeg;
        this.winByKoTko = winByKoTko;
        this.winByDecision = winByDecision;
        this.winBySubmission = winBySubmission;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setweightClass(String weightClass) {
        this.weightClass = weightClass;
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

    public void setFirstRoundFinishes(Integer firstRoundFinishes) {
        this.firstRoundFinishes = firstRoundFinishes;
    }

    public void setStrikingAccuracy(Double strikingAccuracy) {
        this.strikingAccuracy = strikingAccuracy;
    }

    public void setTakedownAccuracy(Double takedownAccuracy) {
        this.takedownAccuracy = takedownAccuracy;
    }

    public void setSigStrLandedTotal(Integer sigStrLandedTotal) {
        this.sigStrLandedTotal = sigStrLandedTotal;
    }

    public void setSigStrAttemptedTotal(Integer sigStrAttemptedTotal) {
        this.sigStrAttemptedTotal = sigStrAttemptedTotal;
    }

    public void setTakedownsLandedTotal(Integer takedownsLandedTotal) {
        this.takedownsLandedTotal = takedownsLandedTotal;
    }

    public void setTakedownsAttemptedTotal(Integer takedownsAttemptedTotal) {
        this.takedownsAttemptedTotal = takedownsAttemptedTotal;
    }

    public void setSigStrikesPerMin(Double sigStrikesPerMin) {
        this.sigStrikesPerMin = sigStrikesPerMin;
    }

    public void setTakedownsAvgPerMin(Double takedownsAvgPerMin) {
        this.takedownsAvgPerMin = takedownsAvgPerMin;
    }

    public void setSigStrDef(Double sigStrDef) {
        this.sigStrDef = sigStrDef;
    }

    public void setKnockdownAvg(Double knockdownAvg) {
        this.knockdownAvg = knockdownAvg;
    }

    public void setSigStrAbsorbedPerMin(Double sigStrAbsorbedPerMin) {
        this.sigStrAbsorbedPerMin = sigStrAbsorbedPerMin;
    }

    public void setSubAvgPerMin(Double subAvgPerMin) {
        this.subAvgPerMin = subAvgPerMin;
    }

    public void setTakedownDef(Double takedownDef) {
        this.takedownDef = takedownDef;
    }

    public void setAvgFightTime(Double avgFightTime) {
        this.avgFightTime = avgFightTime;
    }

    public void setSigStrikesWhileStanding(Integer sigStrikesWhileStanding) {
        this.sigStrikesWhileStanding = sigStrikesWhileStanding;
    }

    public void setSigStrikesWhileClinched(Integer sigStrikesWhileClinched) {
        this.sigStrikesWhileClinched = sigStrikesWhileClinched;
    }

    public void setSigStrikesWhileGrounded(Integer sigStrikesWhileGrounded) {
        this.sigStrikesWhileGrounded = sigStrikesWhileGrounded;
    }

    public void setSigStrikesHead(Integer sigStrikesHead) {
        this.sigStrikesHead = sigStrikesHead;
    }

    public void setSigStrikesBody(Integer sigStrikesBody) {
        this.sigStrikesBody = sigStrikesBody;
    }

    public void setSigStrikesLeg(Integer sigStrikesLeg) {
        this.sigStrikesLeg = sigStrikesLeg;
    }

    public void setWinByKoTko(Integer winByKoTko) {
        this.winByKoTko = winByKoTko;
    }

    public void setWinByDecision(Integer winByDecision) {
        this.winByDecision = winByDecision;
    }

    public void setWinBySubmission(Integer winBySubmission) {
        this.winBySubmission = winBySubmission;
    }


    // Getters

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getweightClass() {
        return weightClass;
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

    public Integer getFirstRoundFinishes() {
        return firstRoundFinishes;
    }

    public Double getStrikingAccuracy() {
        return strikingAccuracy;
    }

    public Double getTakedownAccuracy() {
        return takedownAccuracy;
    }

    public Integer getSigStrLandedTotal() {
        return sigStrLandedTotal;
    }

    public Integer getSigStrAttemptedTotal() {
        return sigStrAttemptedTotal;
    }

    public Integer getTakedownsLandedTotal() {
        return takedownsLandedTotal;
    }

    public Integer getTakedownsAttemptedTotal() {
        return takedownsAttemptedTotal;
    }

    public Double getSigStrikesPerMin() {
        return sigStrikesPerMin;
    }

    public Double getTakedownsAvgPerMin() {
        return takedownsAvgPerMin;
    }

    public Double getSigStrDef() {
        return sigStrDef;
    }

    public Double getKnockdownAvg() {
        return knockdownAvg;
    }

    public Double getSigStrAbsorbedPerMin() {
        return sigStrAbsorbedPerMin;
    }

    public Double getSubAvgPerMin() {
        return subAvgPerMin;
    }

    public Double getTakedownDef() {
        return takedownDef;
    }

    public Double getAvgFightTime() {
        return avgFightTime;
    }

    public Integer getSigStrikesWhileStanding() {
        return sigStrikesWhileStanding;
    }

    public Integer getSigStrikesWhileClinched() {
        return sigStrikesWhileClinched;
    }

    public Integer getSigStrikesWhileGrounded() {
        return sigStrikesWhileGrounded;
    }

    public Integer getSigStrikesHead() {
        return sigStrikesHead;
    }

    public Integer getSigStrikesBody() {
        return sigStrikesBody;
    }

    public Integer getSigStrikesLeg() {
        return sigStrikesLeg;
    }

    public Integer getWinByKoTko() {
        return winByKoTko;
    }

    public Integer getWinByDecision() {
        return winByDecision;
    }

    public Integer getWinBySubmission() {
        return winBySubmission;
    }
}
