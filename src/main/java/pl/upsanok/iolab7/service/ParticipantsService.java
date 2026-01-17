package pl.upsanok.iolab7.service;

import java.util.ArrayList;
import java.util.List;
import pl.upsanok.iolab7.UserDto;

public class ParticipantsService {
  private List<String> participants;

  public ParticipantsService(List<String> participants) {
    this.participants = participants;
  }

  public List<UserDto> getParticipants() {
    return participants.stream()
                        .map(UserDto::new)
                        .toList();
  }
}