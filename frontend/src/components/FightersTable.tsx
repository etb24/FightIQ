import React from 'react';
import { Fighter } from '../types/Fighter';

interface FightersTableProps {
    fighters: Fighter[];
}

const FightersTable: React.FC<FightersTableProps> = ({ fighters }) => {
    return (
        <div className="table-container">
            <table border={1} cellPadding={5} cellSpacing={0}>
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Nickname</th>
                    <th>Weight Class</th>
                    <th>Wins</th>
                    <th>Losses</th>
                    <th>Draws</th>
                    <th>Place of Birth</th>
                    <th>Country</th>
                    <th>Knockouts</th>
                    <th>Submissions</th>
                    <th>First Round Finishes</th>
                    <th>Striking Accuracy</th>
                    <th>Takedown Accuracy</th>
                    <th>Sig Strikes Landed</th>
                    <th>Sig Strikes Attempted</th>
                    <th>Takedowns Landed</th>
                    <th>Takedowns Attempted</th>
                    <th>Sig Strikes Per Min</th>
                    <th>Takedowns Avg Per Min</th>
                    <th>Sig Strike Defense</th>
                    <th>Knockdown Avg</th>
                    <th>Sig Strikes Absorbed Per Min</th>
                    <th>Sub Avg Per Min</th>
                    <th>Takedown Defense</th>
                    <th>Avg Fight Time</th>
                    <th>Sig Strikes Standing</th>
                    <th>Sig Strikes Clinched</th>
                    <th>Sig Strikes Grounded</th>
                    <th>Sig Strikes Head</th>
                    <th>Sig Strikes Body</th>
                    <th>Sig Strikes Leg</th>
                    <th>Wins by KO/TKO</th>
                    <th>Wins by Decision</th>
                    <th>Wins by Submission</th>
                </tr>
                </thead>
                <tbody>
                {fighters.map((fighter, index) => (
                    <tr key={index}>
                        <td>{fighter.name || 'N/A'}</td>
                        <td>{fighter.nickname || 'N/A'}</td>
                        <td>{fighter.weight_class || 'N/A'}</td>
                        <td>{fighter.wins ?? 0}</td>
                        <td>{fighter.losses ?? 0}</td>
                        <td>{fighter.draws ?? 0}</td>
                        <td>{fighter.place_of_birth || 'N/A'}</td>
                        <td>{fighter.country || 'N/A'}</td>
                        <td>{fighter.knockouts ?? 0}</td>
                        <td>{fighter.submissions ?? 0}</td>
                        <td>{fighter.first_round_finishes ?? 0}</td>
                        <td>{fighter.striking_accuracy ?? 0}</td>
                        <td>{fighter.takedown_accuracy ?? 0}</td>
                        <td>{fighter.sig_str_landed_total ?? 0}</td>
                        <td>{fighter.sig_str_attempted_total ?? 0}</td>
                        <td>{fighter.takedowns_landed_total ?? 0}</td>
                        <td>{fighter.takedowns_attempted_total ?? 0}</td>
                        <td>{fighter.sig_strikes_per_min ?? 0}</td>
                        <td>{fighter.takedowns_avg_per_min ?? 0}</td>
                        <td>{fighter.sig_str_def ?? 0}</td>
                        <td>{fighter.knockdown_avg ?? 0}</td>
                        <td>{fighter.sig_str_absorbed_per_min ?? 0}</td>
                        <td>{fighter.sub_avg_per_min ?? 0}</td>
                        <td>{fighter.takedown_def ?? 0}</td>
                        <td>{fighter.avg_fight_time ?? 0}</td>
                        <td>{fighter.sig_strikes_while_standing ?? 0}</td>
                        <td>{fighter.sig_strikes_while_clinched ?? 0}</td>
                        <td>{fighter.sig_strikes_while_grounded ?? 0}</td>
                        <td>{fighter.sig_strikes_head ?? 0}</td>
                        <td>{fighter.sig_strikes_body ?? 0}</td>
                        <td>{fighter.sig_strikes_leg ?? 0}</td>
                        <td>{fighter.win_by_ko_tko ?? 0}</td>
                        <td>{fighter.win_by_decision ?? 0}</td>
                        <td>{fighter.win_by_submission ?? 0}</td>
                    </tr>
                ))}
                </tbody>
            </table>
        </div>
    );
};

export default FightersTable;

