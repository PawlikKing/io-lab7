package pl.upsanok.iolab7.service;

import pl.upsanok.iolab7.UserDto;

import java.util.List;

public class ParticipantsService {
    private List<String> participants;

    public ParticipantsService(List<String> participants) {
        this.participants = participants;
    }

    public List<UserDto> getParticipants() {
        return participants.stream()
                .map(UserDto::new) // lub .map(name -> new UserDto(name))
                .toList();
    }
}