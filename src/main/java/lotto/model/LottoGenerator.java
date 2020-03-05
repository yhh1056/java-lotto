package lotto.model;

import java.util.List;

public interface LottoGenerator {
    List<LottoTicket> generate(TicketInformation ticketInformation);
}