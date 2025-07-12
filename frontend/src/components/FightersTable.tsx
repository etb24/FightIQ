import React from 'react';
import { FightersTableProps } from "../types/FightersTable";
import './FightersTable.css';

const FightersTable: React.FC<FightersTableProps> = ({ fighters, onSort }) => {
    return (
        <div className="table-container">
            <table border={1} cellPadding={5} cellSpacing={0}>
                <thead>
                <tr>
                    <th onClick={() => onSort('name')}>Name</th>
                    <th>Nickname</th>
                    <th>Weight Class</th>
                    <th onClick={() => onSort('wins')}>Wins</th>
                    <th onClick={() => onSort('losses')}>Losses</th>
                    <th onClick={() => onSort('draws')}>Draws</th>
                    <th>Place of Birth</th>
                    <th>Country</th>
                    <th onClick={() => onSort('knockouts')}>Knockouts</th>
                    <th onClick={() => onSort('submissions')}>Submissions</th>
                    <th onClick={() => onSort('firstRoundFinishes')}>First Round Finishes</th>
                    <th onClick={() => onSort('strikingAccuracy')}>Striking Accuracy</th>
                    <th onClick={() => onSort('takedownAccuracy')}>Takedown Accuracy</th>
                    <th onClick={() => onSort('sigStrLandedTotal')}>Sig Strikes Landed</th>
                    <th onClick={() => onSort('sigAtrAttemptedTotal')}>Sig Strikes Attempted</th>
                    <th onClick={() => onSort('takedownsLandedTotal')}>Takedowns Landed</th>
                    <th onClick={() => onSort('takedownsAttemptedTotal')}>Takedowns Attempted</th>
                    <th onClick={() => onSort('sigStrikesPerMin')}>Sig Strikes Per Min</th>
                    <th onClick={() => onSort('takedownsAvgPerMin')}>Takedowns Avg Per Min</th>
                    <th onClick={() => onSort('sigStrDef')}>Sig Strike Defense</th>
                    <th onClick={() => onSort('knockdownAvg')}>Knockdown Avg</th>
                    <th onClick={() => onSort('sigStrAbsorbedPerMin')}>Sig Strikes Absorbed Per Min</th>
                    <th onClick={() => onSort('subAvgPerMin')}>Sub Avg Per Min</th>
                    <th onClick={() => onSort('takedownDef')}>Takedown Defense</th>
                    <th onClick={() => onSort('avgFightTime')}>Avg Fight Time</th>
                    <th onClick={() => onSort('sigStrikesWhileStanding')}>Sig Strikes Standing</th>
                    <th onClick={() => onSort('sigStrikesWhileClinched')}>Sig Strikes Clinched</th>
                    <th onClick={() => onSort('sigStrikesWhileGrounded')}>Sig Strikes Grounded</th>
                    <th onClick={() => onSort('sigStrikesHead')}>Sig Strikes Head</th>
                    <th onClick={() => onSort('sigStrikesBody')}>Sig Strikes Body</th>
                    <th onClick={() => onSort('sigStrikesLeg')}>Sig Strikes Leg</th>
                </tr>
                </thead>
                <tbody>
                {fighters.map((fighter, index) => (
                    <tr key={index}>
                        <td>{fighter.name || 'N/A'}</td>
                        <td>{fighter.nickname || 'N/A'}</td>
                        <td>{fighter.weightClass || 'N/A'}</td>
                        <td>{fighter.wins ?? 0}</td>
                        <td>{fighter.losses ?? 0}</td>
                        <td>{fighter.draws ?? 0}</td>
                        <td>{fighter.place_of_birth || 'Unknown'}</td>
                        <td>{fighter.country || 'Unknown'}</td>
                        <td>{fighter.knockouts ?? 0}</td>
                        <td>{fighter.submissions ?? 0}</td>
                        <td>{fighter.firstRoundFinishes ?? 0}</td>
                        <td>{fighter.strikingAccuracy ?? 0}</td>
                        <td>{fighter.takedownAccuracy ?? 0}</td>
                        <td>{fighter.sigStrLandedTotal ?? 0}</td>
                        <td>{fighter.sigStrAttemptedTotal ?? 0}</td>
                        <td>{fighter.takedownsLandedTotal ?? 0}</td>
                        <td>{fighter.takedownsAttemptedTotal ?? 0}</td>
                        <td>{fighter.sigStrikesPerMin ?? 0}</td>
                        <td>{fighter.takedownsAvgPerMin ?? 0}</td>
                        <td>{fighter.sigStrDef ?? 0}</td>
                        <td>{fighter.knockdownAvg ?? 0}</td>
                        <td>{fighter.sigStrAbsorbedPerMin ?? 0}</td>
                        <td>{fighter.subAvgPerMin ?? 0}</td>
                        <td>{fighter.takedownDef ?? 0}</td>
                        <td>{fighter.avgFightTime ?? 0}</td>
                        <td>{fighter.sigStrikesWhileStanding ?? 0}</td>
                        <td>{fighter.sigStrikesWhileClinched ?? 0}</td>
                        <td>{fighter.sigStrikesWhileGrounded ?? 0}</td>
                        <td>{fighter.sigStrikesHead ?? 0}</td>
                        <td>{fighter.sigStrikesBody ?? 0}</td>
                        <td>{fighter.sigStrikesLeg ?? 0}</td>
                    </tr>
                ))}
                </tbody>
            </table>
        </div>
    );
};

export default FightersTable;

