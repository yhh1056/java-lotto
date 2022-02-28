package lotto.view;

import java.util.Map;
import lotto.domain.LottoTicketDTO;
import lotto.domain.LottoTicketsDTO;
import lotto.domain.Rank;

public class OutputView {

    private static final String LOTTO_COUNT_FORMAT = "개를 구매했습니다.";
    private static final String STATISTICS_GUIDE_MESSAGE = "당첨 통계\n---------";
    private static final String YIELD_FORMAT = "총 수익률은 %.2f입니다.";
    private static final String STATISTICS_FORMAT = " (%d원) - %d개";
    private static final String YIELD_GAIN_MESSAGE = "(기준이 1이기 때문에 결과적으로 이득이라는 의미임)";
    private static final String YIELD_LOSS_MESSAGE = "(기준이 1이기 때문에 결과적으로 손해라는 의미임)";
    private static final int YIELD_STANDARD = 1;

    public static void displayLottoTickets(LottoTicketsDTO lottoTickets) {
        System.out.println(lottoTickets.getLottoTickets().size() + LOTTO_COUNT_FORMAT);
        for (LottoTicketDTO lottoTicket : lottoTickets.getLottoTickets()) {
            System.out.println(lottoTicket.getLottoNumbers().toString());
        }
        System.out.println();
    }

    public static void displayResult(Map<Rank, Integer> statistics, double calculateYield) {
        System.out.println();
        System.out.println(STATISTICS_GUIDE_MESSAGE);
        for (Rank rank : statistics.keySet()) {
            displayStatistics(statistics.get(rank), rank);
        }
        System.out.println(String.format(YIELD_FORMAT, calculateYield) + isLoss(calculateYield));
    }

    private static void displayStatistics(int rankCount, Rank rank) {
        if (rank.getMatchCount() != Rank.MATCH_ZERO_NUMBERS.getMatchCount()) {
            System.out.println(
                    rank.getMatchStatus() + String.format(STATISTICS_FORMAT, rank.getReward(), rankCount));
        }
    }

    private static String isLoss(double calculateYield) {
        if (calculateYield >= YIELD_STANDARD) {
            return YIELD_GAIN_MESSAGE;
        }
        return YIELD_LOSS_MESSAGE;
    }
}
