package pl.upsanok.iolab7.service;

import java.util.List;
import java.util.stream.Collectors;
import pl.upsanok.iolab7.UserDto;

public class ParticipantsService {
    private final List<String> participants;

    public ParticipantsService(List<String> participants) {
        this.participants = participants;
    }

    public List<UserDto> getParticipants() {
        List<UserDto> goodPeople = participants.stream()
                .map(name -> new UserDto(name))
                .collect(Collectors.toList());

        return goodPeople;
    }
}


